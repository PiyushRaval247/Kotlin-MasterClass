package com.course.kotlin.lesson17

fun main() {
    val square = { x: Int -> x * x }
    println("Square of 5: ${square(5)}")
    
    val greeting: () -> Unit = { println("Hello from Lambda!") }
    greeting()
    
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }
    println("Doubled numbers: $doubled")
}
