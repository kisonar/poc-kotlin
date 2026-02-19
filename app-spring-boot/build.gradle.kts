plugins {
    id("org.jetbrains.kotlin.plugin.spring")
}

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
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // mongo
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${springBootVersion}")
    // kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
}