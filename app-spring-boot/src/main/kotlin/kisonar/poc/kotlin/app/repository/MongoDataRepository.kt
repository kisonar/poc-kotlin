package kisonar.poc.kotlin.app.repository

import kisonar.poc.kotlin.app.model.UserMongoData
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MongoDataRepository : CoroutineCrudRepository<UserMongoData, String> {
}