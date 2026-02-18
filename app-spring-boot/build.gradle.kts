
plugins {
    id("org.jetbrains.kotlin.plugin.spring")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(project(":service"))
}