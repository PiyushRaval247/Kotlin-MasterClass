# Lesson 02: Variables

## Definition
Variables are containers for storing data values. In Kotlin, variables can be declared using either `val` (read-only) or `var` (mutable).

## Why it is used
To store and manipulate data dynamically during program execution.

## Syntax
```kotlin
val readOnly: String = "Cannot change"
var mutable: Int = 10
mutable = 20 // Allowed
```

## Real-world Analogy
`val` is like a locked display case showing an item that cannot be replaced. `var` is like an open shelf where you can swap the items as often as you want.

## Common Mistakes
* Trying to reassign a value to a `val` variable.
* Declaring variables without initializing them when type inference is needed.

## Best Practices
* Default to using `val` for all variables unless they explicitly need to be changed later (immutability first).
