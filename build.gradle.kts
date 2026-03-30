plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.vanniktech.dependency.graph.generator") version "0.8.0"
    //id("io.github.adityabhaskar.dependencygraph") version "0.1.6" // requires gradle 8
}

allprojects {
    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"
    apply(plugin = "org.jetbrains.kotlin.jvm") // is required by dependencies
    apply(plugin = "com.vanniktech.dependency.graph.generator")

    kotlin {
        jvmToolchain(25)
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        testLogging {
            showStandardStreams = true
            events("passed", "skipped", "failed")
        }
        failFast = true
    }

    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        val springBootVersion = project.extra["kotlinCoroutinesVersion"].toString()
        // kotlin
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${springBootVersion}")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${springBootVersion}")

        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
        testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
        testImplementation("io.mockk:mockk:1.14.9")
        testImplementation("io.kotest:kotest-assertions-core-jvm:6.1.10")
    }
}