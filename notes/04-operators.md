# Lesson 04: Operators

## Definition
Operators are special symbols used to perform operations on variables and values (e.g., arithmetic, comparison, logical, assignment).

## Why it is used
To calculate values, compare them, or perform conditional logic.

## Syntax
```kotlin
val sum = a + b // Arithmetic
val isEqual = (a == b) // Comparison
val condition = (a > b && c < d) // Logical
```

## Real-world Analogy
Operators are the dials and levers in a factory: addition merges items, comparison measures weight differences, and logical gates verify if both inputs are active before running.

## Common Mistakes
* Confusing `==` (structural equality) with `===` (referential equality).
* Operator precedence mistakes, such as putting `&&` without grouping parentheses where needed.

## Best Practices
* Use parentheses to make complex operator expressions readable.
* Use shorter assignment operators (e.g., `a += 5` instead of `a = a + 5`).
