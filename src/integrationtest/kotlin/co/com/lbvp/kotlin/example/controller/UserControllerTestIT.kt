package co.com.lbvp.kotlin.example.controller


import co.com.lbvp.kotlin.example.dto.UserDTO
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTestIT {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun findUserTest() {
        val result: ResponseEntity<UserDTO> = testRestTemplate
                .getForEntity("/user/1", UserDTO::class.java)

        val response: UserDTO? = result.body;
        assertNotNull(result)
        assertEquals(result.statusCode, HttpStatus.OK)
        assertNotNull(response)
        assertEquals(response?.nombre, "Maria")
        assertEquals(response?.id, 1)
    }
}