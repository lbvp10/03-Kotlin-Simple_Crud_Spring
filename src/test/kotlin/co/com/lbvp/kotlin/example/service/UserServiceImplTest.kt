package co.com.lbvp.kotlin.example.service

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
internal class UserServiceImplTest {

    @InjectMocks
    private lateinit var userService: UserServiceImpl

    @Test
    fun findUserById() {
        val result = userService.findUserById(1);
        Assert.assertEquals(result.nombre,"Maria")
        Assert.assertEquals(result.id,1)
    }
}