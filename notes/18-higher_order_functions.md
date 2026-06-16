# Lesson 18: Higher Order & Scope Functions

## Definition
Higher-Order Functions accept functions as parameters or return functions. Scope functions (`let`, `run`, `apply`, `also`, `with`) execute code blocks within the context of an object.

## Why it is used
To write declarative, clean data processing pipelines and initialize configurations elegantly.

## Syntax
```kotlin
fun runOperation(a: Int, action: (Int) -> Int): Int {
    return action(a)
}

val person = Person().apply {
    name = "John"
    age = 30
}
```

## Real-world Analogy
A manager (higher-order function) delegating tasks: they don't do the work themselves, they accept a worker (function argument) to complete the task.

## Common Mistakes
* Confusing `apply` (returns context object) with `let` (returns lambda result).
* Creating unreadable chains of scope functions.

## Best Practices
* Use `let` for checking null safety values.
* Use `apply` for configuring properties of an object during initialization.
