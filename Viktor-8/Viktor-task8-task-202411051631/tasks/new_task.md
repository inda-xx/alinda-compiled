![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-rffBCgqw4VeQvyhT8XSd0eML.png?st=2024-11-05T14%3A32%3A10Z&se=2024-11-05T16%3A32%3A10Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-04T20%3A00%3A26Z&ske=2024-11-05T20%3A00%3A26Z&sks=b&skv=2024-08-04&sig=DF4DWsCo%2BLqRvkXLTLmm96r0O9FhAMKSkwjKz45NucE%3D)

Here's a complete task description with exercises structured to guide students through creating a text-based adventure game, focusing on using data from files to instantiate objects, designing classes, and programming creatively:

---

# 🧙‍♂️ Text-Based Adventure: Create Your Fantasy Quest

Welcome adventurer! Your task is to create an enchanting text-based adventure game where players navigate through a fantasy world filled with mysterious locations, peculiar characters, and thrilling challenges. You'll harness the power of object-oriented programming to bring this world to life using data from files. Embark on this journey to master class design and creative programming!

## 🎯 Learning Goals

This task aims to help you develop the following skills:

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques.
   - Use file I/O classes to read data and convert it into object attributes.
   - Handle exceptions and ensure data integrity.

2. **Designing Classes**
   - Identify class responsibilities and define clear interfaces.
   - Implement cohesive class structures with appropriate fields and methods.
   - Leverage design patterns to enhance class design.

3. **Programming Creatively**
   - Explore different approaches to problem-solving.
   - Encourage experimentation and iteration to refine solutions.
   - Integrate user feedback to improve program effectiveness and usability.

## 🧩 Exercises

### ✨ Exercise 1: Understanding File Formats and Parsing Techniques

**Objective**: Analyze the structure of game data files.

**Task**: 
- Examine the provided `game_data.txt` file. It contains information on rooms, items, and links in the format:
  ```
  Room;RoomName;Description
  Item;ItemName;Effect
  Link;FromRoom;Direction;ToRoom
  ```

- **Question**: Explain how this file format allows for easy parsing and potential challenges you might face. Consider errors, incomplete entries, and file structure complications.

---

### 🔎 Exercise 2: Designing the Game Classes

**Objective**: Map out the class structure for your adventure game.

**Task**:
- Sketch the architecture of your game, defining at least three primary classes: `Room`, `Item`, and `Player`.
- **Question**: Describe the roles and responsibilities of each class and the methods you'll implement. Provide reasoning for your design choices, considering scalability and maintainability.

---

### 🛠 Exercise 3: Reading Data and Instantiating Objects

**Objective**: Write code to load game data from a file.

**Task**:
- Implement a Java method `loadGameData(String filename)` in your main game class to read and parse the `game_data.txt` file.
- Instantiate `Room` and `Item` objects based on the file's contents.

**Hint**: Use `BufferedReader` and handle exceptions to ensure robust reading.

```java
public void loadGameData(String filename) {
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Parse line and instantiate objects
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
```

---

### 🧩 Exercise 4: Creating Interactive Game Mechanics

**Objective**: Implement player interactions within your game world.

**Task**:
- Develop methods in the `Player` class to allow picking up and using items.
- Write code to link rooms based on player commands (e.g., "go north").

**Hint**: Use a Map to store room links dynamically.

---

### 🚀 Exercise 5: Building Your Adventure Game

**Objective**: Bring your text-based game to life!

**Task**:
- Expand your game with at least 5 connected rooms, each with unique descriptions and challenges.
- Integrate a winning condition (e.g., reaching a specific room with certain items) and a losing scenario (e.g., taking too long).

**Steps**:
1. Draft a flow of your story with different paths and outcomes.
2. Implement these paths into your game's code.

**Tip**: Get creative with items and player interactions!

---

### 🌟 Exercise 6: Enhancing Game Experience and Documentation

**Objective**: Polish your game with creative features and comprehensive documentation.

**Task**:
- Add unique features like characters with simple dialogues or puzzles to solve.
- Document your game code with Javadoc, covering all public classes and methods.

**Deliverables**:
- A detailed README with gameplay instructions, class descriptions, and how to run your game.
- A creative map illustrating the game world layout.

---

## 🎉 Conclusion

Congratulations on completing this magical quest! You've not only created an engaging text-based adventure but also honed your skills in reading data from files, designing robust classes, and programming creatively. Remember, the skills earned here will lead you to many more exciting adventure paths in software development. Keep exploring and coding!

---

This task is designed to be both fun and challenging, encouraging students to engage deeply with key concepts while enjoying the creative process of game development.