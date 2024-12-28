# 🎮 Simple Game Development with Java

Developing a game is a perfect way to practice iteration and decision-making in programming. In this task, you will create a basic game where a player can move around, interact with enemies, and earn points. This task will dive deep into making use of `boolean` expressions, loops, JShell, and function overloading to craft a functional game.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p)
- Read and answer all questions in:
  - [Module 8: Boolean Logic](https://qbl.sys.kth.se/sections/dd1337_programming/page/boolean_logic)
  - [Module 9: Loops and Their Uses](https://qbl.sys.kth.se/sections/dd1337_programming/page/loops)

### ✅ Learning Objectives

This week's learning objectives:

- `boolean` expressions and operators
- `while` loops
- `for` loops
- Using JShell to test your Java program
- Function overloading

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task _x_: _summary of problem here_"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your classmates **but do not share answers!** Similarly, use of any AI services 🤖 is great to help explain things, **but please do not submit AI-generated solutions** – you must be both responsible for your own solutions and must be able to explain them under examination.

### 🎯 Game Development Assignment

In this assignment, you will implement a simple console-based game in Java where a player navigates a two-dimensional grid, interacts with enemies, and scores points.

<details>
<summary> 📚 Understanding Boolean Expressions and Operators </summary>
<! -- requires a blank space -->

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is a representation of logic having only two values: `true` or `false`. You often use [boolean expressions](https://en.wikipedia.org/wiki/Boolean_expression) in programming to make decisions:
- `x > y` evaluates to `true` if `x` is indeed greater than `y`, otherwise it is `false`.
- `x < y && y < z` uses the "and" operator (`&&`) and evaluates to `true` if both `x < y` and `y < z` are `true`.

Boolean operators such as `&&` (AND), `||` (OR), and `!` (NOT) allow more complex logic to be expressed succinctly.

</details>

### 🏗️ Implementation Steps

#### Exercise 1: Setting Up the Game Environment

- **Create a new class** `Game.java`.
- **Initialize the grid**: Use a `2D` array of characters to represent the grid where the player and enemies move.
- **Define** player and enemy positions using integer variables.
- **Print** the grid to the console so you can visualize player moves.

> **Tip:** Use `boolean` conditions to ensure positions are valid (e.g., not moving outside the grid).

#### Exercise 2: Player Movement Using `while` Loop

- Add a method `public void movePlayer(char direction)` to change the player's position.
- Use a `while` loop to continuously prompt the player for movement until they choose to exit.
- Update the player's position based on input ('W', 'A', 'S', 'D' for directions).

```java
while (isPlaying) {
    System.out.print("Enter move (W/A/S/D to move, Q to quit): ");
    // Read input and update player position
    if (input.equalsIgnoreCase("Q")) {
        isPlaying = false;
    }
    movePlayer(input);
}
```

#### Exercise 3: Scoring System with `for` Loop

- Implement a scoring system. Each time a player reaches a special position on the grid, they score points.
- Use a `for` loop to simulate rounds of scoring based on player's movement.

```java
for (int round = 0; round < maxRounds; round++) {
    // Check for score update
    if (isAtSpecialPosition()) {
        score += points;
    }
}
```

#### Exercise 4: Enemy Interactions and `boolean` Logic

- Add enemy characters that can move on the grid.
- Use `boolean` expressions to determine if the player's new position matches the enemy's position, triggering an interaction (e.g., losing points or health).

```java
if (playerPosition.equals(enemyPosition)) {
    handleEnemyCollision();
}
```

> **Assistant's tip:** Use `JShell` to quickly try out different parts of your game logic. This can save time compared to recompiling the full program.

#### Exercise 5: Function Overloading for Various Game Actions

- Overload move methods to allow multiple types of movements or actions, e.g., `teleportPlayer(int x, int y)` and `movePlayerByOffset(int dx, int dy)`.

```java
public void movePlayerByOffset(int dx, int dy) { 
    // Move player relative to current position
}

public void teleportPlayer(int x, int y) {
    if (isValidPosition(x, y)) {
        playerX = x;
        playerY = y;
    }
}
```

#### Final Task: Game Loop and Display

- Implement the main game loop that displays the grid, updates scores, and manages interactions.
- Be sure to include detailed `println` statements for real-time feedback to the player.

### Wrap-Up

This task challenges you to utilize different logical constructs in Java to create an engaging and functional game. Ensure you have integrated and tested all features to make the game robust. Take note of where `while` and `for` loops can simplify repeated actions and ensure logic is clear through effective use of boolean expressions.

Remember, practice is key. Test your methods individually and as part of the full game. Happy coding! 🎉