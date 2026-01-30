allprojects {

    group = "poc.kotlin"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
    // kotlin {
    //    jvmToolchain(17)
    //}
    dependencies {
        /* all projects have JUnit + Mockito activated in compilation & execution*/
        testImplementation ("org.junit.jupiter:junit-jupiter-engine:6.0.2")
        testRuntimeOnly ("org.junit.platform:junit-platform-launcher:6.0.2")
    }
}


