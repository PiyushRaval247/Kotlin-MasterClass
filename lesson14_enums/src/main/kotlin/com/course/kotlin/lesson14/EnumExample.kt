package com.course.kotlin.lesson14

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
    
    fun printRgb() {
        println("RGB value of $name is $rgb")
    }
}

fun main() {
    val selectedColor = Color.GREEN
    println("Selected color: $selectedColor")
    selectedColor.printRgb()
    
    when (selectedColor) {
        Color.RED -> println("Stop")
        Color.GREEN -> println("Go")
        Color.BLUE -> println("Cool down")
    }
}
