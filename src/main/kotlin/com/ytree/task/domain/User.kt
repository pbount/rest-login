package com.ytree.task.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class User(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        val id: Long = -1L,
        val username: String = "",
        val password: String = ""
)