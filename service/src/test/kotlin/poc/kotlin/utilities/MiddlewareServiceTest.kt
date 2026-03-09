package poc.kotlin.utilities

import io.kotest.matchers.shouldBe
import kisonar.poc.kotlin.service.middleware.MiddlewareService
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class MiddlewareServiceTest {

    private val cut = MiddlewareService()

    @Test
    fun `should fetch users`() {
        val users = cut.fetchUsers()

        users.size shouldBe 2
    }

    @Test
    fun `invoke higher order function`()  = runBlocking {
        cut.checkList("traceId") {
            println("block")
        }
    }
}