package kisonar.poc.kotlin.library.user

class UserFactory {

    companion object {
        fun getUsers():List<User> =   listOf(
            User(id = 1, attributes = UserAttributes(
                name = "name",  age = 4, mail = "mail@mail"
            )),
            User(id = 2, attributes = UserAttributes(
                name = "name",  age = 5, mail = "mail2@mail"
            ))
        )
    }
}