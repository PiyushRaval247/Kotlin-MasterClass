package com.course.kotlin.lesson13

data class User(val id: Int, val name: String, val email: String)

fun main() {
    val user1 = User(1, "Alice", "alice@example.com")
    val user2 = User(1, "Alice", "alice@example.com")
    
    println("User 1: $user1")
    println("Are users equal? ${user1 == user2}")
    
    val user3 = user1.copy(email = "alice.new@example.com")
    println("User 3 (copied with new email): $user3")
    
    val (id, name, email) = user1
    println("Destructured variables: ID=$id, Name=$name, Email=$email")
}
