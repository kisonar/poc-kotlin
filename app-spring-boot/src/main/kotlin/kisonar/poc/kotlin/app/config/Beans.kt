package kisonar.poc.kotlin.app.config

import kisonar.poc.kotlin.service.middleware.MiddlewareService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Beans {

    @Bean
    fun creatMiddlewareService(): MiddlewareService  = MiddlewareService()
}