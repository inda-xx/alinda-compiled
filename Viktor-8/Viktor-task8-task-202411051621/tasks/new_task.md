![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-Mwh4zc8A94bXvfITBLfhOxON.png?st=2024-11-05T14%3A22%3A36Z&se=2024-11-05T16%3A22%3A36Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-04T19%3A26%3A58Z&ske=2024-11-05T19%3A26%3A58Z&sks=b&skv=2024-08-04&sig=8WQuSnBQobsiV/b47P1O/%2BNiNmwbSIFbM5P7aBtBLtw%3D)

Below is a complete task description for a university-level programming assignment where students will create a simple text-based adventure game. This task integrates the learning goals of using data from files to instantiate objects, designing classes, and programming creatively. Each exercise builds on the previous ones to create a cohesive and challenging learning experience.

---

# 📜 Assignment: Create a Text-Based Adventure Game

Welcome to your next programming challenge! In this task, you will design and implement a text-based adventure game. This is an excellent opportunity to enhance your skills in object-oriented programming, file handling, and creative problem-solving. You will work with file I/O to instantiate objects, design well-structured classes, and creatively bring your game to life.

### ✨ Learning Goals
- **Using Data from Files to Instantiate Objects**
- **Designing Classes**
- **Programming Creatively**

---

## 🌱 Exercise 1: Understanding File Formats and Parsing Techniques

**Objective**: Gain theoretical understanding of file handling and data parsing in programming.

- **Task**: Research and explain different file formats (e.g., CSV, JSON, XML) and their common use cases. Discuss parsing techniques used to read and interpret data from these files.
- **Deliverable**: Write a brief report (200-300 words) summarizing your findings.

---

## 🧠 Exercise 2: Principles of Class Design

**Objective**: Understand the principles of designing effective classes in object-oriented programming.

- **Task**: Discuss the responsibilities of a well-designed class and the importance of clear interfaces and cohesion. Compare two different class designs: one that leverages design patterns and another that does not.
- **Deliverable**: Write an analysis (200-300 words) highlighting the advantages and disadvantages of each design.

---

## 💻 Exercise 3: Reading Data from Files and Initializing Objects

**Objective**: Apply file I/O to create and initialize objects from external data sources.

### Instructions:
1. **Setup**: 
   - Create a file named `rooms.txt` that contains data defining rooms for your game. Each room should have a unique name and description. Exits should connect rooms together.
   
   **Example Format**:
   ```
   Room;Cave;A dark, damp cave.
   Room;Forest;A lush, green forest.
   Exit;Cave;North;Forest
   Exit;Forest;South;Cave
   ```

2. **Task**: Implement a method in your game class to read this data and instantiate room objects. Use a `HashMap<String, Room>` to store these objects.

3. **Deliverable**: Provide the code for the method and a brief explanation of how it works (e.g., describe exception handling to ensure data integrity).

```java
private void generateRoomsFromFile(String filename) {
    // Implementation goes here
}
```

---

## 🔧 Exercise 4: Designing and Implementing your Game Classes

**Objective**: Practically apply class design principles to build components of your game.

### Instructions:
1. **Design**:
   - Identify key components of your game (e.g., `Room`, `Player`, `Item`). Define their responsibilities and interfaces.

2. **Implement**:
   - Create at least three classes based on your design.
   
3. **Deliverable**: Provide the class definitions and a short explanation of their roles and relationships.

```java
public class Room {
    private String name;
    private String description;
    private Map<String, Room> exits;
    
    // Methods to add exits, get description, etc.
}
```

---

## 🚀 Exercise 5: Crafting Your Adventure

**Objective**: Integrate your knowledge and creativity to develop the text-based game.

### Instructions:
1. **Planning**:
   - Design a narrative or theme for your game. Sketch out a map showing the interactions between rooms.

2. **Coding**:
   - Implement game logic that allows players to explore rooms and interact with items or characters.

3. **Deliverable**: Submit your code along with a brief story summary and a scanned/digital map of the game world.

---

## 🧩 Exercise 6: Playtesting and Iteration

**Objective**: Refine your game through testing and feedback.

### Instructions:
1. **Testing**:
   - Playtest your game, either by yourself or by asking friends/classmates for feedback. Identify any bugs or areas for improvement.
  
2. **Iteration**:
   - Make necessary changes to enhance gameplay and fix issues.

3. **Deliverable**: Submit a report (200-300 words) on the feedback received and the changes made.

---

## 📌 Summary

In completing this task, you will have designed, implemented, and refined a text-based adventure game. This project will not only test your coding skills but also your ability to think creatively and design effective software solutions. Remember, this is your chance to experiment and bring a unique world to life, so have fun with it!

Happy coding! 🎉

--- 

The task integrates concept learning with practical application, encouraging creativity and technical mastery. Good luck, and enjoy your adventure into the world of text-based games!