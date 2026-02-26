package kisonar.poc.kotlin.app.rest

import kisonar.poc.kotlin.app.service.InternalService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

const val PATH_INVOKE = "/invoke"

//@RequestMapping("/internal")
@RestController
class RestController(private val internalService: InternalService) {

    @GetMapping(PATH_INVOKE)
    suspend fun invokeService() = internalService.fetchUsersFromMiddleware()
}