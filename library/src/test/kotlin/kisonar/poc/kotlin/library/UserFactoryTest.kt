package kisonar.poc.kotlin.library

import io.kotest.matchers.shouldBe
import kisonar.poc.kotlin.library.user.UserFactory
import org.junit.jupiter.api.Test

class UserFactoryTest {

    @Test
    fun `should create users`() {
       val users = UserFactory.getUsers()

       users.size shouldBe 2
    }
}