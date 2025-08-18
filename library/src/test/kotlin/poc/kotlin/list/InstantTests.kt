package poc.kotlin.list

import org.junit.jupiter.api.Test
import java.time.Instant
import java.time.ZoneOffset

class InstantTests {


    @Test
    fun `instant tests`() {
        val now = Instant.now()
        //println(now)

        val nowUtc =  now.atOffset(ZoneOffset.UTC).toInstant()
       // println(nowUtc)
    }
}