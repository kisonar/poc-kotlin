package kisonar.poc.kotlin.app.service

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TaskServiceTest {

    private val cut = TaskService()

    @Disabled("Only locally")
    @Test
    fun `should create a task`() = runBlocking {
        cut.invokeAsyncProcessingTask()
    }
}