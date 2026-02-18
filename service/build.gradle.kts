plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    api (project(":library"))

    testImplementation ("org.junit.jupiter:junit-jupiter:6.0.3")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")

}