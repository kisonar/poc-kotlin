package kisonar.poc.kotlin.library

import io.kotest.matchers.shouldBe
import kisonar.poc.kotlin.library.user.User
import kisonar.poc.kotlin.library.user.UserAttributes
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun `should create instance` () {
        val cut = User(1, attributes = UserAttributes(
            name = "name",  age = 4, mail = "mail"
        ))

        cut.attributes.name shouldBe "name"
    }
}