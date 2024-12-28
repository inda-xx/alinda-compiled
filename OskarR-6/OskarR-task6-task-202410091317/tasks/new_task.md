## 📚 Java Programming Challenge: Randomness and Collections

Welcome to this comprehensive programming challenge designed to enhance your understanding of Java's `Random` class, the ternary operator, deep and shallow copies, debugging, and collection manipulation. We will gradually build upon these concepts through a series of exercises that will culminate in applying this knowledge to real-world scenarios. This challenge will also provide an optional opportunity to explore inheritance as a means to reduce code duplication. Prepare to dive deep into these concepts!

---

### 🎯 Learning Goals

- **Understand and use the Java `Random` object**
- **Master the ternary operator for conditional assignments**
- **Differentiate between deep and shallow copies in Java**
- **Develop debugging skills by finding and fixing bugs**
- **Apply Iterators to modify collections during iteration**
- **(Optional): Leverage inheritance to avoid code duplication**

---

### 🔍 Exercise 1: Exploring the `Random` Object

In this exercise, you'll study the Java `Random` class to understand how it generates random numbers. Review the [Java documentation for `Random`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html) and answer the following questions:

1. How does the `nextInt()` method work? Describe its behavior and arguments.
2. What is the purpose of the `setSeed(long seed)` method, and how does it affect number generation?
3. Write a brief explanation of how randomness is achieved programmatically in Java.

---

### 🤔 Exercise 2: The Magic of the Ternary Operator

The ternary operator is a powerful tool for writing concise conditional expressions in Java. Instead of writing if-else statements, the ternary operator allows for a more compact expression:

```java
int value = condition ? valueIfTrue : valueIfFalse;
```

Answer the following:

1. Describe a scenario where using a ternary operator simplifies your code.
2. Can the ternary operator be nested? Discuss the readability of nested ternary operators and any pitfalls.

---

### 💻 Exercise 3: Random Number Generation with Output

Create a Java class `RandomUtil`. This class should have a method named `generateRandomNumbers` that generates a list of `n` random integers between 1 and 100.

```java
public static ArrayList<Integer> generateRandomNumbers(int n)
```

**Task:**

- Implement the method and print each number using a ternary operator to indicate whether it is odd or even.

Example Output:
```
Number: 42 is even
Number: 37 is odd
```

---

### 🖇️ Exercise 4: Deep vs Shallow Copy - Shuffle the Deck

In this exercise, you will create a method that shuffles a list of integers, showing both a deep and shallow copy approach. Incorporate the `Random` object to achieve random shuffling.

```java
public static ArrayList<Integer> shuffleList(ArrayList<Integer> originalList)
```

**Task:**

- Implement the method with careful consideration of deep and shallow copies. Document the differences in your code comments.

---

### 🔧 Exercise 5: Bug Fixing and Iterator Usage

Modify the `RandomUtil` class to include a method that removes all instances of a specified number from a list of integers.

```java
public static ArrayList<Integer> removeNumber(ArrayList<Integer> list, int numberToRemove)
```

**Challenge:**

- Ensure your solution uses an `Iterator`. Iterate over the list and remove the specified number without causing a `ConcurrentModificationException`.
- Begin with code that has a small, intentional bug and fix it. Document your debugging process.

---

### 🌟 Exercise 6: Inheritance for Dice Simulation (Optional)

Create two classes, `Dice` and `BiasedDice`, utilizing inheritance to model a standard and a biased dice.

1. **Dice**:
    ```java
    public class Dice {
        // Fields: int value, Random random
        // Default roll generates 1 to 6
    }
    ```

2. **BiasedDice**:
    ```java
    public class BiasedDice extends Dice {
        // 50% chance to roll a 6, otherwise 1-5
    }
    ```

**Task:**

- Implement the classes, ensuring the `BiasedDice` leverages and extends the behavior of `Dice`.
- Use the ternary operator to decide the outcome of the biased dice roll.

---

### ✅ Summary and Submission

Upon completion, ensure you have performed:

- [ ] Experimented with the `Random` class and ternary operator in exercises 1 and 2.
- [ ] Developed practical coding skills from exercises 3 to 6.
- [ ] Optionally explored inheritance to consolidate your understanding.

These exercises are designed to build a robust understanding of randomness and collection manipulation in Java. As you complete each step, review your code for efficiency and clarity. Remember, exploring optional topics like inheritance can further enrich your understanding and coding fluency.

---

Good luck, and happy coding! If you encounter any errors or inconsistencies, don't hesitate to reach out with questions for clarification.