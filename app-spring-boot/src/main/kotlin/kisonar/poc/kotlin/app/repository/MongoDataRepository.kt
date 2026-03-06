package kisonar.poc.kotlin.app.repository

import kisonar.poc.kotlin.app.model.MongoData
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MongoDataRepository : CoroutineCrudRepository<MongoData, String> {
}