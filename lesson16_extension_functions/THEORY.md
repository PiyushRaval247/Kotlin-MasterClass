# Lesson 16: Extension Functions

## Definition
Extension Functions allow writing new functions for existing classes without inheriting from them or modifying their source code.

## Why it is used
To extend third-party libraries or Java standard classes with cleaner, custom utility functions.

## Syntax
```kotlin
fun String.removeSpaces(): String {
    return this.replace(" ", "")
}
```

## Real-world Analogy
Adding a new specialized tool attachment to an existing power drill. The drill itself doesn't change, but now it has new capabilities.

## Common Mistakes
* Forgetting that extension functions do not actually modify the receiver class (they are resolved statically).
* Trying to access private members of the receiver class (extensions can only access public members).

## Best Practices
* Keep extension functions focused and put them in dedicated helper files.
* Use them to make code read like natural sentences.
