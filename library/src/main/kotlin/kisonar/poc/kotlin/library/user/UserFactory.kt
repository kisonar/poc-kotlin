package kisonar.poc.kotlin.library.user

class UserFactory {

    companion object {
        fun getUsers(): List<User> = listOf(
            getUser(1, "name1", 5, "mail1"),
            getUser(2, "name2", 67, "mail2"),
        )

        fun getUser(id: Int, name: String, age: Int, mail: String): User = User(
            id = id, attributes = UserAttributes(
                name = name, age = age, mail = mail
            )
        )
    }
}