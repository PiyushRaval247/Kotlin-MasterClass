package com.course.kotlin.lesson03

fun main() {
    val intVal = 100
    // Explicit casting required
    val doubleVal = intVal.toDouble()
    
    println("Integer value: $intVal")
    println("Double representation: $doubleVal")
    
    val piVal = 3.99
    val truncatedPi = piVal.toInt() // 3
    println("Truncated Double to Int: $truncatedPi")
}
