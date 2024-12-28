# Java Programming Task: Data Processing Simulation

A key advantage of programming is the ability to automate tedious tasks and process data efficiently. Let's simulate a simple data processing routine that incorporates elements of boolean expressions, loops, function overloading, and runtime experimentation in JShell.

### 📝 Preparation

- Review the [lecture slides on Java loops and conditionals](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/loop.html).
- Understand how to [use JShell for interactive Java programming](https://docs.oracle.com/en/java/javase/17/docs/specs/jshell/).
- Refresh your knowledge on [function overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html#overloading).

### ✅ Learning Goals

This week's objectives are to familiarize yourself with:

* Boolean expressions and operators.
* Control flow using while loops and for loops.
* Interactive Java testing with JShell.
* The concept and application of function overloading.

### 🚨 Troubleshooting Guide

If you run into issues, consider:

1. Checking this week's [discussion board](https://example.com/discussion-board) for common queries.
2. Posting a new query with a descriptive title if your issue hasn’t been addressed.
3. Bringing your question to a TA during [office hours](https://example.com/office-hours).

Remember, collaboration is encouraged, but sharing exact solutions is not allowed. Leverage AI for conceptual help, but ensure your submissions are your own and you can explain them.

### 🏛 Assignment

To handle iterative data processing in Java, consider using conditions and loops. Here's a structured exercise to practice these concepts.

<details>
<summary> 📚 Boolean Expressions and Loops </summary>

A `boolean` expresses a true or false outcome. It supports operations like `&&` (and), `||` (or), and `!` (not). Use these to establish conditions and control loops.

</details>

#### Exercise 1: Boolean Evaluation

In the `docs/README.md` file, complete this table with the result each boolean expression evaluates to:

| Boolean expression            | Value   |
| ----------------------------- | ------- |
| `5 > 3 && 8 < 10`             |         |
| `7 == 5 || 3 != 3`            |         |
| `!(6 < 7)`                    |         |
| `(3 >= 3) && (false || true)` |         |

Use [JShell](https://docs.oracle.com/en/java/javase/17/docs/specs/jshell/) to explore these expressions interactively.

```bash
jshell> 5 > 3 && 8 < 10
```

#### Exercise 2: Data Processor with While Loop

Create a file `DataProcessor.java` in your `src` folder containing a method:

```java
public void processNumbers()
```

Implement this to process numbers (from 1 to 50):

- Print only the multiples of 5.
- Stop processing if a number greater than 45 and a multiple of 5 is encountered.

Use a while loop and boolean conditions to accomplish this task.

#### Exercise 3: Using For-Loop for Data Aggregation

Add a method:

```java
public int calculateFactorial(int number)
```

This should compute and return the factorial of a given number `number` using a for loop. Test it using various numbers in JShell:

```bash
jshell> int result = new DataProcessor().calculateFactorial(5)
```

#### Exercise 4: Function Overloading for Data Processing

Introduce overloaded methods to handle different data sets:

1. **Method for an array of integers:**

   ```java
   public void processData(int[] data)
   ```

   Iterate over the array, filtering and printing elements greater than a specified threshold using a for loop.

2. **Method for an array and threshold value:**

   ```java
   public void processData(int[] data, int threshold)
   ```

   Enhance the previous method to use a while loop for filtering.

#### Exercise 5: Experimentation with JShell

Try your methods in JShell to see them in action. Here’s how to begin:

```bash
jshell> /open DataProcessor.java
```

Then call the methods:

```bash
jshell> new DataProcessor().processNumbers()
```

And analyze results from your `calculateFactorial` code.

#### Exercise 6: Extending the Task

- Modify **`calculateFactorial()`** to handle negative numbers gracefully.
- Extend the overloaded `processData` methods to also print the sum of filtered numbers.

By developing this hands-on experience, you’ll better understand loops, boolean expressions, and overloading. Remember, practice using JShell interactively will deepen understanding.