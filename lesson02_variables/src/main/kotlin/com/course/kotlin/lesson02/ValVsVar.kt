package com.course.kotlin.lesson02

fun main() {
    val pi = 3.14159 // Read-only
    var radius = 5.0 // Mutable
    
    val area = pi * radius * radius
    println("Area: $area")
    
    radius = 10.0 // Allowed
    val newArea = pi * radius * radius
    println("New Area: $newArea")
}
