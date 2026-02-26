package kisonar.poc.kotlin.app

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext

@DirtiesContext
@SpringBootTest(properties = ["spring.main.lazy-initialization=false"])
 class SetupIT {
}