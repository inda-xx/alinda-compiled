# Banking System

In this assignment, you will develop a simple banking system where users can deposit money, withdraw money, and check their balances. The primary goal is to practice using _boolean expressions and operators_, _while loops_, _for loops_, and _function overloading_.

### 📝 Preparation

Before starting with the task, make sure you've reviewed these essential materials:

- [Lecture slides on Booleans and Loops](https://example.com/booleans-and-loops)
- [JShell documentation](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for exploring Java expressions interactively.

### ✅ Learning Goals

After completing the task, you should be able to:

* Understand and use `boolean` expressions and operators effectively.
* Implement `while` loops to control program flow.
* Use `for` loops for iterating over a set of statements.
* Apply function overloading to offer flexible API methods.
* Use JShell to test Java code snippets interactively.

### 🚨 Troubleshooting Guide

Experiencing issues or having questions? Follow the steps below:

1. Browse this week's [posted issues](https://example.com/post-issues) to see if others encountered the same issue.
2. If not, log a [New Issue](https://example.com/new-issues) with a descriptive title: "Banking System Task: [Problem Summary]".
3. Ask a teaching assistant during [weekly lab hours](https://example.com/weekly-lab).

Remember, discussing with classmates is encouraged, but **do not share answers!** Similarly, while using AI for guidance is acceptable, submitting AI-generated solutions is **not allowed**. You must understand and be able to explain your work.

### 🏦 Assignment

In this assignment, you will create a `BankAccount` class where users can perform basic banking operations like depositing money, withdrawing it, and checking their balance. Here are the tasks:

#### 🚀 Exercise 1: Create the BankAccount class

1. **Create `BankAccount.java`**: 
   
   Define a class `BankAccount` containing the following member variables: `balance`, `accountNumber`, and `isActive` (a `boolean`).

2. **Constructor Overloading:**
   
   Implement two constructors with the following headers:

   ```java
   public BankAccount(int accountNumber)
   ```

   This constructor initializes the account with the given `accountNumber`, sets `balance` to `0`, and `isActive` to `true`.

   ```java
   public BankAccount(int accountNumber, double initialBalance)
   ```

   This constructor initializes the account with the given `accountNumber`, sets `balance` to `initialBalance`, and `isActive` based on whether `initialBalance` is greater than `0`.

3. **Implement `boolean` Expression in a Method:**
   
   Add a method named `isBalancePositive` that returns `true` if the balance is greater than `0`, otherwise `false`.

<details>
<summary> 📚 A Note on Boolean Expressions </summary>

In Java, a boolean expression is a construct that evaluates to `true` or `false`. This is especially helpful for making decisions with `if` statements or controlling loops.

```java
boolean isActive = true;
boolean hasMoney = balance > 0;
```

In the `BankAccount` class, you might use boolean expressions to ensure that operations like withdrawals do not exceed the available balance.

</details>

#### 🔄 Exercise 2: Deposits and Withdrawals using Loops

4. **Using a `while` Loop:**

   Add a method `public void deposit(double amount)` that uses a `while` loop to attempt to deposit a non-negative amount. Silently ignore any deposit attempts with `amount <= 0`. Print the `balance` after a successful deposit.

5. **Using a `for` Loop:**

   Implement `public boolean withdraw(double amount)` that uses a `for` loop to handle multiple withdrawal attempts. Allow up to 3 attempts to withdraw up to `amount`. If successful, return `true`; otherwise, return `false` after all attempts are exhausted.

   Ensure that `balance` never goes below `0`. 

<details>
<summary> 📚 The For Loop </summary>

A `for` loop in Java is often used when the number of iterations is predetermined. It is ideal for tasks like repeating actions a specific number of times.

```java
for (int attempt = 0; attempt < 3; attempt++) {
   // Attempt to withdraw
}
```

In `withdraw(double amount)`, the for loop is designed to allow retry attempts in case of failures.

</details>

#### 🔍 Exercise 3: Advanced Banking Operations

6. **Print Account Details:**

   Override the `toString` method to return a string representation of the account's current state displaying `accountNumber`, `balance` (in two decimal places), and if the account is active or not.

7. **Reactivate Account using `while`:**

   Implement a method `public void reactivateAccount()` that reactivates the account only if the current balance exceeds a set threshold (use `100` as the threshold). Use a `while` loop to attempt increasing the `balance` through a series of deposits until the condition is met.

#### ✨ Bonus: JShell Integration

Use JShell to interactively test and validate your `BankAccount` implementations. Example:
```bash
jshell BankAccount.java
BankAccount account = new BankAccount(12345);
account.deposit(200);
account.withdraw(50);
System.out.println(account);
```

This task is designed to deepen your understanding of using Java loops, boolean expressions, and function overloading in a meaningful programming context, helping you build a structured yet flexible banking system. Good luck! 🚀