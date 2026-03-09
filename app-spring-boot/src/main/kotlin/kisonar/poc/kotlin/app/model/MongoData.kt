package kisonar.poc.kotlin.app.model

import kisonar.poc.kotlin.library.user.User
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.FieldType.STRING
import org.springframework.data.mongodb.core.mapping.MongoId

const val TME_DATA_COLLECTION_NAME = "UserData"

@CompoundIndex(name = "unique_evseId_vehicleId", def = "{ 'user.attributes.name': 1, 'user.attributes.emial' : 1 }", unique = true)
@Document(collection = TME_DATA_COLLECTION_NAME)
data class MongoData(
    @MongoId(value = STRING)
    val id: String,
    val user: User,
    @Indexed val additionalInfo: String,
)