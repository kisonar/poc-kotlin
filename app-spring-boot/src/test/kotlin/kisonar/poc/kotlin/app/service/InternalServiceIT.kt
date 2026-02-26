package kisonar.poc.kotlin.app.service

import kisonar.poc.kotlin.app.SetupIT
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class InternalServiceIT(@Autowired private val internalService: InternalService) : SetupIT() {

    @Test
    fun `execute test`() {
        internalService.showLog()
    }
}