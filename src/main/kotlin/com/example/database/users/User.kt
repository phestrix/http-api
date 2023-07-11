package com.example.database.users

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

object Users : Table() {
    private val login = Users.varchar("login", 25)
    private val email = Users.varchar("email", 25)
    private val password = Users.varchar("password", 25)
    private val username = Users.varchar("username", 30)

    fun insert(userDTO: UserDTO) {
        transaction {
            Users.insert {
                it[login] = userDTO.login
                it[email] = userDTO.email ?: ""
                it[password] = userDTO.password
                it[username] = userDTO.username
            }
        }
    }

    fun fetchUser(login: String): UserDTO? {
        return try {
            transaction {
                val userModel = Users.select { Users.login.eq(login) }.single()
                UserDTO(
                    login = userModel[Users.login],
                    password = userModel[password],
                    email = userModel[email],
                    username = userModel[username]
                )
            }
        } catch (e: Exception) {
            null
        }
    }
}