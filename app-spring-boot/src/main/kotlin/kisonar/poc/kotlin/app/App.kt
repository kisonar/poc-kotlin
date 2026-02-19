package kisonar.poc.kotlin.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val context = runApplication<Application>(*args)
    Runtime.getRuntime().addShutdownHook(object : Thread() {
        override fun run() {
            context.close()
        }
    })
}