package kisonar.poc.kotlin.app.service

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class TaskServiceTest {

    private val cut = TaskService()

    @Test
    fun `should create a task`() = runBlocking {
        cut.invoke()
    }
}