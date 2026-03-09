package kisonar.poc.kotlin.app.service.util

import org.springframework.stereotype.Component
import java.time.Clock


@Component
class TimeUtils {

    suspend fun fetchInstant() = Clock.systemUTC().instant()

}