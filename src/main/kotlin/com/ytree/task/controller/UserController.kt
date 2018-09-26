package com.ytree.task.controller

import com.ytree.task.domain.User
import com.ytree.task.security.getPassword
import com.ytree.task.security.getUsername
import com.ytree.task.store.UserStore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
        @Autowired
        private val userStore: UserStore
){

    @PostMapping("/login")
    fun login(@RequestBody payload: String): ResponseEntity<HttpStatus>{
        println(payload)

        val user: User = userStore.findByUsername(payload.getUsername()) ?: User(-1L, "", "")

        return if(user.id > 0 && user.password == payload.getPassword() ){
            ResponseEntity.status(HttpStatus.OK).build()
        } else {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }
    }

}