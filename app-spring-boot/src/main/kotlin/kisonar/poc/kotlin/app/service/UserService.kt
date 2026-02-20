package kisonar.poc.kotlin.app.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

private val LOG = LoggerFactory.getLogger(UserService::class.java)

@Service
class UserService {

    fun showLog() {
        LOG.info("User service log")
    }
}