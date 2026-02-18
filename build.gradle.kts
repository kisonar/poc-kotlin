plugins {
    id("org.jetbrains.kotlin.jvm")
}


allprojects {

    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform {
        }
    }

    // TODO: https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html




}
