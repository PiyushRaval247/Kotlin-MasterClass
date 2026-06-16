# Lesson 10: Collections

## Definition
Collections store groups of related objects. Kotlin distinguishes between read-only (immutable) and mutable collections (Lists, Sets, Maps).

## Why it is used
To store dynamic, resizable sets of data with varying access strategies.

## Syntax
```kotlin
val list = listOf(1, 2, 3) // Read-only
val mutableList = mutableListOf(1, 2, 3) // Mutable
mutableList.add(4)
```

## Real-world Analogy
A List is like a line of people in order. A Set is like a club: you are either in it or not, and there are no duplicates. A Map is like a dictionary: you look up a word (key) to get its definition (value).

## Common Mistakes
* Reassigning a read-only list variable instead of creating a mutable list.
* Using keys in a Map that are mutable, which can break lookup functionality.

## Best Practices
* Always start with read-only collections (`listOf`, `setOf`, `mapOf`).
* Only use mutable collections when elements must be added, removed, or modified.
