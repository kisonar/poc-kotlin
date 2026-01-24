plugins {
    id("org.jetbrains.kotlin.jvm")
}


dependencies{
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2") //1.10.2
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.10.2")

    testImplementation ("io.mockk:mockk:1.14.7")
    testImplementation ("io.kotest:kotest-assertions-core-jvm:6.0.7")
    testImplementation ("org.junit.jupiter:junit-jupiter:6.0.2")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")
}