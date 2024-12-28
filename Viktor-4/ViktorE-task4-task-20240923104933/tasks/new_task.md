# Simulating a Simple Banking System

Creating a realistic simulation of a banking system can be an excellent way to explore various Java programming concepts. In this task, you will implement a basic banking system where users can deposit, withdraw, and check balances. You will deepen your understanding of Java essentials such as `boolean` expressions and operators, `while` and `for` loops, function overloading, and how to experiment with your program using JShell.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p)
- Explore this week's topics:
  - [Boolean Expressions and Operators](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html)
  - [While and For Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
  - [Function Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
  - [JShell Basics](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)

### ✅ Learning Goals

This week's learning goals include:

- `boolean` expressions and operators
- `while` loops
- `for` loops
- Using JShell to try your Java program
- Function overloading

### 🚨 Troubleshooting Guide

If you encounter issues while working through this task, follow these steps:

1. Check this week's [discussion board](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others have similar problems.
2. Post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Be sure to include a detailed description beginning with "Task _x_: _summary of problem here_".
3. Don't hesitate to ask a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Verify your schedule for the next lab availability.

Remember, collaboration with classmates is great, but submission must reflect your understanding. Avoid submitting AI-generated solutions.

### 🏛 Assignment

Before starting this task, you need to be familiar with writing methods, understanding loops, and stopping conditions using boolean expressions. This task will guide you through creating a basic banking system simulation, which involves several important Java concepts.

<details>
<summary> 📚 Boolean Expressions and Operators </summary>
A `boolean` expression evaluates to either `true` or `false`. You will use these expressions extensively in controlling the flow of your banking system as conditions for deposits and withdrawals. In Java, `&&` is for "and", `||` is for "or", and `!` is for "not".

Remember:
```java
boolean isValidTransaction = false;
boolean isFundSufficient = true;
boolean isTransactionApproved = isValidTransaction || isFundSufficient;
```
</details>

#### Exercise 1: Create the Banking System

1. **Create a Java Class**: Begin this exercise by creating a `BankAccount.java` file in your project directory.

```java
public class BankAccount {
    // Your code here
}
```

2. **Add Fields**: Use private fields to hold the account information such as account balance, account holder's name, and account number.

3. **Constructor Overloading**:

   - Implement two constructors: `public BankAccount(String accountHolder, int accountNumber)` and `public BankAccount(String accountHolder, int accountNumber, double initialBalance)`.
   - Use the constructor with fewer parameters to initialize the account balance to zero.

   > **Note**: This is where you will introduce function overloading.

#### Exercise 2: Handling Deposits, Withdrawals, and Balances

4. **Boolean Methods**: Implement the following methods:

   - `boolean deposit(double amount)`: Adds funds to the account. Returns `true` if successful, `false` otherwise.
   - `boolean withdraw(double amount)`: Deducts funds from the account. Ensure the account does not go negative; return `true` if successful, `false` otherwise. Use boolean expressions to handle this validation.

5. **Display Balance**: Add a method `public double getBalance()` to return the current balance.

#### Exercise 3: Using Loops

6. **Log Transactions with Loops**:
   
   - Create a private `ArrayList<String>` to store transaction logs.
   - Use a `for` loop to display all transactions.

```java
public void showTransactionHistory() {
    for (String transaction : transactions) {
        System.out.println(transaction);
    }
}
```

7. **Balancing with `while` loop**: Implement a method `public void reachGoalBalance(double goal)` that uses a `while` loop to simulate adding a fixed amount, say $50, to the account until the balance reaches the specified goal.

#### Exercise 4: Validating with JShell

8. **Testing in JShell**:
   
   - Open your terminal, navigate to your Java file location, and run:

```bash
jshell BankAccount.java
```

   - Use JShell to attempt some deposits and withdrawals. Experiment with depositing negative amounts or over-withdrawing to test behavior.

```java
BankAccount myAccount = new BankAccount("Alice", 101);
myAccount.deposit(100);
myAccount.withdraw(150);
myAccount.getBalance();
```

9. **Optional Challenge**: Implement an overloaded method `reachGoalBalance(double goal, double increment)` that allows the user to specify how much they will deposit in each loop iteration. Use a `while` loop to track this manually.

By the end of this task, you should have a comprehensive understanding of designing small simulations using Java, implementing loops, handling method overloading, and running isolated tests in JShell. Good luck, and happy coding!