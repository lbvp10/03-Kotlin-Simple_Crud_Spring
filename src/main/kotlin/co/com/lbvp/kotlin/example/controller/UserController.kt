package co.com.lbvp.kotlin.example.controller

import co.com.lbvp.kotlin.example.dto.UserDTO
import co.com.lbvp.kotlin.example.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/{id}")
    fun findUser(@PathVariable("id") id: Int): UserDTO = userService.findUserById(id)

}

