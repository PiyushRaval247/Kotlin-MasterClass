package com.course.kotlin.lesson04

fun main() {
    val a = 15
    val b = 4
    
    println("Addition: ${a + b}")
    println("Division: ${a / b.toDouble()}")
    println("Modulo: ${a % b}")
    
    val isGreater = a > b
    println("Is A greater than B? $isGreater")
    
    val andResult = (a > 10) && (b < 5)
    println("Logical AND Result: $andResult")
}
