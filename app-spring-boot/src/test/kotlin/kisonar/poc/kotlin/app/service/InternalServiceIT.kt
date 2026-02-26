package kisonar.poc.kotlin.app.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext

@DirtiesContext
@SpringBootTest(properties = ["spring.main.lazy-initialization=false"])
class InternalServiceIT(@Autowired private val internalService: InternalService) {

    @Test
    fun `execute test`() {
        internalService.showLog()
    }
}