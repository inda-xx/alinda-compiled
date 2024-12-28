# 🎮 Game Development with Java

Creating a game can be a fun way to learn programming concepts, as it challenges you to think about both logic and design. This week, we will develop a simple game application that includes core functionalities such as player movement, a scoring system, and interactions with enemies. In the process, we'll practice using boolean expressions and operators, while loops, for loops, JShell for quick Java testing, and function overloading.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1abc12345678/edit#slide=id.p)
- Read and complete exercises in:
  - [Module 7: Control Flow](https://qbl.sys.kth.se/sections/dd1337_programming/page/control_flow)
  - [Module 8: Object-Oriented Programming](https://qbl.sys.kth.se/sections/dd1337_programming/page/object_oriented_programming)

### ✅ Learning Goals

By the end of this assignment, you will be proficient in:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java code
* Function overloading

### 🚨 Troubleshooting Guide

If you encounter issues, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) for similar problems.
2. If your issue is unique, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title.
3. Seek help in person from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Collaborate with peers, but don’t share solutions. Always ensure you understand your code and can explain it during evaluation.

### 🏛 Assignment

Let's delve into the assignment by using Java to build a basic game structure with player movements, a scoring system, and enemy interactions. We'll explore loops and boolean logic to manage the game flow.

<details>
<summary> 📚 Boolean Logic and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is either true or false. In Java, boolean expressions are used to make decisions. Logical operators include `&&` (and), `||` (or), and `!` (not), which help you form complex boolean logic. For instance, the expression `playerX != goalX || playerY != goalY` checks if the player is not on the goal's position.

</details>

#### Exercise 1: Boolean Expressions in Game Conditions

In `docs/README.md`, fill the table with the values that these expressions evaluate to:

| Boolean expression            | Value   |
|-------------------------------|---------|
| `playerX < 0`                 |         |
| `score > 100 && lives > 0`    |         |
| `!gameOver`                   |         |
| `enemies.isEmpty() || hasPowerUp` |     |

#### Exercise 2: Player Movement Using `while` Loop

Create a class `Game.java` and implement player movement. Use a `while` loop to read player input for movement, updating the player's position until the game is over.

```java
public class Game {
    int playerX, playerY;
    boolean gameOver = false;

    public void movePlayer() {
        while (!gameOver) {
            // Update playerX and playerY based on input
            // Check for game conditions to set gameOver to true as needed
        }
    }
}
```

<details>
<summary> 📚 The while loop </summary>

A `while` loop executes as long as a specified condition is `true`. For example, `while (!gameOver) { ... }` keeps executing inside the loop until `gameOver` is `true`.

</details>

#### Exercise 3: Implementing a Scoring System with a `for` Loop

Add a scoring mechanism where the score increments over time. Use a `for` loop to simulate the passage of time and increase the score periodically.

```java
public void calculateScore() {
    for (int time = 0; time < 100; time += 1) {
        // Increment score based on the time
        // Challenge: Calculate bonus score when special conditions are met (e.g., time % 10 == 0)
    }
}
```

<details>
<summary> 📚 The for loop </summary>

A `for` loop is useful for repeating a segment a fixed number of times. It automatically handles the loop variable, condition, and how it changes with each iteration.

</details>

#### Exercise 4: Creating Enemies and Interactions

Implement enemy interactions within the game. Use function overloading to define methods handling different scenarios when the player encounters an enemy. Use boolean operators to check interaction conditions.

```java
public class Enemy {
    int enemyX, enemyY;

    public boolean encounter(int playerX, int playerY) {
        return playerX == enemyX && playerY == enemyY;
    }

    public boolean encounter(int playerX, int playerY, boolean hasWeapon) {
        return playerX == enemyX && playerY == enemyY && hasWeapon;
    }
}
```

<details>
<summary> 🤔 Function overloading </summary>

Function overloading allows you to define multiple methods with the same name but different parameters (signature). Here, `encounter` is overloaded to handle different interaction scenarios with or without a weapon.

</details>

#### Exercise 5: Quick Testing with JShell

JShell is a tool to quickly try Java code. Use it to test small snippets of your game logic, such as evaluating score updates or checking boolean conditions.

```bash
jshell Game.java
Game game = new Game();
game.movePlayer();
```

This will assist you in verifying parts of your code dynamically without compiling the whole program.

### 🎯 Conclusion

Through this task, you’ve explored critical programming concepts all while engaging in the fun of game development. You've practiced using loops, boolean logic, and function overloading in Java - skills that are invaluable in software development. Now, see how you can extend this simple game with more features or polish the ones you have already implemented!