allprojects {

    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-engine:6.0.2")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.2")
    }
}


