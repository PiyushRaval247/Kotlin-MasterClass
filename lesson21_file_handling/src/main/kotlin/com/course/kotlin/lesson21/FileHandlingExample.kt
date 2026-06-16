package com.course.kotlin.lesson21

import java.io.File

fun main() {
    val file = File("example_log.txt")
    
    file.writeText("Log Entry 1: System initiated.\n")
    file.appendText("Log Entry 2: Connection verified.\n")
    
    if (file.exists()) {
        println("Reading entire file content:")
        println(file.readText())
    }
    
    file.delete()
}
