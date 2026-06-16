package com.course.kotlin.lesson07

fun main() {
    println("Inclusive range (1..5):")
    for (i in 1..5) {
        print("$i ")
    }
    println()
    
    println("Exclusive range (1 until 5):")
    for (i in 1 until 5) {
        print("$i ")
    }
    println()
    
    println("With steps (1..10 step 2):")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
}
