package poc.kotlin.list

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ListTests {


    @Test
    fun `lista` (){

        val collection = listOf("A","B","C","D","E","F")

        //collection.subList()

        val sublistOne = collection.subList(0,4)

        val sublistOTwo = collection.subList(0,2)

        Assertions.assertEquals(2,sublistOTwo.size)

    }
}