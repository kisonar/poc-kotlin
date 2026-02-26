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
    implementation(platform("org.springframework.boot:spring-boot-dependencies:${springBootVersion}"))
    // docs
    implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.8.11")
    // rest
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    // monitoring
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-actuator-autoconfigure")
    // metrics
    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
    // JSON
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    // mongo
    // implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:${springBootVersion}")
    // kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    // test
    testImplementation("org.springframework.boot:spring-boot-webflux-test:${springBootVersion}")
    testImplementation("com.ninja-squad:springmockk:4.0.2")
    //testImplementation("io.kotest:kotest-assertions-json:6.1.3")
    //testImplementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.21.+")
    //testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.21.+")
    testImplementation("org.skyscreamer:jsonassert:1.5.3")
}

tasks.withType<Test> {
    useJUnitPlatform {
        ignoreFailures = false /* true continue even there are test failures*/
        failFast = true
    }
    //filter { includeTestsMatching("*IT") }
    testLogging {
        showStandardStreams = true
        events("passed", "skipped", "failed")
    }
    failFast = true
}

dockerCompose {
     isRequiredBy(project.tasks.test)
     useComposeFiles = listOf("./docker-compose.yml")
}