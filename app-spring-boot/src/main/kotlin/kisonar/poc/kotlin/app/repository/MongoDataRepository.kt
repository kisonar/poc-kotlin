package kisonar.poc.kotlin.app.repository

import kisonar.poc.kotlin.app.model.UserMongoData
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MongoDataRepository : CoroutineCrudRepository<UserMongoData, String> {
}