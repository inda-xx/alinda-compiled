![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-Y8gS5PbHxDS00kaI6qR1mqMS.png?st=2024-11-05T14%3A45%3A52Z&se=2024-11-05T16%3A45%3A52Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T01%3A03%3A52Z&ske=2024-11-06T01%3A03%3A52Z&sks=b&skv=2024-08-04&sig=Bm9BNqX954kGiwywGHWyw5dB1HEiU7iCMUqBJpdI128%3D)

### 📚 Assignment: Building a Text-Based Adventure Game

Welcome to your next programming challenge! In this assignment, you will create a simple text-based adventure game using Java, where players navigate through a series of interconnected rooms, solve puzzles, and encounter characters. By the end of this task, you will have honed your skills in object-oriented programming, file I/O, and creative software design. Get ready to embark on a journey of creativity and technical execution!

#### Learning Goals

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and parsing techniques for data extraction.
  - Use file I/O classes to read data and convert it into object attributes.
  - Handle exceptions and ensure data integrity during object instantiation.

- **Designing Classes**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to solve common problems and enhance class design.

- **Programming Creatively**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration to refine solutions.
  - Integrate user feedback and testing to improve program effectiveness and usability.

---

### Exercises

#### Exercise 1: 🌐 Understanding File I/O Concepts

**Objective:** Deepen your understanding of handling files in Java.

- **Task:** Explain, with examples, the process of reading data from files and how it can be used to instantiate objects in a Java program. Discuss common file formats used for data storage and techniques for parsing these files.
  
- **Explanation Focus:**
  - **Subpoint 1:** Highlight different file formats such as text files (CSV, JSON) and parsing methods (e.g., `Scanner`, `BufferedReader`). 
  - **Subpoint 2:** Provide a conceptual explanation of how file data can be transformed into object attributes synchronously.
  - **Subpoint 3:** Discuss strategies for handling exceptions that may arise during file operations, and methods to ensure data integrity.

#### Exercise 2: 🏗️ Designing Class Structures

**Objective:** Develop a theoretical understanding of effective class design.

- **Task:** Design a class hierarchy for a text-based adventure game. Provide a brief description of each class, what attributes and methods it would have, and how classes might interact with one another.

- **Explanation Focus:**
  - **Subpoint 1:** Identify potential classes and define their responsibilities and interfaces (e.g., Room, Player, GameItem).
  - **Subpoint 2:** Create a UML diagram or detailed description that outlines cohesive class structures.
  - **Subpoint 3:** Suggest at least one design pattern (e.g., Factory, Singleton) that could enhance your class design, with an explanation of how and why to use it.

#### Exercise 3: 📜 Implementing File-Based Room Creation

**Objective:** Use Java file I/O techniques to instantiate game components dynamically.

- **Task:** Write a Java method `generateRoomsFromFile(String filename)` to parse a file containing room details for your adventure game. Each room should be instantiated and stored, ensuring that exits are correctly linked.

- **Implementation Steps:**
  - Parse each line of a file formatted as: `Room;ROOM_NAME;DESCRIPTION`
  - Parse exit data formatted as: `Exit;FROM;DIRECTION;TO`
  - Implement error handling to manage file access issues and incorrect data formats.

#### Exercise 4: 💼 Your Custom Game Class

**Objective:** Enhance your game by creating a custom class that adds unique gameplay functionality.

- **Task:** Design and implement a new class (e.g., `QuestItem`, `NPC`, `Puzzle`) that adds depth to your game world.

- **Implementation Steps:**
  - Define at least two attributes, and implement associated methods.
  - Integrate this class into your existing game framework.
  - Use this class to influence the game’s win/lose conditions or player interaction options.

#### Exercise 5: 💡 Crafting Your Adventure Scenario

**Objective:** Approach problem-solving creatively to implement a compelling gameplay experience.

- **Task:** Design a narrative and layout for your game adventure. Sketch a map of your game environment and design puzzles or challenges that users must overcome.

- **Steps:**
  - Design at least five interconnected rooms with a mix of challenges.
  - Draft a narrative that explains the player's goal and the obstacles they must overcome.
  - Plan out how your custom class (from the previous exercise) fits into your game narrative.

#### Exercise 6: 🎮 Bringing it All Together

**Objective:** Combine all implemented components to create a fully functional text-based adventure game.

- **Task:** Integrate all parts of your program into a cohesive game. Ensure the game includes file-driven room creation, well-designed classes, and creative gameplay mechanics.

- **Evaluation Criteria:**
  - Implementation correctness and file integration.
  - Creativity and depth of game mechanics and narrative.
  - Effective use of your custom class in enhancing gameplay.
  - Quality and readability of code (with appropriate comments and documentation).

---

### 🤝 Submission Guidelines

- Ensure all your code is well-documented and adheres to Java coding standards.
- Include a README file with game instructions, a description of your custom class, and a map or narrative plan of your game world.
- Test your game to ensure it operates without bugs or logical errors.

By completing this task, you will not only strengthen your understanding of Java programming concepts but also showcase your ability to design and develop a creative software project. We look forward to exploring the unique adventures you create. Happy coding!