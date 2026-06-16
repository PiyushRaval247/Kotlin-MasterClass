package com.course.kotlin.projects.finalsys

import kotlinx.coroutines.*
import java.io.File
import java.util.Scanner

data class Employee(val id: String, val name: String, val role: String, var salary: Double) {
    fun toCsvLine(): String = "$id,$name,$role,$salary"
    
    companion object {
        fun fromCsvLine(csv: String): Employee? {
            val tokens = csv.split(",")
            if (tokens.size < 4) return null
            return Employee(tokens[0], tokens[1], tokens[2], tokens[3].toDoubleOrNull() ?: 0.0)
        }
    }
}

class PortalManager {
    val employees = mutableMapOf<String, Employee>()
    private val dbFile = File("employees_db.txt")
    
    init {
        loadData()
    }
    
    private fun loadData() {
        if (dbFile.exists()) {
            dbFile.readLines().forEach { line ->
                Employee.fromCsvLine(line)?.let { employees[it.id] = it }
            }
        }
    }
    
    fun saveData() {
        dbFile.writeText("")
        employees.values.forEach { dbFile.appendText(it.toCsvLine() + "\n") }
    }
}

fun main() = runBlocking {
    val scanner = Scanner(System.`in`)
    val portal = PortalManager()
    
    val autoSaveJob = launch(Dispatchers.IO) {
        while (isActive) {
            delay(10000)
            portal.saveData()
        }
    }
    
    println("=== Employee Management Capstone System ===")
    
    while (true) {
        println("\n1. Hire Employee")
        println("2. View All Employees")
        println("3. Fire Employee (Delete)")
        println("4. Modify Salary")
        println("5. Save & Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "5") {
            println("Shutting down portals. Saving all records...")
            portal.saveData()
            autoSaveJob.cancel()
            break
        }
        
        scanner.nextLine()
        
        when (choice) {
            "1" -> {
                print("Enter Employee ID: ")
                val id = scanner.nextLine().trim()
                if (portal.employees.containsKey(id)) {
                    println("Error: Employee ID already registered.")
                    continue
                }
                print("Enter Name: ")
                val name = scanner.nextLine().trim()
                print("Enter Role: ")
                val role = scanner.nextLine().trim()
                print("Enter Base Salary: ")
                val salary = scanner.nextDouble()
                portal.employees[id] = Employee(id, name, role, salary)
                println("Employee $name added.")
            }
            "2" -> {
                println("\n--- Employee Directory ---")
                if (portal.employees.isEmpty()) {
                    println("Directory is empty.")
                } else {
                    portal.employees.values.forEach {
                        println("ID: ${it.id} | Name: ${it.name} | Role: ${it.role} | Salary: $${it.salary}")
                    }
                }
            }
            "3" -> {
                print("Enter Employee ID to delete: ")
                val id = scanner.nextLine().trim()
                if (portal.employees.remove(id) != null) {
                    println("Employee terminated.")
                } else {
                    println("Employee not found.")
                }
            }
            "4" -> {
                print("Enter Employee ID: ")
                val id = scanner.nextLine().trim()
                val emp = portal.employees[id]
                if (emp == null) {
                    println("Employee not found.")
                } else {
                    print("Enter New Salary: ")
                    val newSal = scanner.nextDouble()
                    emp.salary = newSal
                    println("Salary updated.")
                }
            }
            else -> println("Invalid option.")
        }
    }
}
