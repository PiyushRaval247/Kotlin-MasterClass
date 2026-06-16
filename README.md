# Kotlin Masterclass Course Repository

Welcome to the **Kotlin Masterclass Course**! This repository is a comprehensive learning guide designed for absolute beginners to transition into professional Kotlin programmers. 

It is structured specifically for use in classrooms and for self-paced learning, with runnable code, theory, and hands-on exercises for every single topic.

---

## 🚀 How to Run the Code in Android Studio / IntelliJ IDEA

This repository is built as a multi-module **Gradle Kotlin JVM project** configured with Kotlin 1.9.22 and Java 17.

### Step 1: Open the Project
1. Open **Android Studio** or **IntelliJ IDEA**.
2. Click **File -> Open** (or select **Open** from the welcome screen).
3. Navigate to and select this repository folder (`Kotlin Concepts` or `kotlin-masterclass`).
4. Wait for Gradle to build and sync the project (you will see the indexing process complete in the bottom-right corner).

### Step 2: Run a Lesson Code Example
1. Open any lesson folder (e.g., `lesson02_variables`).
2. Navigate to `src/main/kotlin/com/course/kotlin/lesson02/` and open any Kotlin file containing a `fun main()` (e.g., `VariablesExample.kt`).
3. Click the green play icon (▶️) next to the `fun main()` function or the class declaration.
4. Select **Run 'VariablesExampleKt'**.
5. The execution results will be printed in the **Run** window at the bottom of the IDE.

---

## 📁 Repository Structure

* 📂 **`notes/`**: A central collection of Markdown theory notes for all topics.
* 📂 **`assignments/`**: Direct tasks assigned to students.
* 📂 **`solutions/`**: Exemplary solutions for selected assignments.
* 📂 **`lessonXX_topic/`**: The core modular content:
  * 📄 `THEORY.md`: Definition, syntax, analogies, and best practices.
  * 📄 `PRACTICE.md`: Code challenges graded from Easy to Hard.
  * 📄 `ASSIGNMENT.md`: A real-world console task for hands-on experience.
  * 📄 `INTERVIEW_QUESTIONS.md`: Interview-ready Q&A.
  * 📂 `src/main/kotlin/com/course/kotlin/lessonXX/`: Runnable `.kt` code files demonstrating theory.
* 📂 **`mini_projects/`**: Runnable CLI applications applying multiple lessons together.
* 📂 **`final_project/`**: A larger, production-quality command-line management system.

---

## 📚 Course Modules Overview

1. **Fundamentals**: Setup, Hello World, Variables, Data Types, Operators, Input/Output.
2. **Logic Building**: Conditions (If/Else, When), Loops (For, While, Do-While), Pattern Programs.
3. **Functions**: Function parameters, return types, defaults, named arguments, and single expressions.
4. **Collections**: Arrays, Lists, Sets, Maps (both Immutable and Mutable variations).
5. **Object-Oriented Programming (OOP)**: Classes, Objects, Inheritance, Encapsulation, Polymorphism, Interfaces, and Abstract Classes.
6. **Kotlin Features**: Null Safety, Data Classes, Enums, Sealed Classes, Companion Objects, Extension Functions.
7. **Functional Programming**: Lambdas, Higher-Order Functions, collections operations (`map`, `filter`, `reduce`), scope functions (`let`, `run`, `apply`, `also`).
8. **Advanced Kotlin**: Generics, Exception Handling, File Handling, Coroutines.

---

## 🛠️ Mini Projects
* 🧮 **Calculator**: Standard math operator evaluator with running history.
* 🎓 **Student Management System**: Add/remove students, assign grades, search by ID.
* 🏦 **Banking System**: Simple CLI ledger supporting transactions, validation, and transfers.
* 📖 **Library Management System**: Member loans, inventory check, and search algorithms.
* 💵 **Expense Tracker**: Grouping expenses by categories with monthly budget indicators.
* 📝 **Todo Application**: Checklist application with task priorities and text file save/load.

---

## 🏆 Final Project: Complete Management System
Located in `final_project/CompleteManagementSystem`. This final assessment incorporates Object-Oriented Design, data serialization/deserialization with text-file databases, async auto-saving using Kotlin Coroutines, and strict exception handling.
