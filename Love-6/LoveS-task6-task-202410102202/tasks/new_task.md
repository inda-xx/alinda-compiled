## 🎲 Build the Higher or Lower Game

Welcome to the "Higher or Lower" game development challenge! This task will guide you through the concepts of randomness, control structures, collections, and more advanced Java topics like iterators and inheritance. You'll build a console-based game where players guess whether the next random number will be higher or lower than the current one. This project is both fun and an excellent learning opportunity!


### 🏁 Learning Goals

- Understand and utilize Java's `Random` object.
- Master the ternary operator through practical application.
- Explore the differences between deep and shallow copies.
- Develop debugging skills by finding and fixing bugs.
- Use an Iterator to safely modify a collection during iteration.
- **Optional:** Leverage inheritance to reduce code duplication.

---

### 📚 Exercise 1: Understanding Randomness and Control 🌀

**Objective:** Gain a theoretical understanding of Java's `Random` class and control structures.

1. **Documentation Review:**
   - Read the [Java `Random` documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html).
   - Answer the following questions in a document (e.g., `docs/README.md`):
     - What are some methods provided by the `Random` class, and what do they do?
     - How would you create a `Random` object to generate numbers in a specific range?
     - What are the benefits of using the ternary operator in your code?
   
2. **Ternary Thought Process:**
   - Write concise explanations or pseudocode snippets using the ternary operator for typical scenarios, such as:
     - Determining if a number is even or odd.
     - Assigning a grade based on a score.

---

### 🖋️ Exercise 2: Deep vs. Shallow Copies 📋

**Objective:** Distinguish between deep and shallow copies in Java.

- Read about deep vs. shallow copies, and consider:
  - How do deep copies differ from shallow copies in terms of object references?
  - When would you prefer using a deep copy over a shallow copy, and vice versa?
- Discuss with your peers or write a brief report highlighting the potential pitfalls of shallow copies.

---

### 💻 Exercise 3: Randomizing Game Elements 🤖

**Objective:** Create a basic implementation to generate random numbers for the game.

- **Code Implementation:**
  - Create a class named `HigherLowerGame` and add the following method:
    ```java
    public static List<Integer> generateRandomSequence(int n) {
        // Your code here to generate n random numbers
    }
    ```
  - Use `Random` to fill a list with `n` random integers and return it.

- **Testing the Method:**
  - Write a simple test in the main method to ensure your `generateRandomSequence` method works correctly.

---

### 🤔 Exercise 4: Iterators and Safe Modifications 🏗️

**Objective:** Modify a collection while iterating over it using an `Iterator`.

- Implement a method to remove numbers greater than a specified threshold from the list:
  ```java
  public static List<Integer> removeNumbersAboveThreshold(List<Integer> numbers, int threshold) {
      // Use an Iterator here to safely remove elements
  }
  ```
- Write test cases to validate your implementation.

---

### 🛠️ Exercise 5: Debug and Enhance the Core Game 🐛

**Objective:** Integrate all learned concepts to build a working version of the game.

- Set up your game loop:
  - Use `generateRandomSequence` to create a game sequence.
  - Prompt the user to guess if the next number is higher or lower than the current.
  - Keep track of the score.
  - Fix any logical errors or bugs you encounter during development.

- **Challenge:**
  - Add a feature that offers hints, using a ternary operation to guide the player based on proximity to a fixed value.

---

### 🚀 Exercise 6 (Optional): Code Duplication & Inheritance 🌟

**Objective:** Refactor your code using inheritance to avoid duplication.

1. Create a base class, `NumberGame`, to hold common logic for different game variants.
2. Extend `HigherLowerGame` from `NumberGame`:
   - Move shared methods and properties to `NumberGame`.
   - Make sure `HigherLowerGame` uses or overrides these as needed.
3. Reflect on how inheritance has streamlined your code and any limitations it introduces.

---

### 📝 Final Submission Guidelines

- Ensure all code is neatly organized and documented.
- Provide a main method in your `HigherLowerGame` class to demonstrate game playthrough.
- Submit your `HigherLowerGame` code, a report/document containing your theoretical work, and any additional notes on challenges faced and overcome during this task.

---

### 🎉 Wrapping Up

Congratulations! Completing this task means you've successfully combined various Java concepts into a cohesive project. Reflect on your learning journey and consider writing about the challenges and insights gained from creating your own "Higher or Lower" game.

Happy coding! 🚀