# Lesson 15: Sealed Classes

## Definition
Sealed Classes represent closed class hierarchies where subclasses are restricted. They are like enums but can have instances with different states and properties.

## Why it is used
To model restricted state trees (e.g., UI States: Success, Error, Loading) safely.

## Syntax
```kotlin
sealed class Result
data class Success(val data: String) : Result()
data class Error(val exception: Exception) : Result()
object Loading : Result()
```

## Real-world Analogy
A delivery state: it can be Loading (no details), Success (holds package details), or Error (holds error reasons).

## Common Mistakes
* Creating subclasses outside the same package or module (Kotlin restricts sealed subclasses to compile-time scopes).
* Forgetting that a `when` block evaluating a sealed class must handle all subclasses.

## Best Practices
* Use sealed classes for representing complex states in networks or UIs.
* Leverage exhaustiveness checks in `when` statements to avoid missing state conditions.
