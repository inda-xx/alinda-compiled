### 🎲 Random Explorations in Java

Welcome to the "Random Explorations in Java" task! This exercise is designed to enhance your understanding of Java fundamentals, such as the use of the `Random` class, the ternary operator, the nuances of copy operations, debugging, and iterators, with an optional dive into inheritance. 

This will be a guided series of exercises ranging from theoretical understanding to practical implementation. Let's embark on this journey to master these foundational concepts. 

---

## 🚀 Exercise 1: Exploring the Java `Random` Object & the Ternary Operator

### 📚 Objective:
- **Understand the Java `Random` object.**
- **Comprehend the use and functionality of the ternary operator.**

**Instructions:**
1. **Read the Documentation:**
   - Before diving into code, quickly skim through the [Java `Random` class documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html).
   
2. **Conceptual Questions:**
   - What's the difference between `nextInt()` and `nextInt(bound)` methods in the `Random` class?
   - Explain how the ternary operator works with an example in your own words.

_**Code Snippet:**_

```java
Random random = new Random();
int randomValue = random.nextInt(10); // Explain what this line does with respect to Random object.
String result = (randomValue < 5) ? "Less than 5" : "5 or more"; // Describe this ternary operation.
```

---

## 🔍 Exercise 2: Deep vs Shallow Copy in Java

### 📚 Objective:
- **Differentiate between deep and shallow copies in Java.**

**Instructions:**
1. **Read the Explanation:**
   - Explore the differences and implications of deep and shallow copies, especially in object-oriented programming.

2. **Conceptual Questions:**
   - What is a shallow copy, and when is it useful?
   - Describe an example scenario where a deep copy would be necessary.

---

## 💻 Exercise 3: Randomly Generated Sequences of Numbers

### 📚 Objective:
- **Create, shuffle, and understand the difference between deep and shallow copies of ArrayLists.**

**Task:**
- Implement the following method in a class called `RandomUtils`:

```java
public static ArrayList<Integer> generateRandomNumbers(int n) {
    // Generate 'n' random integers and return them in an ArrayList
}
```

- Implement `shuffleNumbers` that shuffles and returns a deep copy of the provided list:

```java
public static ArrayList<Integer> shuffleNumbers(ArrayList<Integer> numbers) {
    // Create and return a deep shuffled copy of the numbers list
}
```

**Requirement:** 
- Test your methods to ensure that a deep copy is being made. When the shuffled list changes, the original should not.

---

## 🔍 Exercise 4: Debugging & Bug Fixing

### 📚 Objective:
- **Identify and fix bugs in a given piece of code related to `Random` and ternary operations.**

**Task:**

1. Debug the following code snippet. There’s a small mistake. Identify and fix it:

```java
Random random = new Random();
int randomValue = random.nextInt(10); // Generates numbers between 0 and 9
boolean isEven = randomValue % 2 == 0 ? true : false; // Check if the number is even
System.out.println("Random value " + randomValue + " is even: " + isEven);
```

2. Explain the error and your solution.

---

## 🧑‍💻 Exercise 5: Dice Game Simulation

### 📚 Objective:
- **Model a six-sided dice using classes and simulate rolls. Extend functionality using inheritance.**

**Tasks:**

1. **Create the `Dice` class:**
   - Fields: `int value`, `Random random`
   - Constructor: Initializes `value` to a random number between 1 and 6.
   - Method: `getValue()`

2. **Create the `BiasedDice` class:**
   - Extend `Dice`.
   - Override the constructor to give a 50% chance of rolling a six.

3. **Optional:** Use inheritance to encapsulate common functionality. Ensure minimized code duplication.

---

## 🚀 Exercise 6: Iterators & Collection Modification

### 📚 Objective:
- **Utilize iterators to safely modify a collection while iterating.**

**Tasks:**

1. Implement a method to remove all dice with a specific value from a sequence:
```java
public static ArrayList<Dice> removeDiceWithSpecificValue(ArrayList<Dice> diceList, int value) {
    // Use an iterator to remove elements
}
```

2. Test your method with a sequence of dice rolls.

**Requirement:** 
- Comment on how using an iterator prevents `ConcurrentModificationException`.

---

This task should now be comprehensive and challenging, providing you with a broad understanding of these essential concepts in Java. Happy coding! 🎉