# Lesson 07: Control Flow: Loops

## Definition
Loops are structures that execute a block of code repeatedly while a condition is true or across a range/collection.

## Why it is used
To automate repetitive tasks, iterate through ranges, or process items in collections.

## Syntax
```kotlin
for (i in 1..5) { println(i) }
while (condition) { /* code */ }
do { /* code */ } while (condition)
```

## Real-world Analogy
A treadmill runs (loops) as long as it has power and the time hasn't expired. Or running laps around a track: you complete a set count of laps (for loop) or run until you feel tired (while loop).

## Common Mistakes
* Creating infinite loops by forgetting to increment the control variable in a `while` loop.
* Confusing ranges: `1..5` (inclusive) vs `1 until 5` (exclusive of 5).

## Best Practices
* Use `for` loops when the number of iterations is known.
* Use `break` and `continue` sparingly and add descriptive comments explaining their use.
