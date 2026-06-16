# Lesson 06: Control Flow: Conditions

## Definition
Conditional expressions (`if`, `else`, `when`) control which path of execution the program takes based on whether boolean expressions are true or false.

## Why it is used
To make decisions and execute specific blocks of code depending on runtime values.

## Syntax
```kotlin
val result = if (a > b) "Greater" else "Smaller"

when (x) {
    1 -> println("One")
    2 -> println("Two")
    else -> println("Other")
}
```

## Real-world Analogy
A fork in the road: if it has a toll, you go right; otherwise, you go left. A traffic light uses a `when` statement: red means stop, yellow means slow down, green means go.

## Common Mistakes
* Using `if` as a statement when it should return a value (not defining the `else` branch).
* Forgetting that `when` when used as an expression must be exhaustive (requiring an `else` branch).

## Best Practices
* Use `when` instead of complex `if-else-if` chains.
* Leverage Kotlin's ability to use `if` and `when` as expressions that return values.
