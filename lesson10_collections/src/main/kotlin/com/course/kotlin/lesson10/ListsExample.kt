package com.course.kotlin.lesson10

fun main() {
    val readOnlyList = listOf("Kotlin", "Java", "Swift")
    println("Read-only List: $readOnlyList")
    
    val mutableList = mutableListOf<String>()
    mutableList.add("Python")
    mutableList.add("TypeScript")
    mutableList.add("Go")
    
    println("Mutable List before remove: $mutableList")
    mutableList.remove("TypeScript")
    println("Mutable List after remove: $mutableList")
}
