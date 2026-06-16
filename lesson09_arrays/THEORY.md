# Lesson 09: Arrays

## Definition
Arrays are sequential structures that store a fixed number of values of the same type in a single variable.

## Why it is used
To hold a collection of elements that can be accessed by indices.

## Syntax
```kotlin
val numbers = arrayOf(1, 2, 3)
val emptyArray = arrayOfNulls<String>(5)
```

## Real-world Analogy
A pill organizer box with numbered slots for each day of the week: each slot holds an item, and you access it by index (0 for Monday, etc.).

## Common Mistakes
* Trying to add elements beyond the fixed size of the array.
* Out-of-bounds index errors (attempting to access an index equal to or greater than the array size).

## Best Practices
* Use standard arrays when the list size is fixed and known.
* Prefer typed array functions like `intArrayOf()`, `doubleArrayOf()` to avoid boxing overhead.
