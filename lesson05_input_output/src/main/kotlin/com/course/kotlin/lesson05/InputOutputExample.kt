package com.course.kotlin.lesson05

fun main() {
    print("Please enter your name: ")
    val name = readln()
    
    print("Please enter your age: ")
    val age = readln().toIntOrNull() ?: 0
    
    println("Hello, $name! Next year you will be ${age + 1} years old.")
}
