package com.course.kotlin.lesson08

fun main() {
    val price1 = calculatePrice(100.0)
    val price2 = calculatePrice(100.0, 15.0)
    
    println("Price 1: $price1")
    println("Price 2: $price2")
}

fun calculatePrice(basePrice: Double, discount: Double = 0.0): Double {
    return basePrice - discount
}
