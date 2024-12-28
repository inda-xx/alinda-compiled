![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-U7VrpnufFNGBiD9y8tFB2bUC.png?st=2024-11-05T07%3A21%3A17Z&se=2024-11-05T09%3A21%3A17Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-04T20%3A03%3A40Z&ske=2024-11-05T20%3A03%3A40Z&sks=b&skv=2024-08-04&sig=0CS99uFmADOLdt1NDSN0exB8XZt230QrJZ2%2BV7ET/RM%3D)

## 🎮 Simple Game Application Task

Welcome to a challenging yet exciting task where you will design and implement a simple game application. This project will not only test your Java programming skills but also your understanding of key programming concepts such as class design, file I/O, and creative coding practices. Get ready for an adventure as you create a game with player movement, scoring, and enemy interactions!

---

### 🧠 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - **Description:** Master the skill of reading data from files to dynamically create and initialize objects within your Java application.
   - Subpoints:
     - Understanding file formats and parsing techniques for data extraction.
     - Using file I/O classes to read data and convert it into object attributes.
     - Handling exceptions and ensuring data integrity during object instantiation.

2. **Designing Classes**
   - **Description:** Learn the principles of designing well-structured Java classes for maintainable and scalable software systems.
   - Subpoints:
     - Identifying class responsibilities and defining clear interfaces.
     - Implementing cohesive class structures with appropriate fields and methods.
     - Leveraging design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - **Description:** Apply creative thinking and problem-solving techniques to develop innovative solutions and enhance user experience.
   - Subpoints:
     - Exploring different approaches to problem-solving and algorithm design.
     - Encouraging experimentation and iteration to refine solutions.
     - Integrating user feedback and testing to improve program effectiveness and usability.

---

## 🏁 Task Overview

Your task is to create a game with player movement, scoring, and enemy interactions. Follow the structured exercises below to guide your development process.

### Exercise 1: Understanding File Data Loading 📂

**Objective:** Grasp the theoretical concepts necessary for loading data from files to instantiate objects.

- **Conceptual Questions:**
  1. Explain how file data can be used to dynamically instantiate objects in a Java program. What are the advantages of this approach?
  2. Describe the process of reading data from a file in Java. How do you ensure that the data is read and converted correctly into the fields of an object?

**Getting Started:**
- Review the Java classes related to file I/O, such as `FileReader`, `BufferedReader`, and handling exceptions with `try-catch-finally`.

### Exercise 2: Class Design Principles 🏛️

**Objective:** Comprehend the principles of designing effective and reusable classes.

- **Conceptual Questions:**
  1. What are the key responsibilities of a class, and how do you determine these responsibilities during the design phase?
  2. Discuss how design patterns can be used to solve common design problems and enhance the quality of a class design.

**Getting Started:**
- Explore object-oriented principles such as encapsulation, cohesion, and the Single Responsibility Principle.

### Exercise 3: Implementing File-Based Object Instantiation 💻

**Objective:** Implement file I/O operations to instantiate game entities from a configuration file.

- **Instructions:**
  1. Create a configuration file (`entities.txt`) containing data for game entities such as players and enemies. e.g.:
     ```
     Player;John;100;10
     Enemy;Orc;50;5
     ```
  2. Write a Java method `initializeGameEntitiesFromFile(String filename)` that reads data from this file, parses it, and instantiates objects accordingly.
  3. Ensure proper error handling for file I/O operations.

**Code Template:**

```java
public void initializeGameEntitiesFromFile(String filename) {
    // Initialize file reading resources
    // Read each line and parse it based on entity type
    // Create Player or Enemy objects based on parsed data
    // Handle exceptions appropriately
}
```

### Exercise 4: Designing the Game Class Structure 🎨

**Objective:** Design and implement the main classes to structure your game's logic.

- **Instructions:**
  1. Design classes for `Player`, `Enemy`, `GameWorld`, and any other necessary components.
  2. Define attributes and methods for each class emphasizing reusable, cohesive, and encapsulated designs.
  3. Implement interaction between these classes to demonstrate basic gameplay mechanics, like movement and score tracking.

**Code Tip:** Use UML diagrams to visualize class relationships and responsibilities.

### Exercise 5: Add Game Logic and Scoring System 🏆

**Objective:** Implement core game mechanics such as scoring and player movement.

- **Part A:** Player Movement
  - Implement basic movement logic for the player using methods like `moveNorth()`, `moveSouth()`, etc.
  - Ensure the player doesn't move outside of defined game boundaries.

- **Part B:** Scoring System
  - Add a score attribute in `Player`.
  - Award points for specific actions like defeating an enemy or collecting an item.
  - Display current score after each action using `System.out.println`.

**Bonus Challenge:** Use design patterns (like Strategy or State patterns) to enhance your implementation.

### Exercise 6: Create Enemies and Interactions ⚔️

**Objective:** Develop complex interactions with enemies, simulating a dynamic game environment.

- **Instructions:**
  1. Implement enemy behavior such as attacking and patrolling in the `Enemy` class.
  2. Create a simple AI for Enemy movements and interactions.
  3. Allow the player to engage with enemies using actions like `attack()` and determine the game outcome (win/lose).

**Step-by-Step Guidance:**
- Define enemy stats (`health`, `attackPower`) and implement methods to simulate attacking and being attacked.
- Integrate these interactions within the `GameWorld` class to affect player state and score.

**Reflection:** Consider the user experience. Test your game and refine it based on trial results. Gather feedback from peers to identify potential improvements.

---

### 📢 Final Deliverable

Ensure your code is well-documented, follows Java conventions, and is neatly structured. Submit your game along with the following:

- A **class diagram** illustrating the relationships between your classes.
- Game configuration file used.
- A brief **report** (maximum 2 pages) describing your game's structure, major decisions, and any challenges you faced with their solutions.

🎉 Good luck! I hope this task not only refines your technical skills but also uplifts your game-development creativity.