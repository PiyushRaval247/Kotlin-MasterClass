package com.course.kotlin.projects.calculator

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val history = mutableListOf<String>()
    println("=== Kotlin Console Calculator ===")

    while (true) {
        println("\nSelect Operation:")
        println("1. Add (+)")
        println("2. Subtract (-)")
        println("3. Multiply (*)")
        println("4. Divide (/)")
        println("5. Modulo (%)")
        println("6. Show History")
        println("7. Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "7") {
            println("Exiting. Thank you for using Calculator!")
            break
        }
        
        if (choice == "6") {
            println("\n--- Calculation History ---")
            if (history.isEmpty()) {
                println("No history recorded yet.")
            } else {
                history.forEach { println(it) }
            }
            continue
        }
        
        if (choice !in listOf("1", "2", "3", "4", "5")) {
            println("Invalid selection. Try again.")
            continue
        }
        
        try {
            print("Enter first number: ")
            val num1 = scanner.nextDouble()
            print("Enter second number: ")
            val num2 = scanner.nextDouble()
            
            val result = when (choice) {
                "1" -> {
                    val r = num1 + num2
                    history.add("$num1 + $num2 = $r")
                    r
                }
                "2" -> {
                    val r = num1 - num2
                    history.add("$num1 - $num2 = $r")
                    r
                }
                "3" -> {
                    val r = num1 * num2
                    history.add("$num1 * $num2 = $r")
                    r
                }
                "4" -> {
                    if (num2 == 0.0) throw ArithmeticException("Division by zero is not allowed.")
                    val r = num1 / num2
                    history.add("$num1 / $num2 = $r")
                    r
                }
                "5" -> {
                    val r = num1 % num2
                    history.add("$num1 % $num2 = $r")
                    r
                }
                else -> 0.0
            }
            println("Result: $result")
        } catch (e: Exception) {
            println("Error: ${e.message ?: "Invalid Input"}")
            scanner.nextLine() // Clear scanner buffer
        }
    }
}
