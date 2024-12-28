![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-Y8PvpRVRRKdv1RL52zWL3XYJ.png?st=2024-11-06T16%3A42%3A08Z&se=2024-11-06T18%3A42%3A08Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T19%3A50%3A20Z&ske=2024-11-06T19%3A50%3A20Z&sks=b&skv=2024-08-04&sig=mLUl/ytZgBh0Yvocc9i5vCmpCAi%2BsIeAmCivVVJJtdM%3D)

### 🎮 Programming Task: Lost in the Corridors of KTH

Welcome to your new programming challenge! In this task, you'll create a text-based adventure game titled **"Lost in the Corridors of KTH"**, where a player must navigate through various rooms and hallways within KTH's labyrinthine structure. The player is urgently searching for a restroom before time runs out. You'll learn to design classes, creatively program a game, and utilize file data to instantiate objects.

---

### 🎯 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity during object instantiation.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving and algorithm design.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback and testing to improve program effectiveness and usability.

---

## 📚 Exercise 1: Understanding File Input/Output

**Objective**: Validate your understanding of file I/O operations in Java.

**Description**: Write a brief essay (~300 words) on how data from external text files can be read and used to create objects in Java. Discuss different file formats and parsers that can be used, and highlight the importance of handling exceptions during file operations.

---

## 📚 Exercise 2: Class Design Principles

**Objective**: Reflect on effective object-oriented design.

**Description**: Provide a detailed explanation of how you would design a class structure for a simple text-based game like "Lost in the Corridors of KTH". Include the roles and responsibilities of possible classes, the interactions between them, and how you could apply inheritance or interfaces to enhance flexibility.

---

## 💻 Exercise 3: Implementing File-Driven Room Instantiation

**Objective**: Implement a method to create room objects from a file.

**Task**: Implement a `generateRoomsFromFile(String filename)` method. This method should read a file structured as:

```
Room;MainHall;A vast hall filled with students
Room;Library;A quiet place filled with books
Exit;MainHall;East;Library
Exit;Library;West;MainHall
```

Use this data to dynamically create and connect Room objects.

```java
private void generateRoomsFromFile(String filename) {
    // Hint: Use a HashMap<String, Room> to store room references.
    // Step 1: Read all "Room" entries and create Room objects.
    // Step 2: Read all "Exit" entries, and link Room objects accordingly.
}
```

---

## 💻 Exercise 4: Designing the Game’s Base Structure

**Objective**: Code the fundamental structure of the game using your class designs.

**Task**: Implement the basic structure of your game using at least two new classes you’ve designed based on Exercise 2. Ensure that your game is capable of:

- Reading room data from a file.
- Allowing the player to move between rooms.
- Displaying room descriptions and exits.

Include a main game loop that allows the player to enter commands to move around.

---

## 🚀 Exercise 5: Feature Expansion and Creative Mechanics

**Objective**: Add creativity and complexity to your game.

**Task**: Introduce a time mechanism where the player has a limited number of moves. Each move reduces the time left. Construct a hint system that gives the player feedback on how "close" they are to the restroom based on their current location. Consider using simple distance algorithms or predetermined hint messages. For example:

```java
private String provideHint(Room currentRoom) {
    // Return a hint string based on proximity to the restroom
}
```

---

## 🚀 Exercise 6: Complete the Enriched Game Experience

**Objective**: Finalize your game with winning and losing conditions.

**Task**: Implement the following features:
- Losing the game if time runs out ("You couldn't reach the restroom in time!").
- Winning the game if the player reaches the specified restroom room within the time limit.
- Include class and method Javadoc comments as per Java coding standards.
- Design and include a map of your game layout in text, possibly using ASCII art.

Finally, package your game with a README in the `docs` folder that includes:
- Instructions and rules.
- A brief walkthrough for testing (without spoilers).
- A reflection on the creative and technical process.

---

### 🛠 Troubleshooting & Testing

Remember to test rigorously! Pay attention to:
- Ensuring room connections match expectations.
- Correct handling of room data from files.
- Proper functioning of the hint and time systems.
- Clear, user-friendly game instructions.

### 🎉 Conclusion

By the end of this task, you should have a functioning, creative, and engaging text-based adventure game that showcases your understanding of file handling, class design, and creativity in programming. Enjoy your exploration of KTH, and good luck finding that restroom in time! 🚽🚨

---

Feel free to seek help on any challenging parts, and happy coding!