## 🧑‍💻 Java Programming Task: Exploring Randomness and Collections

This exercise will deepen your understanding of the Java `Random` object, the ternary operator, shallow vs deep copies, debugging, and using Iterators to modify collections. An optional challenge will test your understanding of Java inheritance. Let's get started!

### ✨ Learning Goals

- Understanding the Java `Random` class
- Mastery of the ternary operator
- Differentiating between deep and shallow copies
- Debugging skills: Identifying and fixing bugs
- Using an Iterator to modify collections
- **Optional**: Utilizing inheritance to prevent code duplication

### 📚 Exercise 1 & 2: Theoretical Exploration

#### Exercise 1: 🎲 Understanding Randomness

Java's `Random` class is a powerful tool for generating pseudo-random numbers. Explore [Java's Random API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html) and answer the following questions:

1. How does the `Random` class generate pseudo-random numbers? Discuss the algorithm used.
2. What are some typical uses for the `Random` class in software development?

Provide your answers in a markdown file called `random_theory.md`.

#### Exercise 2: ❓ Ternary Operator Unveiled

The ternary operator is a concise way to perform if-else checks. Review the following ternary operator example and explain it:

```java
int number = random.nextInt(100);
String result = (number % 2 == 0) ? "Even" : "Odd";
```

Questions:
1. Rewrite the ternary expression as a traditional if-else statement.
2. Discuss scenarios where using the ternary operator is advantageous.

Provide your answers in `ternary_explanation.md`.

### 🛠 Exercise 3 & 4: Coding Integration

#### Exercise 3: 🔀 Shuffle and Copy

Implement a method in a new Java class `CollectionUtil` that creates a **shuffled, deep copy** of an `ArrayList<Integer>`. This method must not modify the original list.

```java
public static ArrayList<Integer> shuffleAndCopy(ArrayList<Integer> list);
```

- Implement logic that ensures the shuffled list does not change when the original list is modified.
- Use of the `Random` class for shuffling is required.

#### Exercise 4: 🐞 Debugging and Fixing

Create a method in `CollectionUtil` that has a bug within its logic. The method should aim to return the maximum adjacent sum in an `ArrayList<Integer>`, but currently always returns 0.

```java
public static int findMaxAdjacentSum(ArrayList<Integer> list);
```

- Identify the bug(s) and correct them.
- Provide comments explaining why the fixed version works.

### 🔍 Exercise 5 & 6: Advanced Challenges

#### Exercise 5: 🔄 Modify While Iterating

You will implement a method that removes all integers less than a specified threshold from a list using an Iterator, thereby modifying the list without causing `ConcurrentModificationException`.

```java
public static void filterBelowThreshold(ArrayList<Integer> list, int threshold);
```

- Use the Iterator to safely remove elements while iterating.
- Demonstrate and document the change in list size using a `main` method or unit tests.

#### Exercise 6: 🌳 Exploring Inheritance (Optional)

Create a `Deck` class representing a standard deck of cards using the `Card` class. This class should extend a base class `CardCollection` to avoid duplicating common logic (e.g., shuffling).

1. Implement the `CardCollection` class with basic collection behaviors.
2. Implement `Deck` with methods to draw cards and shuffle.
3. Demonstrate the inheritance's efficiency by minimizing duplicate code.

### 📋 Checklist

- [ ] Answer `random_theory.md` and `ternary_explanation.md`.
- [ ] Implement `CollectionUtil` class with `shuffleAndCopy` and `findMaxAdjacentSum`.
- [ ] Implement `filterBelowThreshold` ensuring proper use of Iterator.
- [ ] (Optional) Complete the inheritance challenge with `Deck` and `CardCollection`.

### 🚨 Documentation & Submission

- Add comments explaining your code logic.
- Use appropriate naming conventions and organize your code into packages if needed.
- Submit all files including markdown answers and Java source code.

### 🎉 Congratulations!

You've tackled an integrated task focusing on randomness, logic, and collections in Java, preparing you for more advanced programming concepts!