package kisonar.poc.kotlin.app.service

import kotlinx.coroutines.*
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val LOG = LoggerFactory.getLogger(TaskService::class.java)

@Service
class TaskService {

    private val supervisorJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.IO + supervisorJob)

    suspend fun invokeAsyncProcessingTask() {
        for (element in 1..50) {
            LOG.info("Launching task $element")
            scope.launch { executeRequest(element) }
        }
    }

    private suspend fun executeRequest(value: Int) {
        try {
            LOG.info("Executing request $value")
            delay(20)
            LOG.info("Executing request $value done")

        } catch (e: Exception) {
            LOG.error("Error executing request", e)
        }
    }

    suspend fun cleanup() {
        LOG.info("Cleaning up children")
        supervisorJob.children.forEach {
            try {
                it.join()
                //LOG.info("Child $it joined")
            } catch (e: Exception) {
                LOG.error("Error executing request", e)
            }
        }
        LOG.info("Cleaning up children done")
        supervisorJob.cancelAndJoin()
        LOG.info("Cleaning up supervizor job")
    }
}