package kisonar.poc.kotlin.app.rest


import kisonar.poc.kotlin.app.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController

const val PATH_USERS = "/users"

@RequestMapping(PATH_USERS)
@RestController()
class UserController( @param:Autowired private val userService: UserService)  {

    @GetMapping()
    suspend fun fetchUsers() = userService.fetchUsers()

}