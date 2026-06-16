package com.course.kotlin.projects.banking

import java.util.Scanner

class BankAccount(val accountNumber: String, val holderName: String, var balance: Double) {
    val transactionHistory = mutableListOf<String>()
    
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            transactionHistory.add("Deposited: $$amount")
            println("Deposited $$amount successfully. New Balance: $$balance")
        } else {
            println("Invalid deposit amount.")
        }
    }
    
    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Invalid withdrawal amount.")
        } else if (amount > balance) {
            println("Insufficient balance.")
        } else {
            balance -= amount
            transactionHistory.add("Withdrew: $$amount")
            println("Withdrew $$amount successfully. New Balance: $$balance")
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val accounts = mutableMapOf<String, BankAccount>()
    
    accounts["101"] = BankAccount("101", "John Doe", 500.0)
    
    while (true) {
        println("\n=== Banking System ===")
        println("1. Create Account")
        println("2. Deposit Money")
        println("3. Withdraw Money")
        println("4. Check Balance & History")
        println("5. Exit")
        print("Choice: ")
        
        val choice = scanner.next()
        if (choice == "5") {
            println("Thank you for banking with us.")
            break
        }
        
        scanner.nextLine()
        
        when (choice) {
            "1" -> {
                print("Enter Account Number: ")
                val accNum = scanner.nextLine().trim()
                if (accounts.containsKey(accNum)) {
                    println("Account already exists.")
                    continue
                }
                print("Enter Account Holder Name: ")
                val name = scanner.nextLine().trim()
                print("Enter Initial Deposit: ")
                val initialDeposit = scanner.nextDouble()
                accounts[accNum] = BankAccount(accNum, name, initialDeposit)
                println("Account created successfully for $name.")
            }
            "2" -> {
                print("Enter Account Number: ")
                val accNum = scanner.nextLine().trim()
                val account = accounts[accNum]
                if (account == null) {
                    println("Account not found.")
                } else {
                    print("Enter Deposit Amount: ")
                    val amount = scanner.nextDouble()
                    account.deposit(amount)
                }
            }
            "3" -> {
                print("Enter Account Number: ")
                val accNum = scanner.nextLine().trim()
                val account = accounts[accNum]
                if (account == null) {
                    println("Account not found.")
                } else {
                    print("Enter Withdrawal Amount: ")
                    val amount = scanner.nextDouble()
                    account.withdraw(amount)
                }
            }
            "4" -> {
                print("Enter Account Number: ")
                val accNum = scanner.nextLine().trim()
                val account = accounts[accNum]
                if (account == null) {
                    println("Account not found.")
                } else {
                    println("Account Holder: ${account.holderName}")
                    println("Current Balance: $$" + account.balance)
                    println("Transaction History:")
                    if (account.transactionHistory.isEmpty()) {
                        println(" No transactions yet.")
                    } else {
                        account.transactionHistory.forEach { println(" - $it") }
                    }
                }
            }
            else -> println("Invalid option.")
        }
    }
}
