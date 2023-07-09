package com.example.routes.auth.login

import io.ktor.server.application.*
import io.ktor.server.request.*

class LoginController(private val call: ApplicationCall){
    suspend fun performLogIn(){
        val receive = call.receive<LoginReceiveRemote>()
        //TODO same as in register
    }
}