plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":library"))

    testImplementation ("org.junit.jupiter:junit-jupiter:6.0.2")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")

}