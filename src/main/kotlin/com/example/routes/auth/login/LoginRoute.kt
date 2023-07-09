package com.example.routes.auth.login

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        post("/login"){
            val loginController = LoginController(call)
            loginController.performLogIn()
        }
    }
}