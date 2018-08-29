package co.com.lbvp.kotlin.example.controller

import co.com.lbvp.kotlin.example.dto.UserDTO
import co.com.lbvp.kotlin.example.service.UserService
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations


class UserControllerTest {

    @InjectMocks
    private lateinit var userController: UserController

    @Mock
    private lateinit var userService: UserService

    @Before
    fun init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    fun findUser() {

        Mockito.`when`(userService.findUserById(Mockito.anyInt())).thenReturn(UserDTO(1, "Luis"))

        val user: UserDTO = userController.findUser(1);

        Assert.assertEquals(user.id, 1)
        Assert.assertEquals(user.nombre, "Luis")
    }
}