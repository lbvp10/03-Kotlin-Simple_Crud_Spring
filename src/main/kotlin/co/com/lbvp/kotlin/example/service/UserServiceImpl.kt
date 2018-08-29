package co.com.lbvp.kotlin.example.service

import co.com.lbvp.kotlin.example.dto.UserDTO
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun findUserById(id: Int): UserDTO = UserDTO(1, "Maria")
}