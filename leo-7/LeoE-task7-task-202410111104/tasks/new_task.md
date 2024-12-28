# 🎮 Create a Simple Game Application: Player Movement, Scoring, and Enemy Interactions

In this task, you will develop a simple 2D console-based game in Java that involves a player moving around a grid, interacting with enemies, and earning points. The project will focus on key programming concepts such as using documentation, reading from text files, and implementing a scoring system with a `HashMap`.

## 🏆 Learning Goals
- **Using Documentation**: Discover how to effectively navigate and leverage Java API documentation for understanding and implementing Java classes and libraries.
- **Reading from a Text File**: Gain skills in file I/O operations, focusing on reading data from text files to dynamically generate game elements.
- **Using the `HashMap` Class**: Master the use of `HashMap` for efficient data management within the game, especially for tracking scores and enemy types.

---

## 📝 Exercise 1: Understanding Java Documentation

**Objective**: Develop the ability to navigate and utilize Java documentation and community resources.

**Instructions**:

1. Visit the [official Java documentation](https://docs.oracle.com/en/java/javase/17/docs/api/index.html).
2. Familiarize yourself with how to look up class methods and properties, focusing on the `HashMap` class and file input/output classes like `FileReader` and `BufferedReader`.
3. Answer the following questions:
   - How can you create a `HashMap` with strings as keys and integers as values?
   - How do you handle exceptions when reading from a file using `BufferedReader`?
   - What method would you use to split a string into words from a line in a file?

*Note: You may use Java forums or community discussions to enhance your understanding.*

---

## 💻 Exercise 2: Theory of File I/O Operations

**Objective**: Develop a foundational understanding of file I/O operations before diving into code.

**Instructions**:

1. Explain in your own words how file paths work in Java. Provide examples of relative vs. absolute paths.
2. Discuss why it's important to handle exceptions properly when working with file reading operations.
3. Describe the advantages of using try-with-resources when handling files in Java.

--- 

## 🚀 Exercise 3: Implementing File Reading

**Objective**: Read grid configurations for levels from a text file and initialize the game.

**Instructions**:

1. Create a class `LevelLoader` that reads a text file representing the game's grid.
2. Each line in the file should represent a row in the grid, and characters in the line represent different game elements (e.g., `P` for player, `E` for enemy, `.` for empty).
3. Implement a method `loadLevel(String filename)` that initializes a 2D char array representing the grid.
4. Ensure proper exception handling using try-with-resources.

Example text file (`level1.txt`):
```
....P...
.E..E...
...E....
```

*Expected Output*: A 2D grid initialized in the `LevelLoader` class.

---

## 🏹 Exercise 4: Using `HashMap` for Scoring System

**Objective**: Create a scoring mechanism using `HashMap`.

**Instructions**:

1. In your game logic class, initialize a `HashMap<String, Integer>` that represents different enemy types and their scores.
2. Add at least three different enemy types with varying scores (e.g., `Zombie -> 100`, `Vampire -> 150`, `Ghost -> 200`).
3. Implement methods to:
   - Add a new enemy type and score.
   - Calculate the total score based on defeated enemies during the game.

*Example*: If a player defeats 2 Zombies and 1 Vampire, the score should be 350.

---

## 🎯 Exercise 5: Implement Player Movement and Interaction

**Objective**: Develop mechanisms for player movement and interactions with enemies.

**Instructions**:

1. Implement a method `movePlayer(char direction)` that updates the player’s position based on a given direction ('W', 'A', 'S', 'D').
2. Ensure the player cannot move outside the boundaries of the grid or into a space occupied by an enemy.
3. When a player moves onto an enemy space, remove the enemy from the grid and update the score using your `HashMap`.
4. Utilize input from a text file to populate enemy positions, ensuring enemies are placed according to initial grid setup.

*Hint*: Use helper methods for grid boundary checks and collision detection.

---

## ⚔️ Exercise 6: Advanced Game Mechanics and Enemy Behavior

**Objective**: Implement more complex interactions and enemy behavior.

**Instructions**:

1. Expand the enemy behavior so that every `E` in the grid can make random or basic AI-driven movements (e.g., random moves or following the player).
2. Update the scoring system to include bonuses for clearing all enemies from the grid.
3. Implement a method `gameLoop()` to handle turns in the game, calling both player and enemy move methods.
4. Add file-based persistence to save and load the game state, allowing for pause and resume functionality.

*Note*: Challenge yourself to use both the documentation and your previous code to tackle these advanced integrations.

---

### ✅ Checklist

- [ ] Understand and navigate the Java documentation for necessary classes and methods.
- [ ] Develop a theoretical understanding of Java file I/O operations.
- [ ] Implement file reading to initialize game grids using `LevelLoader`.
- [ ] Use `HashMap` to establish and manage a dynamic scoring system.
- [ ] Code player movement and interactions with enemies, enforcing boundary rules.
- [ ] Integrate advanced enemy behavior and game mechanics in a continuous loop.

---

**Congratulations!** By completing this task, you've created a functional and engaging game with movement, interactions, and a dynamic scoring system, all while reinforcing fundamental Java concepts. Keep experimenting and enhancing your game to consolidate these skills further. Happy coding! 🎉