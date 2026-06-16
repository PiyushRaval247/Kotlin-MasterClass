# Lesson 20: Exception Handling

## Definition
Exception handling is the process of responding to runtime errors to prevent application crashes.

## Why it is used
To handle network errors, bad user inputs, or database failures gracefully.

## Syntax
```kotlin
try {
    // Dangerous code
} catch (e: Exception) {
    // Handle error
} finally {
    // Runs always
}
```

## Real-world Analogy
A backup generator: if the main power line (normal code) fails, the generator (catch block) kicks in, and the lights stay on.

## Common Mistakes
* Catching generic `Throwable` instead of specific exceptions (like `NumberFormatException`).
* Forgetting to close resources (use `use` keyword for file actions instead).

## Best Practices
* Use specific catch blocks.
* Do not swallow exceptions without logging them.
