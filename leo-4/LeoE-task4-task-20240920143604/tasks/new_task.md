# Simple Game Development in Java

Creating your very own game allows you to harness the power of programming to build interactive and fun experiences. This task will guide you through developing a simple game in Java, incorporating player movement, a scoring system, and enemy interaction. Through this assignment, you'll enhance your understanding of boolean expressions, loops, function overloading, and gain hands-on practice using JShell.

---

### 📝 Preparation

- Review relevant materials on Java fundamentals, particularly focusing on loops and boolean logic:
  - Java Tutorials on [boolean operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
  - Java [while loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html) and [for loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) documentation
  - Familiarize yourself with [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for quick Java code testing

---

### ✅ Learning Goals

This task aims to reinforce your understanding of the following concepts:

* `boolean` expressions and operators
* `while` loops
* `for` loops
* Using JShell to try your Java programs
* Function overloading

---

### 🚨 Troubleshooting Guide

If you encounter issues, follow these steps:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). See if others have faced similar problems.
2. If your issue is unique, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a clear title: "Task _x_: _summary of problem here_".
3. Reach out to a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for lab availability.

Engage in discussions with peers, but remember, **do not share solutions!** AI assistance is welcome for concept clarification, but ensure the work you submit is genuinely yours.

---

### 🏛 Assignment

We will build a simplistic game where the player navigates a game board, collects points, and interacts with enemies. The goal is to apply iteration, conditionals, and method overloading to accomplish these tasks.

#### Game Structure

1. **Player Movement**
   - Navigate the player through a grid.
   - Utilize `boolean` expressions to manage valid movements and player status.

2. **Scoring System**
   - Implement a scoring system that increases based on actions or time.

3. **Enemy Interactions**
   - `for` and `while` loops will create enemy behaviors.
   - Use conditionals to decide the outcome of player-enemy collisions.

---

<details>
<summary> 📚 Boolean values, expressions, and operators </summary>

Like arithmetic, boolean expressions deal in binary: true or false. You'll use logical operators (`&&` for "and", `||` for "or", `!` for "not") to create conditions.

Example:
```java
boolean canMove = (playerPosition < maxBoundary) && (!hasCollided);
```
</details>

#### Exercise 5.1 -- Designing the Grid

Create a class `Game.java`. Within this, design a grid for the player:

- Define constants for grid size.
- Use a `boolean` array to represent the grid, where `true` denotes a traversable cell.
- Set up initial positions for your player and enemies.

#### Exercise 5.2 -- Implementing Player Movement

Add methods to handle player movement:

- `public void movePlayer(char direction)`: Moves player based on input ('W', 'A', 'S', 'D' for directions).
- Use a `while` loop to listen for player commands continuously until a specific condition (e.g., player quits).
- Include boundary checks using `boolean` expressions.

#### Exercise 5.3 -- Scoring Mechanism

Enhance your game with a scoring system:

- `public int calculateScore()`: Calculate and return score based on player actions.
- Use function overloading to define `calculateScore(int bonus)`, allowing special score scenarios.
- Display the score throughout gameplay using a `for` loop to iterate through actions.

#### Exercise 5.4 -- Enemy Interactions

Incorporate enemies that interact with the player:

- Use a `for` loop to manage multiple enemies.
- A `while` loop determines enemy behavior within each game cycle.
- `boolean` expressions decide the effect of an enemy collision (e.g., reducing player health).

---

<details>
<summary> 💡 JShell for Testing </summary>

Use JShell for rapid testing:

```bash
$ jshell
jshell> /open Game.java
jshell> Game g = new Game();
jshell> g.movePlayer('W');
```

JShell offers a quick way to test sections of your code without creating a full program setup.
</details>

#### Exercise 5.5 -- Functional Overloading for Expanded Gameplay

Extend game functionality with overloaded methods:

- Introduce variations of existing methods with different parameters, enabling new actions.
- For example, `movePlayer(char direction, int speed)` adds more complexity to player movements.

---

By developing this simple game, you'll apply critical Java concepts in a creative project, resulting in both a fun application and a deeper grasp of programming principles. Good luck, and enjoy crafting your game!