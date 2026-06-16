package com.course.kotlin.lesson05

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a decimal number: ")
    if (scanner.hasNextDouble()) {
        val number = scanner.nextDouble()
        println("Double entered: $number")
    } else {
        println("Invalid double input.")
    }
}
