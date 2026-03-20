package kisonar.poc.kotlin.library.user

class UserFactory {

    companion object {
        fun getUsers(): List<User> = listOf(
            getUser(1, "name1", 45, "mail1@mail"),
            getUser(2, "name2", 67, "mail2@mail"),
        )

        fun getUser(id: Int, name: String, age: Int, mail: String): User = User(
            id = id, attributes = UserAttributes(
                name = name, age = age, mail = mail
            )
        )
    }
}