# Simple Mario-themed Game

### 🏃 Preparation

- Review Java fundamental concepts, especially those related to object-oriented programming and game development basics.
- Go through the following sections in Java Documentation:
  - [Boolean expressions and operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
  - [Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
  - [Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
  - [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)
  - [Function overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

### 🎯 Learning Goals

This task aims to incorporate the following programming concepts:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to test your Java programming skills
* Function overloading

### 📋 Assignment Overview

In this task, you will create a simple Java-based game application with a Mario-themed twist. The application will include functionalities like player movement, a scoring system, and dynamic interactions with enemies. Here's how you'll accomplish this:

### 📘 Detailed Steps

#### Preliminary Game Setup

1. 🕹️ **Create the Game Skeleton:**
   - Start by defining basic classes: `Game`, `Player`, `Enemy`, and `Main`.
   - Use boolean variables to track game states, such as whether the game is running or paused.

2. 🔄 **Welcome to JShell:**
   - Use JShell to quickly test and validate game logic snippets before implementing them in your game classes.
   - Explore variables, expressions, and simple methods interactively in a live environment.

#### Exercise 1: Player Movement with `while` Loops

1. 🧑‍🏭 **Player Class Design:**
   - Create fields for player's position and speed.
   - Develop methods to move the player left or right using `while` loops, ensuring the player doesn’t go out of bounds.
  
2. 🔄 **Implementation:**
   - Inside the `moveRight()` and `moveLeft()` methods, use `while` loops to continuously update the player's position until a boolean condition (like `isMovingRight`) is false.

#### Exercise 2: Scoring System with `for` Loops

1. 📈 **Track the Score:**
   - Add a score variable in the `Game` class to track player points.
   - Use a `for` loop to calculate scores over multiple steps or levels.

2. 📊 **Implementation:**
   - During each level, iterate through possible points using a `for` loop.
   - Update the score based on player actions, such as collecting coins or defeating enemies.

#### Exercise 3: Enemy Interactions using `boolean` Expressions

1. 👾 **Design Enemies:**
   - Implement the `Enemy` class with fields like position and health.
   - Use boolean expressions to decide whether a player collision with an enemy has occurred.

2. ⚔️ **Interaction Logic:**
   - Use `boolean` conditions within the `Game` class to manage player-enemy interactions. E.g., if an enemy's health reaches zero due to player's actions, remove it from the game.

#### Exercise 4: Function Overloading for Enhanced Gameplay

1. 🔄 **Overload Methods for More Interaction:**
   - Implement function overloading in the `Enemy` class to manage different types of enemy attacks.
   - Create multiple `attack()` methods that vary based on input parameters, such as `attack(int power)` or `attack(String weaponType)`.

#### Exercise 5: Testing and Refining with JShell

1. 🧪 **Refinement:**
   - Regularly test individual parts of your code using JShell.
   - Validate `boolean` expressions, loops, and overloaded functions individually.

2. 🔧 **Iterate and Improve:**
   - Use observations from JShell to adjust game dynamics, enhance the player experience, and debug any issues.

### 👍 Conclusion

By completing this exercise, you will have developed a simple interactive Mario-themed game. The task integrates essential programming constructs such as `boolean` expressions, `while` and `for` loops, function overloading, and real-time testing using JShell. This hands-on activity will enhance your understanding of core Java concepts while adding a creative, gaming twist. Enjoy the process, and remember to test iteratively for the best results!