package com.ytree.task.store

import com.ytree.task.domain.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener


@Component
class SampleData(
        @Autowired
        var userStore : UserStore
){

    @EventListener(ApplicationReadyEvent::class)
    fun doSomethingAfterStartup() {
        addData()
    }

    fun addData(){
        userStore.save(User(1L, "paul", "qwerty"))
        userStore.save(User(2L, "james", "asdfgh"))
        userStore.save(User(3L, "Kris", "zxcvbn"))
        userStore.save(User(4L, "Anne", "poiuyt"))
        userStore.save(User(5L, "Mike", "lkjhgf"))
    }

}