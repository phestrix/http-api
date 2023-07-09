package com.example.routes.auth.register

import com.example.util.isValidEmail
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*

class RegisterController(private val call: ApplicationCall) {
    suspend fun registerNewUser(){
        val registerReceiveRemote = call.receive<RegisterReceiveRemote>()
        if(!registerReceiveRemote.email.isValidEmail()){
            call.respond(HttpStatusCode.BadRequest, "email is not valid")
        }
        //TODO need to implement database to store users and later implement this part
    }
}