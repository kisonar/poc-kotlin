package kisonar.poc.kotlin.app.rest

import kisonar.poc.kotlin.app.service.InternalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

const val PATH_INVOKE = "/invoke"

@RestController
class RestController(@field:Autowired private val internalService: InternalService) {

    @GetMapping(PATH_INVOKE)
    suspend fun invokeService() = internalService.fetchUsersFromMiddleware()

}