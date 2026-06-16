# Lesson 19: Generics

## Definition
Generics allow classes, interfaces, and methods to take type parameters, enabling type-safe code that works with different types.

## Why it is used
To avoid code duplication (creating separate classes for different types) while ensuring compile-time safety.

## Syntax
```kotlin
class Box<T>(val content: T)
```

## Real-world Analogy
A standard cargo container: it can transport cars, clothes, or toys. The container design remains the same; only the generic content changes.

## Common Mistakes
* Trying to instantiate generic types directly (`T()`).
* Forgetting covariance (`out`) and contravariance (`in`) constraints when sharing lists.

## Best Practices
* Use meaningful type letters (`T` for generic Type, `E` for Element, `K` for Key, `V` for Value).
* Apply type constraints (e.g., `T : Number`) to restrict type inputs.
