# Lesson 13: Interview Questions

## Beginner Questions
* **Q**: What keyword is used to declare a data class?
  **A**: The `data` keyword.

## Intermediate Questions
* **Q**: What are the requirements for a class to be declared as a data class in Kotlin?
  **A**: The primary constructor must have at least one parameter, all parameters must be marked as `val` or `var`, data classes cannot be abstract, open, sealed, or inner, and they cannot inherit from other data classes (though they can implement interfaces).
