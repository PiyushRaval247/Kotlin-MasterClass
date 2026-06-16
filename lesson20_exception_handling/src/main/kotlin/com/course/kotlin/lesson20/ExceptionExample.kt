package com.course.kotlin.lesson20

class InvalidInputException(msg: String) : Exception(msg)

fun checkAge(age: Int) {
    if (age < 0 || age > 150) {
        throw InvalidInputException("Age must be between 0 and 150")
    }
    println("Age is valid: $age")
}

fun main() {
    try {
        checkAge(200)
    } catch (e: InvalidInputException) {
        println("Custom Error caught: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    } finally {
        println("Validation check complete.")
    }
}
