package kisonar.poc.kotlin.service.middleware

import kisonar.poc.kotlin.library.user.User
import kisonar.poc.kotlin.library.user.UserFactory

class MiddlewareService {

    fun fetchMockedUsers(): List<User> = UserFactory.getUsers()

    suspend fun checkList(traceId: String, block: suspend () -> Unit) {
        println(traceId)
        block()
    }
}