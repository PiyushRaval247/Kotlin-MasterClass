package com.course.kotlin.projects.todo

import java.io.File
import java.util.Scanner

data class TodoTask(val title: String, var isCompleted: Boolean = false) {
    fun toFileString(): String = "$title|$isCompleted"
    companion object {
        fun fromFileString(str: String): TodoTask? {
            val parts = str.split("|")
            if (parts.size < 2) return null
            return TodoTask(parts[0], parts[1].toBoolean())
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val tasksFile = File("tasks.txt")
    val tasks = mutableListOf<TodoTask>()
    
    if (tasksFile.exists()) {
        tasksFile.readLines().forEach { line ->
            TodoTask.fromFileString(line)?.let { tasks.add(it) }
        }
    }
    
    while (true) {
        println("\n=== Todo Application ===")
        println("1. Add Task")
        println("2. View Tasks")
        println("3. Mark Task Complete")
        println("4. Delete Task")
        println("5. Save & Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "5") {
            tasksFile.writeText("")
            tasks.forEach { tasksFile.appendText(it.toFileString() + "\n") }
            println("Tasks saved. Goodbye!")
            break
        }
        scanner.nextLine()
        
        when (choice) {
            "1" -> {
                print("Enter Task Title: ")
                val title = scanner.nextLine().trim()
                if (title.isNotEmpty()) {
                    tasks.add(TodoTask(title))
                    println("Task added.")
                }
            }
            "2" -> {
                println("\n--- Todo Checklist ---")
                if (tasks.isEmpty()) {
                    println("No tasks found.")
                } else {
                    tasks.forEachIndexed { i, task ->
                        val check = if (task.isCompleted) "[X]" else "[ ]"
                        println("${i + 1}. $check ${task.title}")
                    }
                }
            }
            "3" -> {
                print("Enter Task number to complete: ")
                val num = scanner.nextInt()
                if (num in 1..tasks.size) {
                    tasks[num - 1].isCompleted = true
                    println("Task marked complete.")
                } else {
                    println("Invalid task number.")
                }
            }
            "4" -> {
                print("Enter Task number to delete: ")
                val num = scanner.nextInt()
                if (num in 1..tasks.size) {
                    tasks.removeAt(num - 1)
                    println("Task deleted.")
                } else {
                    println("Invalid task number.")
                }
            }
            else -> println("Invalid option.")
        }
    }
}
