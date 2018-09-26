package com.ytree.task.security

fun String.getUsername() : String {
    val result = this.split("=", "&")
    return if ( result.size == 4 ){ result[1] } else { "" }
}

fun String.getPassword(): String{
    val result = this.split("=", "&")
    return if ( result.size == 4 ){ result[3] } else { "" }
}

