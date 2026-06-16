# Lesson 08: Functions

## Definition
Functions are self-contained blocks of code that perform a specific task. They can take inputs (arguments) and return outputs.

## Why it is used
To reuse code, make programs modular, and improve readability.

## Syntax
```kotlin
fun add(a: Int, b: Int): Int {
    return a + b
}
// Single-expression syntax
fun multiply(a: Int, b: Int) = a * b
```

## Real-world Analogy
A microwave: you put in food (arguments), select a mode (function logic), and it outputs cooked food (return value).

## Common Mistakes
* Forgetting to specify the return type when a function returns a value (unless using single-expression functions).
* Modifying parameters directly: Kotlin function parameters are read-only (equivalent to `val`).

## Best Practices
* Default to `Unit` return type if a function doesn't return any value.
* Use named and default arguments to make function calls clear and avoid overloading.
