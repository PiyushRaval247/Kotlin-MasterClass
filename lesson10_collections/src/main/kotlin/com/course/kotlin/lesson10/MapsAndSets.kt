package com.course.kotlin.lesson10

fun main() {
    val numberSet = setOf(1, 2, 2, 3, 3)
    println("Set size (should be 3): ${numberSet.size}")
    
    val capitals = mapOf("US" to "Washington", "FR" to "Paris")
    println("Capital of FR: ${capitals["FR"]}")
    println("Capital of DE: ${capitals.getOrDefault("DE", "Not found")}")
}
