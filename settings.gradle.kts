rootProject.name = "poc-kotlin"
include("library")
//include("service")
//include("app-spring-boot")

pluginManagement {

    val kotlinVersion = extra["kotlinVersion"]
    val springBootVersion = extra["springBootVersion"]


    plugins {
        id("org.jetbrains.kotlin.jvm") version "$kotlinVersion"
        id("org.jetbrains.kotlin.plugin.spring") version "$kotlinVersion"

        id("org.springframework.boot") version "$springBootVersion"
        //id("io.spring.dependency-management") version "1.0.13.RELEASE"
    }
}



