# Lesson 05: User Input & Output

## Definition
Input is reading data from the user (usually through terminal console), and Output is writing messages to the console for the user to view.

## Why it is used
To make programs interactive by reacting to what users enter.

## Syntax
```kotlin
println("Enter text:")
val input = readln() // or readLine()
println("You entered: $input")
```

## Real-world Analogy
Input is like sending a letter to a service desk. Output is the representative replying to you.

## Common Mistakes
* Not handling null values when using older `readLine()`.
* Forgetting to cast string inputs to numeric types when calculation is needed (e.g., `readln().toInt()`).

## Best Practices
* Always use `readln()` in modern Kotlin versions instead of `readLine() !!`.
* Prompt the user clearly before waiting for input.
