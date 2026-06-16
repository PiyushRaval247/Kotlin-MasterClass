# Lesson 14: Enum Classes

## Definition
Enum (enumeration) classes are types that represent a predefined set of constants, like directions, states, or days.

## Why it is used
To ensure type safety by restricting a variable to a predefined set of valid options.

## Syntax
```kotlin
enum class Direction { NORTH, SOUTH, EAST, WEST }
```

## Real-world Analogy
A traffic sign showing turning options: you can only turn left, turn right, or go straight.

## Common Mistakes
* Not using a `when` expression to exhaustively check enum states.
* Thinking enums cannot have properties or methods (they can!).

## Best Practices
* Capitalize enum constants.
* Define custom properties and methods inside enums when they need specific metadata (like hex values for colors).
