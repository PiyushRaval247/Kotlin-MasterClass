package com.course.kotlin.lesson12

open class Vehicle(val brand: String, val maxSpeed: Int) {
    open fun start() {
        println("$brand is starting...")
    }
}

class Car(brand: String, maxSpeed: Int, val doors: Int) : Vehicle(brand, maxSpeed) {
    override fun start() {
        println("$brand Car is starting with standard engine sounds...")
    }
    
    fun honk() {
        println("Beep Beep!")
    }
}

fun main() {
    val myCar = Car("Toyota", 180, 4)
    myCar.start()
    myCar.honk()
}
