package com.course.kotlin.lesson06

fun main() {
    val dayNumber = 3
    
    val dayName = when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6, 7 -> "Weekend"
        else -> "Invalid Day"
    }
    
    println("Day: $dayName")
}
