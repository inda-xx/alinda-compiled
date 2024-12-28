# Creating Tic Tac Toe

The game of Tic Tac Toe is a classic demonstration of computer programming. Not only does it incorporate fundamental concepts of programming, but it also allows you to apply logic and creativity to solve the problem of designing a game. In this task, we will explore various Java concepts such as boolean expressions, loops (while and for), function overloading, and even using JShell to test your Java code. This will enhance your understanding and push your Java programming skills forward.

### 📝 Preparation

- Review the [lecture slides](https://docs.youruniversity.edu/lecture/on/tic_tac_toe).
- Complete the readings on:
  - [Boolean Logic and Expressions](https://docs.youruniversity.edu/module/boolean_logic)
  - [Java Loops](https://docs.youruniversity.edu/module/java_loops)

### ✅ Learning Goals

This exercise focuses on the following learning goals:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java program
* Function overloading

### 🚨 Troubleshooting Guide

If you face any challenges during the exercise, follow these steps:

1. Check the [posted issues](https://youruniversity.git/issues) for common problems and solutions.
2. Post your question as a [New Issue](https://youruniversity.git/issues/new) if you don't find any references to it, prefix with "Tic Tac Toe: _summary of problem here_".
3. Join the discussion during [weekly labs](https://youruniversity.schedule/labs) with a TA.

Discussing with peers is encouraged, but remember to solve the tasks independently. Avoid sharing direct answers or using AI-generated solutions. You need to understand and explain your solutions.

### 🎮 Assignment

Let's start building Tic Tac Toe! Before diving into backend logic, we need to understand some basic concepts necessary for implementing turns, evaluating board conditions, and eventually declaring a winner.

<details>
<summary> 📊 Boolean Values and Expressions </summary>

In many programming tasks, we need to check certain conditions — this is where boolean expressions come into play:

- A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) can be either true or false.
- A boolean expression evaluates to true or false and controls flow like whether a player has won in Tic Tac Toe.

In Java, expressions like `a == b`, `x || y`, and `!z` help control logical flow inside the game logic.
</details>

#### Exercise 1: Board Setup and Validation

1. Create a Java class named `TicTacToe`.
2. Define a 3x3 char array `board` to represent the game board, initialized to spaces `' '`.
3. Develop the method `boolean isValidMove(int row, int col)` using boolean expressions to verify if the cell specified by `row` and `col` is empty and within range.
4. Test your logic using JShell. Print the validity of potential moves for different positions after starting.

> **Assistant's Tip:** Use logical operators such as `&&`, `||` to form complex expressions, evaluating if `row` and `col` are within bounds. Remember to write tests using JShell for quick checks!

#### Exercise 2: Implementing Turns and Loops

1. Add a `boolean makeMove(char player, int row, int col)` method, which places `player`'s token ('X' or 'O') on the board if the move is valid and toggles the turn.
2. Use a `while` loop to keep the game running, prompting players for moves until the game ends (when there's a win or draw).
3. Within your loop, call `makeMove` and ensure it only attempts the move if it's valid.

```java
while (!isGameFinished) {
    // Prompt player for move
    // Call makeMove to place token
    // Check for winner or draw
}
```

> **Assistant's Tip:** Incorporate `while` loops to maintain game flow, taking care to update game states and conditions. Remember, you can debug issues using JShell demonstrations!

#### Exercise 3: Checking for a Winner

1. Develop an overloaded method `boolean checkWinner()` which checks the board for any winning combination.
   - Optionally, enhance with `boolean checkWinner(char player)` if separating logic for each player proves cleaner.
2. Utilize `for` loops to check for winning rows, columns, and diagonals.
3. Use boolean conditions to return true if there exists any filled line of a player's markers.

> **Assistant's Note:** Function overloading allows flexibility in calling functions with diverse parameter lists, letting you concentrate on checking conditions seamlessly.

#### Exercise 4: Printing the Board

1. Add a method `void printBoard()` to display the board on console, keeping the user interface updated with the current game state.
2. Use `for` loops to iterate the 2D array structure.

```java
for (int i = 0; i < 3; i++) {
    // nested loop for each column
}
```

> **Assistant's Tip:** Print readability is essential; use consistent spacing and borders for clarity. Try and test console output in JShell to refine appearance.

### 🏆 Expansion Challenge: Automated Testing with JShell

Extend your JShell experimentation by writing scripted interactions in a `.jsh` file to automate board tests scenarios. Explore how these tests validate each function written progressively, ensuring all logic is sound!

By the end of this assignment, you will have not only implemented the game logic but also learned valuable Java structures and concepts essential for procedural game development.