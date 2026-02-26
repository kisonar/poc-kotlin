package kisonar.poc.kotlin.app.service

import kisonar.poc.kotlin.service.middleware.MiddlewareService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

private val LOG = LoggerFactory.getLogger(InternalService::class.java)

@Service
class InternalService(){   //@Autowired private val middlewareService: MiddlewareService) {

    fun showLog() {
        LOG.info("User service log")
    }

    suspend fun invokeMiddleware() {} // = middlewareService.checkList()
}