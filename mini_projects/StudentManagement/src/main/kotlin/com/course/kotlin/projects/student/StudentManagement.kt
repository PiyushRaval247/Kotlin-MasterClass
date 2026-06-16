package com.course.kotlin.projects.student

import java.util.Scanner

data class Student(val id: String, val name: String, var grade: Char)

fun main() {
    val scanner = Scanner(System.`in`)
    val students = mutableListOf<Student>()
    
    students.add(Student("S01", "Alice", 'A'))
    students.add(Student("S02", "Bob", 'B'))
    
    while (true) {
        println("\n=== Student Management System ===")
        println("1. Add Student")
        println("2. View All Students")
        println("3. Update Student Grade")
        println("4. Delete Student")
        println("5. Search Student by ID")
        println("6. Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "6") {
            println("Exiting Student Management System.")
            break
        }
        
        scanner.nextLine() // Consume newline
        
        when (choice) {
            "1" -> {
                print("Enter ID: ")
                val id = scanner.nextLine().trim()
                if (students.any { it.id == id }) {
                    println("Error: Student ID already exists.")
                    continue
                }
                print("Enter Name: ")
                val name = scanner.nextLine().trim()
                print("Enter Grade (A/B/C/D/F): ")
                val gradeInput = scanner.next().uppercase().firstOrNull() ?: 'F'
                students.add(Student(id, name, gradeInput))
                println("Student added successfully.")
            }
            "2" -> {
                println("\n--- Student Records ---")
                if (students.isEmpty()) {
                    println("No records found.")
                } else {
                    students.forEach { println("ID: ${it.id} | Name: ${it.name} | Grade: ${it.grade}") }
                }
            }
            "3" -> {
                print("Enter Student ID to update: ")
                val id = scanner.nextLine().trim()
                val student = students.find { it.id == id }
                if (student == null) {
                    println("Student not found.")
                } else {
                    print("Enter New Grade: ")
                    val newGrade = scanner.next().uppercase().firstOrNull() ?: 'F'
                    student.grade = newGrade
                    println("Grade updated successfully.")
                }
            }
            "4" -> {
                print("Enter Student ID to delete: ")
                val id = scanner.nextLine().trim()
                val removed = students.removeIf { it.id == id }
                if (removed) {
                    println("Student removed successfully.")
                } else {
                    println("Student not found.")
                }
            }
            "5" -> {
                print("Enter Student ID to search: ")
                val id = scanner.nextLine().trim()
                val student = students.find { it.id == id }
                if (student != null) {
                    println("Student Found -> Name: ${student.name}, Grade: ${student.grade}")
                } else {
                    println("Student with ID $id not found.")
                }
            }
            else -> println("Invalid option.")
        }
    }
}
