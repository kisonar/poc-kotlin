plugins {
    id("org.jetbrains.kotlin.jvm")
}

allprojects {
    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"
    apply(plugin = "org.jetbrains.kotlin.jvm") // is required by dependencies

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
    }

    dependencies {
        val springBootVersion = project.extra["kotlinCoroutinesVersion"].toString()
        // kotlin
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${springBootVersion}")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${springBootVersion}")

        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
        testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
        testImplementation("io.mockk:mockk:1.14.5")
        testImplementation("io.kotest:kotest-assertions-core-jvm:6.1.3")
        testImplementation("io.mockk:mockk:1.14.9")
        testImplementation("io.kotest:kotest-assertions-core-jvm:6.1.4")
    }
}