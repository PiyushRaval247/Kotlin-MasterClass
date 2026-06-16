# Lesson 21: Interview Questions

## Beginner Questions
* **Q**: How do you write text to a file in Kotlin?
  **A**: Using the `.writeText()` extension function on a `File` object.

## Intermediate Questions
* **Q**: Why is `useLines()` preferred over `readText()` for large files?
  **A**: `readText()` loads the entire file into memory at once, which can cause out-of-memory errors on large files, whereas `useLines()` processes lines lazily one by one.
