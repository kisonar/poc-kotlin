plugins {
    id("org.jetbrains.kotlin.jvm")
}

allprojects {
    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"
    apply(plugin = "org.jetbrains.kotlin.jvm") // is required by dependencies

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
        testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
        testImplementation("io.mockk:mockk:1.14.5")
        testImplementation("io.kotest:kotest-assertions-core-jvm:6.1.3")
    }
}