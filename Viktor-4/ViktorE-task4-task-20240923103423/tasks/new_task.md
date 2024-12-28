# 🧑‍💻 Real-World Transaction Processing

In the world of finance and data processing, programs often need to handle a series of repetitive tasks such as transaction processing. Mastering iteration and function overloading is key to building such applications effectively. This week, we'll immerse ourselves in solving real-world challenges involving transactions, using Java's loops and other fundamental constructs.

### 📝 Preparation

- Review the [lecture slides](https://example.com/transaction-lecture-slides) on transaction processing.
- Read and answer all questions in:
  - [Module 5: Working with Loops](https://example.com/module5)
  - [Module 6: Advanced Boolean Logic](https://example.com/module6)

### ✅ Learning Goals

This week's learning goals include:

* Understanding and using `boolean` expressions and operators
* Implementing `while` loops for repeated tasks
* Utilizing `for` loops for controlled iteration
* Trying out Java expressions in JShell for immediate feedback
* Mastering function overloading to handle variations of a task efficiently

### 🚨 Troubleshooting Guide

If you encounter issues, follow these steps: <br/>

1. Check the [posted issues](https://example.com/issues) for similar questions.
2. If unresolved, create a [New Issue](https://example.com/issues/new) with the problem in the title.
3. Ask a TA during dedicated lab sessions. Check your schedule for lab times.

Engage in discussions with your peers, but remember: **do not share solutions!** Similarly, use AI tools for support, **but don't submit AI-generated work** – you'll need to explain your solutions later.

### 🏛 Assignment

In this task, we'll simulate a simplified version of a transaction processor that deals with bank transactions, calculating fees, and managing transaction history. Through this, you'll strengthen your understanding of loops, conditionals, and method overloading.

#### Exercise 1: Boolean Expressions in Transactions

Before diving into loops, solidify your understanding of boolean expressions. In `docs/README.md`, complete the following table by evaluating each expression:

| Boolean Expression            | Value   |
| ----------------------------  | ------- |
| `transactionAmount > 0`       |         |
| `isSuccessful || hasError`    |         |
| `!(isProcessed && isFraud)`   |         |

Test these in [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for confirmation.

#### Exercise 2: Simulating Transactions with `while` Loops

Create a file named `TransactionProcessor.java`. Include a method:

```java
public void processTransactions()
```

This method should use a `while` loop to repeatedly ask for a transaction amount from the user until the user types 'exit'. For each amount, display whether the transaction is allowed (amount > 0) and add it to a session total.

**Tip:** Use `Scanner` for user input.

#### Exercise 3: Calculating Transaction Fees with `for` Loops

In `TransactionProcessor.java`, add a method:

```java
public double calculateFees(double[] transactions)
```

This should use a `for` loop to calculate and return the total fees across all given transactions. Assume a fixed fee of $2 per transaction. Ignore transactions with non-positive amounts.

#### Exercise 4: Method Overloading for Fee Calculation

Extend your `TransactionProcessor` with overloaded methods to handle different cases:

```java
public double calculateFees(double[] transactions, double bonusRate)
public double calculateFees(double[] transactions, int maxTransactions)
```

* The first overload applies a bonus rate (e.g., 0.1 for 10%) to reduce fees of transactions.
* The second limits processing to a maximum number of transactions.

#### Exercise 5: Monitoring Overload Protection with Loops

Implement a method to identify potential transaction overloads:

```java
public boolean detectOverload(int[] transactions)
```

Use a `for` loop to check if any day contains more than a threshold (say, 1000 transactions). Use `boolean` logic to return `true` if an overload is detected.

#### Exercise 6: Real-Time Demonstration with JShell

Ensure your `TransactionProcessor` works by compiling it and running these methods in JShell. Experiment with the overloaded methods, observing different results based on the input params.

```bash
jshell TransactionProcessor.java
TransactionProcessor tp = new TransactionProcessor();
tp.calculateFees(new double[] {100, 200, 0, -10});
```

Provide meaningful outputs to demonstrate understanding and correct usage. By completing this assignment, you'll be prepared to build complex applications requiring robust transaction handling and processing logic.