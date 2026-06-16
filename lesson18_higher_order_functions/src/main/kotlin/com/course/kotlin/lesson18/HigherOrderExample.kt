package com.course.kotlin.lesson18

fun executeMath(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val sum = executeMath(10, 5) { a, b -> a + b }
    val product = executeMath(10, 5) { a, b -> a * b }
    
    println("Sum: $sum")
    println("Product: $product")
    
    val list = mutableListOf(1, 2, 3).apply {
        add(4)
        add(5)
    }
    println("Configured List: $list")
}
