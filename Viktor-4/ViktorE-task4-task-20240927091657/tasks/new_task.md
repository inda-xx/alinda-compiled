# Adventure Seekers: Treasure Hunt with Java

Java is a gem of a programming language that equips us with powerful control structures like `boolean` expressions, loops, and method overloading to break down complex problems. Let's embark on a thrilling treasure hunt by crafting a Java quest map where you will use these concepts to navigate your way through.

### 📝 Preparation

- Brush up on basic boolean expressions and their usage in Java.
- Explore the [Java Tutorials on Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html).
- Experiment with JShell to practice Java snippets rapidly.

### ✅ Learning Goals

This task will help you achieve:

* Grasping `boolean` expressions and logical operators.
* Mastering `while` and `for` loops.
* Utilizing JShell for Java exploration.
* Understanding and applying function overloading.

### 🚨 Troubleshooting Guide

If you encounter any hurdles:

1. Refer to the [course discussion forum](https://example.com/forums) for previously addressed issues.
2. If unresolved, create a [New Issue](https://example.com/issues/new) titled "Treasure Hunt: [Brief Problem Description]".
3. Consult a TA during the [weekly support session](https://example.com/support).

Collaborate with peers for discussion but don't share your solutions. Use any AI tools for explanation — the solution must be your own, and you should be able to elaborate on it during tests.

### 🏛 Assignment: Treasure Hunt

Navigate the challenges ahead using logical constructs and loops. Each task leads you closer to the treasure, honing your Java skills with each step.

#### Exercise 1: Boolean Expressions as Keys

In the `src` folder, create a new file `TreasureHunt.java`. Begin with unlocking ancient doors using boolean expressions by implementing:

```java
public boolean tryUnlockDoor(int hintCode)
```

- Use boolean logic to determine if the hint code matches the ancient key codes. Suppose valid hint codes are numbers that are multiples of 3 or 7 and not both.

#### Exercise 2: Navigating the Cave

You need a `while` loop to continuously dodge traps until finding the treasure. Add:

```java
public void dodgeTraps()
```

- Use a `while` loop to count your steps until you reach step 5000 where the treasure is guarded. Use a `boolean` expression to avoid traps at every 100th step.

#### Exercise 3: Treasure Map with For-Loops

Put together a treasure map using a `for` loop. Implement:

```java
public void printTreasureMap(int size)
```

- The map is a square grid of `*` characters with specified `size`.
- Use a `for` loop to print rows and columns, forming a complete grid.

#### Exercise 4: Function Overloading for Enhancing Treasure Hunt

Implement two overloaded methods for calculating rewards:

```java
public int calculateReward(int goldCoins)
public double calculateReward(int goldCoins, double multiplier)
```

- The first method returns the gold coins equivalent doubled as the reward.
- The second method uses a `multiplier` to adjust the reward, demonstrating function overloading.

#### Exercise 5: Testing with JShell

Use JShell to test each small piece of your solution as you develop it. Type the following in your command line:

```bash
jshell TreasureHunt.java
```

Verify individual methods like:

```java
new TreasureHunt().tryUnlockDoor(21);
new TreasureHunt().printTreasureMap(5);
```

Practice constructing and interacting with code snippets swiftly using JShell!

#### Exercise 6: Creating Time-Limited Tasks with Loops

Finally, create advanced logic using loops in:

```java
public void trapCountdown(int seconds)
```

- Use a `for` or `while` loop to implement a countdown from the specified number of `seconds`, printing a warning every time it decrements. Introduce suspense by awaiting graduation with a logical expression every three ticks.

---

Embarking on this treasure hunt not only sharpens your Java skills but also paves the way for visualizing problems and solutions using code effectively. Enjoy the adventure, and may the Java Elements be with you! 🏴‍☠️💎