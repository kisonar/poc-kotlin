plugins {
    id("org.jetbrains.kotlin.plugin.spring")
    id("com.avast.gradle.docker-compose") version "0.17.21"
    id("org.springframework.boot")
}

apply(plugin = "org.springframework.boot")
apply(plugin = "com.avast.gradle.docker-compose")

dependencies {

    val springBootVersion = project.extra["springBootVersion"].toString()
    implementation(project(":service"))
    // boot dependencies
    implementation( platform ("org.springframework.boot:spring-boot-dependencies:${springBootVersion}"))
    // docs
    implementation ("org.springdoc:springdoc-openapi-starter-webflux-ui:2.8.11")
    // rest
    implementation ("org.springframework.boot:spring-boot-starter-webflux")
    implementation ("org.springframework.boot:spring-boot-starter-validation")
    // monitoring
    implementation ("org.springframework.boot:spring-boot-starter-actuator")
    implementation ("org.springframework.boot:spring-boot-actuator-autoconfigure")
    // metrics
    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
    //JSON
    //implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // mongo
    //implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${springBootVersion}")
    // kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    // test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
