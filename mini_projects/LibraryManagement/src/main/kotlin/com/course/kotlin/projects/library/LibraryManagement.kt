package com.course.kotlin.projects.library

import java.util.Scanner

data class Book(val isbn: String, val title: String, val author: String, var isBorrowed: Boolean = false)

fun main() {
    val scanner = Scanner(System.`in`)
    val books = mutableListOf(
        Book("111", "Kotlin in Action", "Dmitry Jemerov"),
        Book("222", "Effective Java", "Joshua Bloch")
    )
    
    while (true) {
        println("\n=== Library Management System ===")
        println("1. Add Book")
        println("2. View Catalog")
        println("3. Borrow Book")
        println("4. Return Book")
        println("5. Search Books")
        println("6. Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "6") {
            println("Exiting Library Management.")
            break
        }
        scanner.nextLine()
        
        when (choice) {
            "1" -> {
                print("Enter ISBN: ")
                val isbn = scanner.nextLine().trim()
                print("Enter Title: ")
                val title = scanner.nextLine().trim()
                print("Enter Author: ")
                val author = scanner.nextLine().trim()
                books.add(Book(isbn, title, author))
                println("Book added successfully.")
            }
            "2" -> {
                println("\n--- Library Catalog ---")
                books.forEach { book ->
                    val status = if (book.isBorrowed) "Borrowed" else "Available"
                    println("ISBN: ${book.isbn} | Title: ${book.title} | Author: ${book.author} | Status: $status")
                }
            }
            "3" -> {
                print("Enter ISBN to borrow: ")
                val isbn = scanner.nextLine().trim()
                val book = books.find { it.isbn == isbn }
                if (book == null) {
                    println("Book not found.")
                } else if (book.isBorrowed) {
                    println("Book is already borrowed.")
                } else {
                    book.isBorrowed = true
                    println("You successfully borrowed: ${book.title}")
                }
            }
            "4" -> {
                print("Enter ISBN to return: ")
                val isbn = scanner.nextLine().trim()
                val book = books.find { it.isbn == isbn }
                if (book == null) {
                    println("Book not found.")
                } else if (!book.isBorrowed) {
                    println("Book was not borrowed.")
                } else {
                    book.isBorrowed = false
                    println("You successfully returned: ${book.title}")
                }
            }
            "5" -> {
                print("Enter keyword to search (Title/Author): ")
                val query = scanner.nextLine().lowercase().trim()
                val results = books.filter { it.title.lowercase().contains(query) || it.author.lowercase().contains(query) }
                if (results.isEmpty()) {
                    println("No match found.")
                } else {
                    println("\n--- Search Results ---")
                    results.forEach { println("Title: ${it.title} by ${it.author} [ISBN: ${it.isbn}]") }
                }
            }
            else -> println("Invalid option.")
        }
    }
}
