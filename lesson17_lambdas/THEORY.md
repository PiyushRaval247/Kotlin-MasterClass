# Lesson 17: Lambdas & Anonymous Functions

## Definition
Lambdas are simple function literals that are not declared but passed immediately as expressions.

## Why it is used
To pass behavior as arguments to other functions, facilitating functional programming paradigms.

## Syntax
```kotlin
val sum = { a: Int, b: Int -> a + b }
val doubleVal: (Int) -> Int = { it * 2 }
```

## Real-world Analogy
A voucher: instead of handing over a finished pizza, you hand over a recipe voucher (lambda) that the chef can execute whenever needed.

## Common Mistakes
* Forgetting the explicit types inside lambdas when compiler inference fails.
* Misusing the implicit variable `it` when nested lambdas lead to shadowing.

## Best Practices
* Use `it` for single parameter lambdas if it remains clear and readable.
* Keep lambdas short; extract to standard functions if they exceed 5 lines.
