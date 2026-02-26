package kisonar.poc.kotlin.service.middleware

import kisonar.poc.kotlin.library.user.User
import kisonar.poc.kotlin.library.user.UserFactory

class MiddlewareService {

    fun fetchUsers() : List<User> = UserFactory.getUsers()
}