package kisonar.poc.kotlin.app.service

import kisonar.poc.kotlin.app.model.UserMongoData
import kisonar.poc.kotlin.app.repository.MongoDataRepository
import kisonar.poc.kotlin.service.middleware.MiddlewareService
import kotlinx.coroutines.flow.toList
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

private val LOG = LoggerFactory.getLogger(InternalService::class.java)

@Service
class InternalService(@param:Autowired private val middlewareService: MiddlewareService,
                      @param:Autowired private val mongoDataRepository: MongoDataRepository) {

    fun showLog() {
        LOG.info("User service log")
    }

    suspend fun fetchUsersFromMiddleware()  = middlewareService.fetchMockedUsers()



}