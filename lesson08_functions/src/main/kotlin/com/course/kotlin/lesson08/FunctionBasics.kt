package com.course.kotlin.lesson08

fun main() {
    greetUser("Alice")
    val result = addNumbers(12, 18)
    println("Sum: $result")
    
    // Named arguments
    printProfile(age = 25, name = "Bob")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun printProfile(name: String, age: Int) {
    println("Name: $name, Age: $age")
}
