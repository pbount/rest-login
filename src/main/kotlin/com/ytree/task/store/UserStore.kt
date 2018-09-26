package com.ytree.task.store

import com.ytree.task.domain.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserStore : CrudRepository<User, Long> {

    fun findByUsername(username: String): User?

}