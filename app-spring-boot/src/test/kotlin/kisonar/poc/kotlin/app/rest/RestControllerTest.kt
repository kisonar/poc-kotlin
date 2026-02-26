package kisonar.poc.kotlin.app.rest

import com.ninjasquad.springmockk.MockkBean
import io.mockk.coEvery
import io.mockk.coVerify
import kisonar.poc.kotlin.app.service.InternalService
import kisonar.poc.kotlin.library.user.UserFactory
import org.intellij.lang.annotations.Language
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.webflux.test.autoconfigure.WebFluxTest
import org.springframework.test.json.JsonCompareMode.STRICT
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.util.UriBuilder

@WebFluxTest(controllers = [RestController::class])
class RestControllerTest(@Autowired val webTestClient: WebTestClient) {

    @MockkBean
    lateinit var internalService: InternalService

    @Test
    fun `invoke rest endpoint`() {
        coEvery { internalService.fetchUsersFromMiddleware() } returns UserFactory.getUsers()
        @Language("json")
        val expectedResponse = """[
              {
                "id":1,
                "attributes":{
                  "age":4,
                  "mail":"mail@mail",
                  "name":"name"}
              },
              {
                "id":2,
                "attributes":{
                  "age":5,
                  "mail":"mail2@mail",
                  "name":"name"
                }
              }
            ]
            """.trimMargin()

        val response = webTestClient
            .get()
            .uri { uriBuilder: UriBuilder ->
                uriBuilder
                    .path(PATH_INVOKE)
                    // .queryParam(para1, evseIds)
                    // .queryParam(para2, DsrType.DSR_READ)
                    .build()
            }.exchange()

        response
            .expectStatus().isOk
            .expectBody()
            .json(expectedResponse, STRICT)
        coVerify { internalService.fetchUsersFromMiddleware() }
    }
}