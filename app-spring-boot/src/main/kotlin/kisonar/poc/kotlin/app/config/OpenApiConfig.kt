package kisonar.poc.kotlin.app.config

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.servers.Server
import org.springframework.context.annotation.Configuration

@Configuration
@OpenAPIDefinition(
    info = Info(title = "Kisonar app spring boot application", version = "1.0"),
    servers = [Server(url = "/", description = "Default Server URL")]
)
class OpenApiConfig