# Lesson 13: Data Classes

## Definition
A Data Class is a class whose main purpose is to hold data. Kotlin automatically generates structural utility functions like `equals()`, `hashCode()`, `toString()`, `copy()`, and `componentN()`.

## Why it is used
To avoid massive boilerplate code compared to Java when creating POJOs (Plain Old Java Objects).

## Syntax
```kotlin
data class User(val name: String, val id: Int)
```

## Real-world Analogy
A driver's license: its only purpose is to store identity data (name, DOB, ID) and it can be easily copied and compared.

## Common Mistakes
* Trying to create a data class without any primary constructor parameter.
* Expecting generated methods to work for properties declared in the class body instead of the primary constructor.

## Best Practices
* Declare properties as `val` in data classes to keep them immutable.
* Use the `.copy()` function to create modified clones of instances.
