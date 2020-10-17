package ru.ldwx.crm

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @GetMapping("/", "application/json")
    fun getHello() = "Hello world"
}