plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("org.jetbrains.kotlin.plugin.spring")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    // internal
    implementation(project(":service"))
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    // test
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude("org.mockito")
    }
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("io.mockk:mockk:1.13.2")
    testImplementation("com.ninja-squad:springmockk:3.1.1")
}

springBoot {
    buildInfo()
    mainClass.set("com.fortum.hiven.spot.prices.ApplicationKt")
}

tasks.jar {
    enabled = false
}