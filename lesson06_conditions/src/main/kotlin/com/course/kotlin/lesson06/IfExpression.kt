package com.course.kotlin.lesson06

fun main() {
    val number = -15
    
    // If used as expression
    val status = if (number > 0) {
        "Positive"
    } else if (number < 0) {
        "Negative"
    } else {
        "Zero"
    }
    
    println("The number is $status")
}
