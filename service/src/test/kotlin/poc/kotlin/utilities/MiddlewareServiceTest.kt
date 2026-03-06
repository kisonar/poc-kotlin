package poc.kotlin.utilities

import io.kotest.matchers.shouldBe
import kisonar.poc.kotlin.service.middleware.MiddlewareService
import org.junit.jupiter.api.Test

class MiddlewareServiceTest {

    private val cut = MiddlewareService()

    @Test
    fun `should fetch users`() {
        val users = cut.fetchUsers()

        users.size shouldBe 2
    }
}