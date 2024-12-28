![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-XeVKg5sW39r127tcSCddm53k.png?st=2024-11-08T10%3A22%3A54Z&se=2024-11-08T12%3A22%3A54Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-08T04%3A59%3A00Z&ske=2024-11-09T04%3A59%3A00Z&sks=b&skv=2024-08-04&sig=FOSR2tMtzIE7kHPk3%2BE%2Bup%2B/DdK/g3UzIKAXVEs2LFM%3D)

# 🎲 Text-Based Blackjack Game

Welcome to your ultimate programming challenge - creating a text-based Blackjack game! In this task, you will design a simple yet engaging Blackjack game where the player can play against a computerized dealer. This project will help you enhance your understanding of object-oriented programming, file I/O, and creative problem-solving.

### 🎯 Learning Goals

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and employ parsing techniques to extract data.
  - Use file I/O classes in Java to read data and convert it into object attributes.
  - Handle exceptions and ensure data integrity during object instantiation.

- **Designing Classes**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to solve common problems and enhance class design.

- **Programming Creatively**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration to refine solutions.
  - Integrate user feedback and testing to improve program effectiveness and usability.

## 📚 Exercises

### Exercise 1: Understanding File Formats and Parsing (Theoretical)
**Objective:** Explore how textual data can be represented in different file formats like CSV or JSON. Discuss parsing techniques necessary to extract meaningful data from these formats.

**Task:**
- Research and explain the structure and characteristics of a CSV file and how it can be used to store card data for a Blackjack game.
- Discuss at least two different parsing techniques and their advantages/disadvantages in the context of reading card data from files.

### Exercise 2: Class Design Principles (Theoretical)
**Objective:** Examine the principles of effective class design in object-oriented programming.

**Task:**
- Define the responsibilities and interfaces for three core classes in your Blackjack game: `Card`, `Deck`, and `Player`.
- Describe how design patterns such as the Singleton pattern could be used to manage a single deck of cards in the game.

### Exercise 3: Implementing File I/O for Card Data (Practical)
**Objective:** Use Java's file I/O capabilities to read card data from a file and instantiate `Card` objects.

**Task:**
- Create a text file named `cards.txt` that contains card names, suits, and values.
- Write a Java program to read this file and instantiate a list of `Card` objects.
  ```java
  // Sample Card file format:
  // CardName;Suit;Value
  Ace;Hearts;11
  Two;Hearts;2
  ```
- Handle any potential file reading exceptions appropriately.

### Exercise 4: Designing and Implementing Classes (Practical)
**Objective:** Design and implement the core classes of the Blackjack game.

**Task:**
- Implement the `Card`, `Deck`, and `Player` classes based on your design from Exercise 2.
- Ensure each class includes appropriate fields, methods, and encapsulation techniques.
- Program a simple shuffle method in the `Deck` class to simulate random card order.

### Exercise 5: Building the Game Loop and Logic (Advanced)
**Objective:** Combine all elements to create the game logic and loop for the Blackjack game.

**Task:**
- Implement a game loop that allows a player to draw cards until they choose to stand or exceed 21 points.
- Implement the dealer's logic to draw cards as per standard Blackjack rules.
- Handle win/lose conditions appropriately, and end the game once a result is reached.

### Exercise 6: Enhancing Game Features (Creative)
**Objective:** Use creativity to enhance the basic game with additional features.

**Task:**
- Add the ability for players to place bets.
- Implement a text-based user interface that provides a clear and engaging experience.
- Allow saving and loading player progress and statistics to and from a file.

---

## 🎨 Aesthetic and Documentation

- Use Javadoc comments to document all public classes and methods.
- Ensure variable names are meaningful, and write comments where necessary to explain complex logic.
- Provide a README file that describes how to compile and run your game, along with a brief user guide.

## 🔍 Testing and Feedback

- Test your game for various scenarios and edge cases.
- Obtain feedback from at least one peer and iteratively improve your game based on the feedback.

## 🚀 Submission Guidelines

- Submit your code along with the `cards.txt` file and any other necessary files for the program.
- Include a short report describing any challenges faced and how you overcame them.

Good luck, and may your code be bug-free and your hands always be in your favor! 🎲🏆