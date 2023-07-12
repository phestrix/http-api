package com.example.util


fun String.isValidEmail(): Boolean {
    val regex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")
    return regex.matches(this)
}