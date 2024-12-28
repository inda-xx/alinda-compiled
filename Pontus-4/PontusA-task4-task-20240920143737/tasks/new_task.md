# Game Development with Java

Games are a fantastic way to learn programming. By creating a game, we encounter several critical concepts in computer science such as algorithms, user interaction, and logic. This week, we will focus on building a simple game application incorporating player movement, a scoring system, and interactions with enemies. Through this task, we will explore essential programming constructs including loops, boolean expressions, and function overloading.

### 📝 Preparation

- Review the [lecture slides on Java Basics](https://example.com/java-basics-slides)
- Explore the [JShell introduction](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)
- Read the following materials and answer all provided questions:
  - [Module on Boolean Expressions](https://example.com/boolean-expressions)
  - [Module on Looping Structures](https://example.com/looping-structures)

### ✅ Learning Goals

This week's learning goals include:

* Mastering `boolean` expressions and operators.
* Understanding and implementing `while` and `for` loops.
* Using JShell to try Java code snippets.
* Exploring function overloading.

### 🚨 Troubleshooting Guide

If you encounter any issues, follow this protocol:

1. Check the [posted issues](https://example.com/issues) for shared solutions.
2. Post a new question via [New Issue](https://example.com/issues/new) if yours is unique.
3. Consult a Teaching Assistant during the [weekly lab](https://example.com/weekly-lab).

Interact and collaborate with peers, but ensure your submissions are your own understanding. Utilize AI tools for learning, but not for submitting final solutions.

### 🏛 Assignment

We will be developing a simple game application that involves key programming concepts such as player movement, a scoring system, and interactions with enemies. This game will utilize Java's powerful capabilities in boolean logic, loop structures, and more.

<details>
<summary> 📚 Boolean Expressions and Operators </summary>

Understanding [boolean values](https://en.wikipedia.org/wiki/Boolean_data_type) is foundational. A boolean is a true or false value. We use boolean expressions in Java to control logic flow, e.g., `2 < 5` results in `true`.

In Java:
```java
boolean isGameOver = false;
boolean isPlayerAlive = true;
```

Operators such as `&&` (and), `||` (or), and `!` (not) help us build complex expressions. For example, `isPlayerAlive && !isGameOver` evaluates true when the player is alive and the game isn’t over. Parentheses help to control evaluation order.

</details>

#### Exercise 1: Setup Game Environment

- Create a file named `Game.java` in your `src` folder.
- Inside, create a simple main character class with fields for position (`x`, `y`) and a score. Ensure encapsulation with proper getter and setter methods.

#### Exercise 2: Player Movement

- Implement a method:
  ```java
  public void movePlayer(int deltaX, int deltaY)
  ```
  Use this method to update the player's position. Experiment with boundary checks using boolean expressions to ensure the player position remains within game limits.

#### Exercise 3: Introducing Enemies

- Add an `Enemy` class with similar position fields.
- Implement a boolean method to detect player-enemy collision:
  ```java
  public boolean checkCollision(Enemy enemy)
  ```
  Use the `&&` operator to assess when the player occupies the same position as an enemy.

#### Exercise 4: Scoring System

- Extend functionality to update and retrieve the player's score.
- Within `Game`, include methods:
  ```java
  public int getScore()
  public void increaseScore(int points)
  ```
  Update the score when an enemy is avoided or some goal is achieved.

<details>
<summary> 📚 Using Loops </summary>

Java offers both `while` and `for` loops for repeated operations. Use a `while` loop to execute player movements continuously until a game-over condition (e.g., excessive collisions) is met. For instance:
```java
while (!gameOver) {
  // Game logic goes here
}
```
The `for` loop is familiar for situations with known iteration counts, e.g., iterating through a level’s enemies.

```java
for (int i = 0; i < levelEnemies.length; i++) {
  // Check collisions
}
```

Consider using `JShell` for quick testing of expressions and loops without the overhead of setting up a full Java project.

</details>

#### Exercise 5: Game Loop

- Establish the main game loop using a `while` loop. Continue gaming until a boolean `gameOver` flag turns true.
- Place `System.out.println` calls strategically to output current player status and score.

#### Exercise 6: Feature Creep - Power-Ups

- Use function overloading to handle different types of power-ups that players can collect.
  ```java
  public void collectPowerUp(String type)
  public void collectPowerUp(int boost)
  ```

### 🔄 Testing Your Code

Make use of JShell to prototype and challenge snippets of your code. Invoke methods like `movePlayer`, `checkCollision`, and experiment with method overloading.

```bash
jshell Game.java
Game myGame = new Game();
myGame.movePlayer(5, 0);
myGame.checkCollision(new Enemy());
```

### ✨ Wrapping Up

As you develop your game, reflect on the concepts of boolean logic, looping, and function overloading. These skills are foundational in programming, both in game development and beyond.