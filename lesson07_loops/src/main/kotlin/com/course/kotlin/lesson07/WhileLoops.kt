package com.course.kotlin.lesson07

fun main() {
    var count = 5
    println("While loop:")
    while (count > 0) {
        println("Count: $count")
        count--
    }
    
    var index = 0
    println("Do-while loop:")
    do {
        println("Index: $index")
        index++
    } while (index < 3)
}
