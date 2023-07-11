package com.example.util

import java.util.regex.Pattern


fun String.isValidEmail(): Boolean {
    val pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\$")
    val matcher = pattern.matcher(this)
    return matcher.matches()
}