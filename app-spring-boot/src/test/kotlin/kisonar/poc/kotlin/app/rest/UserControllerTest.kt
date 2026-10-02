package kisonar.poc.kotlin.app.rest

import com.ninjasquad.springmockk.MockkBean
import io.mockk.coEvery
import io.mockk.coVerify
import kisonar.poc.kotlin.app.model.UserMongoData
import kisonar.poc.kotlin.app.service.UserService
import kisonar.poc.kotlin.library.user.UserFactory
import kotlinx.coroutines.runBlocking
import org.intellij.lang.annotations.Language
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.webflux.test.autoconfigure.WebFluxTest
import org.springframework.test.json.JsonCompareMode.STRICT
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.util.UriBuilder

@WebFluxTest(controllers = [UserController::class])
class UserControllerTest(@param:Autowired val webTestClient: WebTestClient) {

    @MockkBean
    lateinit var userService: UserService

    @Test
    fun `find all users `() = runBlocking {
        coEvery { userService.fetchUsers() } returns getMockedUsers()
        @Language("json")
        val expectedResponse = """[
            {
              "id":"1",
              "user":{
                "id":1,
                "attributes":{
                    "name":"name",
                    "mail":"mail@mail",
                    "age":56}
                },
                "additionalInfo":"additionalInfo1"
            }
            ]
            """.trimMargin()

        val response = webTestClient
            .get()
            .uri { uriBuilder: UriBuilder ->
                uriBuilder
                    .path(PATH_USERS + PATH_FETCH_ALL)
                    // .queryParam(para1, evseIds)
                    // .queryParam(para2, DsrType.DSR_READ)
                    .build()
            }.exchange()

        response
            .expectStatus().isOk
            .expectBody()
            .json(expectedResponse, STRICT)
        coVerify { userService.fetchUsers() }
    }

    private fun getMockedUsers(): List<UserMongoData> = listOf(
        UserMongoData(
            "1",
            UserFactory.getUser(id = 1, name = "name", age = 56, "mail@mail"), "additionalInfo1"
        ),
    )
}