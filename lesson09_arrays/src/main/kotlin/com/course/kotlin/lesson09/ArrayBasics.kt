package com.course.kotlin.lesson09

fun main() {
    val fruits = arrayOf("Apple", "Banana", "Cherry")
    println("First Fruit: ${fruits[0]}")
    
    fruits[1] = "Blueberry"
    println("Modified Fruit: ${fruits[1]}")
    
    println("Array size: ${fruits.size}")
    
    for (fruit in fruits) {
        println("Fruit: $fruit")
    }
}
