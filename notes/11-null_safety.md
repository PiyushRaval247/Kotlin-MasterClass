# Lesson 11: Null Safety

## Definition
Null Safety is a core feature in Kotlin designed to eliminate the risk of NullPointerException (NPE) by differentiating nullable and non-nullable types.

## Why it is used
To make code robust, clean, and avoid crashes caused by accessing references pointing to null.

## Syntax
```kotlin
var nonNull: String = "Hello" // Cannot be null
var nullable: String? = null // Can be null

val length = nullable?.length // Safe Call
val lenOrZero = nullable?.length ?: 0 // Elvis Operator
val forceLen = nullable!!.length // Non-null assertion (Danger!)
```

## Real-world Analogy
Using a safety harness. A non-nullable type is like being strapped in; a nullable type is like having no harness, meaning you must check if a safety net (Elvis/Safe call) is below you before jumping.

## Common Mistakes
* Excessive use of non-null assertions `!!`, which defeats the safety features of Kotlin.
* Not using smart casts effectively.

## Best Practices
* Avoid `!!` unless you are writing tests or are 100% sure it cannot be null.
* Use the Elvis operator `?:` to specify fallback values.
