package kisonar.poc.kotlin.library

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MyDataClassTest {

    @Test
    fun `should create instance` () {
        val cut = MyDataClass("name")
        cut.name.shouldBe("name")
        println("should create instance")
    }

    @Test
    fun `bbb fsdfsdfsdf`() {

    }


}