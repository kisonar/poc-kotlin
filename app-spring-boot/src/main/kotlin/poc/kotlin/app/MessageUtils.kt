/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package poc.kotlin.app

import poc.kotlin.utilities.SimpleService

class MessageUtils {
    companion object {
        fun getMessage(): String = "Hello      World!"
    }

    fun checkService() {
        val service = SimpleService()
        service.checkList()
    }
}