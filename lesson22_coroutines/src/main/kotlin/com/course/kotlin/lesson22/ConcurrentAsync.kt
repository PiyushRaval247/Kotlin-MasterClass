package com.course.kotlin.lesson22

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun fetchDataFromSourceA(): String {
    delay(1500)
    return "Data A"
}

suspend fun fetchDataFromSourceB(): String {
    delay(1000)
    return "Data B"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val resultA = async { fetchDataFromSourceA() }
        val resultB = async { fetchDataFromSourceB() }
        
        println("Combined results: ${resultA.await()} and ${resultB.await()}")
    }
    println("Total execution time: $time ms")
}
