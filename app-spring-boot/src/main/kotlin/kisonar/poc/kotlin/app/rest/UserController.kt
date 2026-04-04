package kisonar.poc.kotlin.app.rest

import kisonar.poc.kotlin.app.model.UserMongoData
import kisonar.poc.kotlin.app.service.UserService
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

const val PATH_USERS = "/users"
const val PATH_FETCH_ALL = "/fetchAll"

@RequestMapping(PATH_USERS)
@RestController()
class UserController(private val userService: UserService) {

    @GetMapping(PATH_FETCH_ALL)
    suspend fun fetchUsers() = userService.fetchUsers()

    @PostMapping
    suspend fun saveUser(@RequestBody user: UserMongoData) = userService.save(user)

    @GetMapping
    suspend fun getUser(@RequestParam id: String) = userService.getUsers(id)
}