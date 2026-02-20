package kisonar.poc.kotlin.app.service

import org.springframework.stereotype.Service

@Service
class TaskService {

    suspend fun invoke() {
        println("TaskService invoked")
    }
}