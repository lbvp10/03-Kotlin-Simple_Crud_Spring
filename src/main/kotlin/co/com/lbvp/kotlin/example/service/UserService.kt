package co.com.lbvp.kotlin.example.service

import co.com.lbvp.kotlin.example.dto.UserDTO

interface UserService {
    fun findUserById(id: Int): UserDTO
}
