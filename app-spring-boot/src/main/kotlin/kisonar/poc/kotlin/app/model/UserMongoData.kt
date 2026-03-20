package kisonar.poc.kotlin.app.model

import kisonar.poc.kotlin.library.user.User
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType.STRING
import org.springframework.data.mongodb.core.mapping.MongoId

const val TME_DATA_COLLECTION_NAME = "User"

@CompoundIndex(name = "unique-attributes-name-email", def = "{ 'user.attributes.name': 1, 'user.attributes.mail' : 1 }", unique = true)
@Document(collection = TME_DATA_COLLECTION_NAME)
data class UserMongoData(
    @MongoId(value = STRING)
    val id: String,
    val user: User,
    @Indexed val additionalInfo: String,
)