# Lesson 22: Interview Questions

## Beginner Questions
* **Q**: What is a Coroutine?
  **A**: A coroutine is a lightweight thread that runs asynchronously and does not block the underlying system thread.

## Intermediate Questions
* **Q**: What is the difference between `launch` and `async`?
  **A**: `launch` is a fire-and-forget builder that returns a `Job` and does not return a value. `async` returns a `Deferred` which represents a promise to return a value that can be fetched using `.await()`.
