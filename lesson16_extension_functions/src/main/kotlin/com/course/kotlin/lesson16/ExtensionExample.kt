package com.course.kotlin.lesson16

fun String.hasVowels(): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().any { it in vowels }
}

fun Int.isPrime(): Boolean {
    if (this <= 1) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    val testString = "hll"
    println("Does '$testString' have vowels? ${testString.hasVowels()}")
    
    val number = 17
    println("Is $number prime? ${number.isPrime()}")
}
