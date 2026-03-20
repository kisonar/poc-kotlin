package kisonar.poc.kotlin.app.service

import kisonar.poc.kotlin.app.model.UserMongoData
import kisonar.poc.kotlin.app.repository.MongoDataRepository
import kotlinx.coroutines.flow.toList
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService (@field:Autowired private val mongoDataRepository: MongoDataRepository) {

    suspend fun fetchUsers(): List<UserMongoData> = mongoDataRepository.findAll().toList()

    suspend fun save(user: UserMongoData): UserMongoData = mongoDataRepository.save(user)

    suspend fun getUsers(id: String) = mongoDataRepository.findById(id)

}