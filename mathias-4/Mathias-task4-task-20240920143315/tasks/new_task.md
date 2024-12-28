# 🎮 Creating a Simple Game with Java

JShell Edition - An Oasis and Mario Themed Adventure

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p)  
- Examine key Java concepts:  
  - [Boolean Expressions and Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)  
  - [While Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)  
  - [For Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)  
  - Learn how to use [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) to try your Java program  
  - Understand [Function Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

### ✅ Learning Goals

- Mastery of `boolean` expressions and operators
- Implementing logic using `while` loops
- Iterating with `for` loops
- Practicing and testing Java code snippets with JShell
- Exploring function overloading in Java with a creative project

### 🚨 Troubleshooting Guide

If you encounter issues:

1. Check this week's [common queries](https://gits-15.sys.kth.se/inda-24/help/issues) to see if your problem has been discussed.
2. Post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new).
3. Seek assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discussing with peers is encouraged, but sharing exact solutions is not. Use resources wisely, but ensure your own understanding.

### 🎲 Assignment

Your task this week is to create a fun, interactive game simulation using core Java concepts. We're integrating themes from Oasis band members and the classic Mario game. This will allow us to explore boolean logic, loops, and overloading in Java. The focus is on understanding iteration and conditions while having some fun with a creative story!

You will develop a simple text-based game with:

1. **Player Movement**: Move a player character around a grid.
2. **Scoring System**: Add points as players interact with band members.
3. **Enemy Interactions**: Represented as elements inspired by Mario.

<details>
<summary> 📘 Concepts Overview </summary>

#### Boolean Expressions in Game Logic

Boolean expressions control decision-making. Here, determining whether a player can move or interact with an object is crucial. Use operators like `&&`, `||`, and `!` to set these conditions.

#### **Loops in Gameplay**

* `While Loops`: Useful for continuously checking the player's status within the game.
* `For Loops`: Ideal for iterating over grid positions or steps in the game round.

#### Testing with JShell

Quickly test your game logic using JShell for instant feedback without a full class setup.

#### Function Overloading in Java

We'll use it to process different types of player actions or initiate movement.

</details>

#### Exercise 1: Setting Up the Game Grid

Create a `Game.java` file. Implement a 5x5 grid where players and band members (objects with specific positions) are placed. Use a boolean matrix to check positions' availability.

```java
public class Game {
    private boolean[][] grid = new boolean[5][5];
    private int playerX, playerY; // Player coordinates

    public Game() {
        playerX = 0; // Initial player position
        playerY = 0;
        // Populate grid with band members (true - occupied)
        populateGrid();
    }

    private void populateGrid() {
        // Randomly or specifically set positions for "Oasis" band objects and enemies
    }
}
```

#### Exercise 2: Player Movement

Allow the player to move up, down, left, or right within the grid using boolean checks for valid moves.

```java
public boolean movePlayer(String direction) {
    // Check move validity using boolean expressions
    if (isValidMove(direction)) {
        switch(direction) {
            case "up": playerY--; break;
            case "down": playerY++; break;
            case "left": playerX--; break;
            case "right": playerX++; break;
            default: return false;
        }
        return true;
    }
    return false;
}

private boolean isValidMove(String direction) {
    // Implement logic that checks bounds and occupied space
    return ...; // Boolean expression
}
```

#### Exercise 3: While Loop for Game Continuation

Create a loop that continuously allows players to make moves until a certain condition, like victory or reaching a score, is reached.

```java
public void playGame() {
    while (!victoryCondition()) {
        // Print current state
        // Accept player move
        // Update game state
    }
}
```

#### Exercise 4: Using For Loops to Interact with Grid

Use for loops to perform grid checks, such as locating special items or band members, which increases the score.

```java
private void checkForBandMember() {
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] && i == playerX && j == playerY) {
                // Player found a band member position
                increaseScore();
            }
        }
    }
}
```

#### Exercise 5: Function Overloading

Overload a method to process different actions players can take, like `interact()` with varying arguments. Example: interact with int (points), String (message)

```java
public void interact(int points) {
    // Gain points
}

public void interact(String message) {
    // Print interaction message
}
```

#### Exercise 6: Testing with JShell

Try testing individual methods in JShell for functionality assurance.

```bash
jshell Game.java
Game g = new Game();
g.playGame();
// Try individual movement or interaction methods
```

##### Studying and implementing these exercises will help you blend logic, iteration, and creativity using essential Java skills. The end goal is to create a simple yet expressive game experience. Have fun coding your unique spin on player adventures! 🎮