# Lesson 12: Object Oriented Programming (OOP)

## Definition
OOP is a programming paradigm based on the concept of "objects", which can contain data (fields) and code (methods).

## Why it is used
To model real-world concepts, structure code modularly, and facilitate reuse via inheritance and polymorphism.

## Syntax
```kotlin
open class Animal(val name: String) {
    open fun makeSound() = println("Sound")
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() = println("Bark")
}
```

## Real-world Analogy
A blueprint for a house is a Class. The actual houses built using that blueprint are Objects.

## Common Mistakes
* Forgetting that classes and functions in Kotlin are `closed` (final) by default. You must use the `open` keyword to allow inheritance.
* Overusing inheritance when composition would be cleaner.

## Best Practices
* Encapsulate internal state using private properties.
* Program to interfaces rather than concrete implementations.
