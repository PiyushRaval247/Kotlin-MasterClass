package com.course.kotlin.lesson19

class Box<T>(val item: T) {
    fun getItemDescription(): String {
        return "Box containing: ${item.toString()}"
    }
}

fun <T : Number> sumOfTwo(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun main() {
    val intBox = Box(123)
    val stringBox = Box("Kotlin")
    
    println(intBox.getItemDescription())
    println(stringBox.getItemDescription())
    
    println("Sum of numbers: ${sumOfTwo(10, 5.5)}")
}
