# Lesson 21: File Handling

## Definition
File Handling refers to reading from and writing to files stored on the filesystem.

## Why it is used
To persist application data, save configurations, or load logs.

## Syntax
```kotlin
val file = File("data.txt")
file.writeText("Hello")
val text = file.readText()
```

## Real-world Analogy
Writing notes in a diary: if you close the diary, the notes remain there. When you open it tomorrow, you can read them again.

## Common Mistakes
* Hardcoding absolute paths that don't exist on other machines.
* Doing heavy file operations on the main thread (should use coroutines/background IO).

## Best Practices
* Use relative paths or temporary directories.
* Use Kotlin's extensions like `readLines()` or `useLines()` to read files safely without memory leaks.
