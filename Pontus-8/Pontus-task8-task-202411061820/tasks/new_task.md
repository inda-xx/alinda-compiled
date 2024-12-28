![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-yCPb7W1sycSbTHTyg35jPIXU.png?st=2024-11-06T16%3A21%3A13Z&se=2024-11-06T18%3A21%3A13Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T19%3A33%3A55Z&ske=2024-11-06T19%3A33%3A55Z&sks=b&skv=2024-08-04&sig=Xvc92CXKE1MX5J5SFUzIGdxhHKw3SGtzMtgqoVZREv4%3D)

# 🎃 Haunted House Text Adventure Game

Welcome to the Haunted House text adventure game project! This task will guide you through designing and coding a simple, interactive horror-themed game. Your objective is to explore a creepy haunted house, where your choices will determine your fate. Each room you enter offers a chance to gain points or face penalties. Collect items, make wise decisions, and survive with more than 0 points to avoid meeting an untimely end!

This project will help you practice essential programming skills, such as using data from files to instantiate objects, designing classes, and programming creatively. Ready to face the challenge? Let's get started!

## Learning Goals 📚

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and parsing techniques.
  - Use file I/O classes to read data.
  - Handle exceptions and ensure data integrity.

- **Designing Classes**
  - Identify class responsibilities and define interfaces.
  - Implement cohesive class structures.
  - Use design patterns for better class design.

- **Programming Creatively**
  - Explore different problem-solving approaches.
  - Experiment and iterate to refine solutions.
  - Integrate user feedback and testing.

---

## Exercise 1: Understanding File-Based Data Instantiation

**Objective:** Gain a theoretical understanding of how data from files can be used to instantiate objects.

1. **Question:** Explain how you can use structured data in a text file to create and initialize Java objects. Provide examples of data formats that might be used for this purpose.

2. **Task:** List potential methods for reading from a file and describe how you would extract and parse data to set object attributes.

---

## Exercise 2: Designing an Object-Oriented Game Structure

**Objective:** Develop a theoretical understanding of designing classes for a text-based adventure game.

1. **Question:** Describe the responsibilities of potential classes (e.g., Room, Item, Player) in a text adventure game. How would these classes interact?

2. **Task:** Sketch a basic UML class diagram to represent the object-oriented design of your game. Include key classes, attributes, methods, and relationships.

---

## Exercise 3: Coding a Basic Room Structure with File Integration

**Objective:** Create and link rooms in your game using data from a file.

**Instructions:**
- **File Creation:** Write a text file (e.g., `rooms.txt`) with room descriptions and exit information, formatted as:
  ```plaintext
  Room;Living Room;A dark, musty living room.
  Room;Kitchen;A kitchen with flickering lights.
  Exit;Living Room;north;Kitchen
  Exit;Kitchen;south;Living Room
  ```
- **Method Implementation:** Implement a method in your game class to read from this file and instantiate `Room` objects:
  ```java
  private void generateRoomsFromFile(String filename) {
      // Logic to read the file and instantiate rooms
  }
  ```
- **Code Snippet:** Use `BufferedReader` to read lines from the file and parse data to create rooms and define exits.

---

## Exercise 4: Implementing Game Logic with Class Design

**Objective:** Develop the core logic for your game, focusing on class design and creative programming.

1. **Class Design:** Design and implement classes for your game, such as `Room`, `Item`, and `Player`. Ensure your classes have clear responsibilities and interfaces.
   
2. **Game Logic:** Implement the game loop allowing the player to explore rooms. Track points, handle item interactions, and determine game outcomes (win, lose).

---

## Exercise 5: Enhancing Your Game with Points and Items

**Objective:** Expand your game by incorporating items and points system to create a dynamic gameplay experience.

1. **Item Integration:** Define and implement an `Item` class. Allow players to collect items and use them to influence their score or modify outcomes within rooms.
   
2. **Points System:** Modify your game to award or deduct points based on player actions. Use the points to determine the game's end condition (0 points = death).

---

## Exercise 6: Finishing Touches and Testing 

**Objective:** Finalize your game with thorough documentation and testing to ensure a satisfying player experience.

1. **Documentation:** Use Javadoc to document your classes and methods. Describe the purpose, parameters, return values, and exceptions for each method.

2. **Testing and Feedback:** Test your game rigorously to identify bugs and areas for improvement. Gather feedback from peers and iterate on your design and implementation.

3. **Finalization:** Ensure all features function as expected and that the game is fun and challenging. Submit your project with a README documenting how to play, win, and lose the game.

---

Good luck, and may your journey through the haunted house be both thrilling and educational! Remember to code creatively, test thoroughly, and learn from each step of your adventure. 🕯👻