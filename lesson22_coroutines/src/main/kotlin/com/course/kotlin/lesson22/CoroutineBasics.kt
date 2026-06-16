package com.course.kotlin.lesson22

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts on: ${Thread.currentThread().name}")
    
    launch {
        println("Coroutine task starts on: ${Thread.currentThread().name}")
        delay(1000)
        println("Coroutine task completed.")
    }
    
    println("Main program ends on: ${Thread.currentThread().name}")
}
