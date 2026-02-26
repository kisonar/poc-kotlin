package kisonar.poc.kotlin.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

//@ComponentScan(basePackages = ["kisonar.poc.kotlin.service.middleware"])
@ConfigurationPropertiesScan
@SpringBootApplication
class App

fun main(args: Array<String>) {
    val context = runApplication<App>(*args)
    Runtime.getRuntime().addShutdownHook(object : Thread() {
        override fun run() {
            context.close()
        }
    })
}