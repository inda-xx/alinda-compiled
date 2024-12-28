## 🎰 Casino Game Assignment: The ForTune Teller 🎲

Welcome to the Casino programming task! Today, you'll build a small console-based casino game called **The ForTune Teller**. This hands-on project is designed to enhance your Java skills, focusing on random number generation, conditional logic, collection manipulation, and inheritance. This task is structured into progressive exercises, culminating in a fully functional casino game.

### 🔍 Learning Objectives
- Understand and use the Java `Random` class.
- Implement and utilize the ternary operator.
- Differentiate between deep and shallow copies in Java.
- Detect and fix bugs in your code.
- Use an `Iterator` to modify collections during iteration.
- (Optional) Implement inheritance to avoid code duplication.

## Task Exercises

### Exercise 1: 📚 Theory Check - The Random Pathway 
#### Goal: Understanding the `Random` object and the ternary operator.

**1.1 Explore the `Random` Class**
- Read the Java [Random class documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html).
- Answer these questions:
  - What is the purpose of the `Random` class?
  - How can you generate a random integer within a range using `Random`?

**1.2 Ternary Operator**
- Explain the syntax of the ternary operator with an example. 
- Discuss some scenarios where using the ternary operator might be preferable to a standard `if-else` statement.

---

### Exercise 2: 🤔 Conceptual Understanding - Copying Mechanisms
#### Goal: Understanding deep vs. shallow copies.

**2.1 Deep vs. Shallow Copy**
- Define deep copy and shallow copy with examples.
- Discuss how these concepts can impact your program’s behavior, particularly in a gambling game where object state is frequently changing.

---

### Exercise 3: 🔧 Implementation - Luck of the Draw
#### Goal: Apply random generation and copying.

**3.1 Generate Your Fortune**
- Implement a method in a Java class called `CasinoGame` that generates a list of random fortunes. Use `Random` to generate random numbers to determine which fortune to generate.
  ```java
  public static ArrayList<String> generateFortunes(int n)
  ```
  Each fortune should correspond to a unique number (e.g., 1 is "Win Big", 2 is "Better luck next time").

**3.2 Designing Your Deck**
- Write a method to shuffle a list of fortunes without modifying the original list. Ensure a **deep copy** of the list:
  ```java
  public static ArrayList<String> shuffleFortunes(ArrayList<String> fortunes)
  ```
  
---

### Exercise 4: 🔀 Game Mechanics - Roll of the Dice
#### Goal: Use iterative mechanisms to manipulate collections.

**4.1 Create A Dice**
- Define a `Dice` class that simulates a six-sided dice. Use the `Random` object to randomly assign values when the dice is created.
  ```java
  public class Dice {
      private int value;
      private Random random;
  }
  ```

**4.2 Fortune Sequence**
- Implement a method to simulate rolling `n` dice, representing a sequence of fortunes aligned with dice values:
  ```java
  public static ArrayList<Dice> rollDiceSequence(int n)
  ```

---

### Exercise 5: ❗ Advanced Implementation - Game Scenarios
#### Build complexity by integrating and testing your components together.

**5.1 Double Trouble**
- Implement a method that computes the sum of the two highest consecutive dice values in a sequence:
  ```java
  public static int maxConsecutiveDiceRolls(ArrayList<Dice> sequence)
  ```

**5.2 Modify on the Move**
- Write a method that removes all dice with a specific value from a sequence using an `Iterator`:
  ```java
  public static ArrayList<Dice> removeDice(ArrayList<Dice> sequence, int value)
  ```

---

### Exercise 6: 🔨 Inheritance in Play - Extending Functionality
#### (Optional) Building upon existing classes for feature reuse.

**6.1 Biased Fortune Dice 🎲**
- Create a class `BiasedDice` that extends `Dice`, having a probability bias towards returning certain values, perhaps skewing fortunes (e.g., higher odds of getting "Win Big").

This class should have logic to prefer higher values (4 to 6), demonstrating functional inheritance and class extension.

---

### 🔍 Debugging and Final Edits
As you develop this game, regularly test and fix any bugs that arise, ensuring that your game logic is robust and accurately reflects the casino theme.

### ✅ Final Checklist
- [ ] Understand and demonstrate the use of `Random` and the ternary operator.
- [ ] Explain deep and shallow copy concepts.
- [ ] Generate and shuffle lists effectively and accurately.
- [ ] Implement iteration and inheritance to build upon classes.
- [ ] Debugging to ensure a smooth, bug-free gambling simulation!

Good luck, and may the odds be ever in your favor as you program your way through The ForTune Teller! 🎲🎉