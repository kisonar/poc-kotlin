package kisonar.poc.kotlin.app.service

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val LOG = LoggerFactory.getLogger(TaskService::class.java)

@Service
class TaskService {

    private val supervisorJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.IO + supervisorJob)

    suspend fun invokeAsyncProcessingTask() {
        for (element in 1 .. 100 ) {
            LOG.info("Invoking processing task")
            scope.launch { executeRequest(element)  }
        }
    }

    private suspend fun executeRequest(value: Int ) {
        try {
            delay(value.toLong())
            LOG.info("Executing request")

        } catch (e: Exception) {
            LOG.error("Error executing request", e)
        }
    }
}