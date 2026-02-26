package kisonar.poc.kotlin.app.rest

import kisonar.poc.kotlin.app.service.InternalService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//@RequestMapping("/internal")
@RestController
class RestController(private val internalService: InternalService) {

    @GetMapping("/invoke")
    suspend fun invokeService() = internalService.invokeMiddleware()
}