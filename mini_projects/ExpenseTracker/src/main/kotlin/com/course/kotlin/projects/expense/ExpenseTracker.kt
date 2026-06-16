package com.course.kotlin.projects.expense

import java.util.Scanner

data class Expense(val amount: Double, val category: String, val description: String)

fun main() {
    val scanner = Scanner(System.`in`)
    val expenses = mutableListOf<Expense>()
    val monthlyBudget = 1000.0
    
    expenses.add(Expense(50.0, "Food", "Groceries"))
    expenses.add(Expense(120.0, "Transport", "Monthly Train Pass"))
    
    while (true) {
        println("\n=== Personal Expense Tracker ===")
        println("1. Log an Expense")
        println("2. View All Expenses")
        println("3. View Category Summary")
        println("4. Check Budget Status")
        println("5. Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "5") {
            println("Exiting Expense Tracker.")
            break
        }
        scanner.nextLine()
        
        when (choice) {
            "1" -> {
                print("Enter Amount: ")
                val amount = scanner.nextDouble()
                scanner.nextLine()
                print("Enter Category (e.g. Food, Bills, Fun): ")
                val cat = scanner.nextLine().trim()
                print("Enter Description: ")
                val desc = scanner.nextLine().trim()
                expenses.add(Expense(amount, cat, desc))
                println("Expense logged successfully.")
            }
            "2" -> {
                println("\n--- Expenses Log ---")
                expenses.forEach { println("$$" + "${it.amount} in ${it.category} (${it.description})") }
            }
            "3" -> {
                println("\n--- Category Summary ---")
                val summary = expenses.groupBy { it.category }
                summary.forEach { (cat, list) ->
                    val sum = list.sumOf { it.amount }
                    println("$cat: $$sum")
                }
            }
            "4" -> {
                val totalSpent = expenses.sumOf { it.amount }
                println("Monthly Budget: $$monthlyBudget")
                println("Total Spent: $$totalSpent")
                if (totalSpent > monthlyBudget) {
                    println("WARNING: You are over budget by $$" + (totalSpent - monthlyBudget))
                } else {
                    println("Good job! Remaining budget: $$" + (monthlyBudget - totalSpent))
                }
            }
            else -> println("Invalid option.")
        }
    }
}
