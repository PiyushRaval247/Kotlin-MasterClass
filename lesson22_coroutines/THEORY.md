# Lesson 22: Coroutines

## Definition
Coroutines are light-weight threads that compile into state machines, enabling writing asynchronous, non-blocking code sequentially.

## Why it is used
To execute long-running tasks (like database queries or API calls) without freezing the main application UI thread.

## Syntax
```kotlin
GlobalScope.launch {
    delay(1000)
    println("World!")
}
```

## Real-world Analogy
A waiter in a restaurant: instead of standing at a table waiting for the chef to cook the food (blocking), the waiter takes another order and returns when the food is ready (non-blocking).

## Common Mistakes
* Using `GlobalScope` instead of structured scopes (like `CoroutineScope` or `runBlocking`).
* Forgetting that calling a suspend function requires a coroutine scope.

## Best Practices
* Always use structured concurrency.
* Specify appropriate dispatchers (e.g. `Dispatchers.IO` for disk/network actions, `Dispatchers.Default` for CPU-intensive tasks).
