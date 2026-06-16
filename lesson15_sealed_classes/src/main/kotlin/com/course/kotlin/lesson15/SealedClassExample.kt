package com.course.kotlin.lesson15

sealed class UiState {
    object Idle : UiState()
    object Loading : UiState()
    data class Success(val items: List<String>) : UiState()
    data class Failure(val message: String) : UiState()
}

fun renderUi(state: UiState) {
    when (state) {
        is UiState.Idle -> println("System is idle.")
        is UiState.Loading -> println("Loading data... please wait.")
        is UiState.Success -> println("Success! Loaded items: ${state.items}")
        is UiState.Failure -> println("Error occurred: ${state.message}")
    }
}

fun main() {
    renderUi(UiState.Loading)
    renderUi(UiState.Success(listOf("Item 1", "Item 2")))
    renderUi(UiState.Failure("Connection timed out"))
}
