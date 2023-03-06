rootProject.name = "poc-kotlin"
include("library")
include("service")
include("app-spring-boot")

pluginManagement {
    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.6.21"
        id("org.jetbrains.kotlin.plugin.spring") version "1.6.21"
        id("org.springframework.boot") version "2.7.4"
        id("io.spring.dependency-management") version "1.0.13.RELEASE"
    }
}