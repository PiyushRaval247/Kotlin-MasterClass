# Lesson 03: Data Types

## Definition
Kotlin has built-in data types representing numbers (Int, Double, Float, Long, Short, Byte), characters (Char), booleans (Boolean), and strings (String).

## Why it is used
To specify what kind of value a variable holds, defining the operations that can be performed on it.

## Syntax
```kotlin
val age: Int = 20
val price: Double = 99.99
val grade: Char = 'A'
val isActive: Boolean = true
val text: String = "Hello"
```

## Real-world Analogy
Think of data types as sorted boxes in a warehouse: one box size for liquids (floating-point numbers), one box size for books (strings), and a small box for a switch (booleans).

## Common Mistakes
* Confusing characters (`'A'`) with strings (`"A"`).
* Expecting implicit widening conversions (e.g., trying to assign an `Int` directly to a `Double` without explicit casting like `.toDouble()`).

## Best Practices
* Use descriptive string templates (`$var`) instead of string concatenation (`+`).
* Use appropriate numeric sizes (e.g., `Int` for integers, `Double` for precise decimals).
