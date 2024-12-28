![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-A9IQJvCtjH2SL6YpunFaW31l.png?st=2024-11-07T22%3A26%3A05Z&se=2024-11-08T00%3A26%3A05Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-07T19%3A49%3A47Z&ske=2024-11-08T19%3A49%3A47Z&sks=b&skv=2024-08-04&sig=CoSJmLJLcjDGlSzVOzB7Yx8WJJVyyEKhmUGD3AjLYuU%3D)

Here's a detailed task description for creating a simple game application with player movement, scoring, and enemy interactions. This task will guide students through using data from files, designing classes, and programming creatively.

---

## 🎮 Task: Create a Simple Game Application

In this project, you will design and implement a simple game application that will include player movement, a scoring system, and enemy interactions. The task is divided into several exercises that will guide you through essential programming concepts such as using data from files to instantiate objects, designing classes, and programming creatively.

### 🚀 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Learn to understand file formats and parse techniques for data extraction.
   - Utilize file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Learn to identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

---

### 📝 Exercise 1: Theory of File Data Handling

#### Objective
Understand the theoretical underpinnings of reading data from files and instantiating objects.

#### Task
- Explain the importance of data integrity when reading from files.
- List and compare the ways data can be structured in files (e.g., CSV, JSON, XML).
- Explain a scenario where using file data for object instantiation is preferable to hard coding data.

---

### 📝 Exercise 2: Class Design Fundamentals

#### Objective
Learn the theory behind designing effective class structures.

#### Task
- Describe three principles of designing a class and their importance.
- Discuss a real-world system and identify possible classes, responsibilities, and interactions.
- Explore a design pattern that can aid in class design and present a short explanation of its application.

---

### 💻 Exercise 3: Implement Basic Game Components

#### Objective
Begin implementing the game components by integrating file handling and class design.

#### Task
- Implement a `Player` class with basic movement functionality.
- Create a method to read initial player data from a text file named `player_data.txt`.
  ```java
  public class Player {
      private String name;
      private int score;
      private int positionX, positionY;

      public Player(String name, int score, int positionX, int positionY) {
          this.name = name;
          this.score = score;
          this.positionX = positionX;
          this.positionY = positionY;
      }
      // Additional methods here...
  }
  ```
- Handle basic exceptions that might occur during file reading, ensuring data integrity.

---

### 💻 Exercise 4: Design and Implement Enemy Interactions

#### Objective
Design and code an `Enemy` class and integrate interactions with the player.

#### Task
- Design an `Enemy` class that can read its attributes from a file named `enemies.txt`.
- Implement basic movement and interaction logic.
  ```java
  public class Enemy {
      private String type;
      private int health;
      private int positionX, positionY;

      public Enemy(String type, int health, int positionX, int positionY) {
          this.type = type;
          this.health = health;
          this.positionX = positionX;
          this.positionY = positionY;
      }
      // Additional methods here...
  }
  ```
- Introduce a simple interaction where an enemy can alter the player’s score.

---

### 🌟 Exercise 5: Create a Scoring System

#### Objective
Develop a scoring system that dynamically updates based on player actions and interactions with enemies.

#### Step-by-step Task

1. Add a scoring mechanism in the `Player` class to update scores based on collecting items or defeating enemies.
2. Implement a method to read and update scores from a file named `scores.txt` to track high scores.
3. Integrate this feature into the main game loop, ensuring scores reflect player performance in real-time.

---

### 🌟 Exercise 6: Develop and Refine Your Game

#### Objective
Bring together all elements to create a cohesive and engaging game.

#### Step-by-step Task

1. Implement a game loop that continuously updates player movements, interactions, and scores.
2. Design additional classes or features to improve the gameplay experience, such as collectibles or special abilities.
3. Conduct user testing with peers, gather feedback, and iteratively refine the game.
4. Document your game design decisions and how user feedback informed changes in a file named `game_design.md`.

---

### 📜 Submission Guidelines

- Ensure all code is well-documented using Javadoc comments.
- Include the text files used for data instantiation in a dedicated `data` directory.
- Submit your project via your university’s submission system, including all source files and documentation.
- Prepare a short video demo of your game, highlighting its main features and any creative elements.

---

By the end of this task, you should have a functional and entertaining game that demonstrates your mastery of file-based data handling, class design, and creative programming. Happy coding! 🎮