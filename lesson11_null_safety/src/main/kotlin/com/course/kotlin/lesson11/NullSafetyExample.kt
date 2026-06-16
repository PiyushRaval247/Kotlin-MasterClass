package com.course.kotlin.lesson11

fun main() {
    var name: String = "John"
    
    var nullableName: String? = null
    println("Nullable length (safe call): ${nullableName?.length}")
    
    val length = nullableName?.length ?: -1
    println("Length or -1: $length")
    
    nullableName = "Alice"
    if (nullableName != null) {
        println("Smart cast length: ${nullableName.length}")
    }
}
