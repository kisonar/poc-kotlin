package kisonar.poc.kotlin.app.rest.exception

import org.springframework.http.HttpStatus.NOT_FOUND
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler
    fun handleNoSuchElementException(ex: NoSuchElementException): ResponseEntity<ExceptionData> {
        val errorMessage = ExceptionData(
            NOT_FOUND.value(),
            ex.message
        )
        return ResponseEntity(errorMessage, NOT_FOUND)
    }
}