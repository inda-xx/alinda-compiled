# Hells Bells

Ringing bells is a task perfectly suited to computers, which can perform the same operation consistently without error or fatigue. If a bell tower required constant ringing, a computer would ensure each ring is perfectly timed, while a human might tire or make mistakes. This week's theme is inspired by the iconic AC/DC song "Hells Bells," and we'll explore the mechanics of iteration and looping in Java.

### 📝 Preparation

- Brush up on the concepts of control flow in Java. This can include:
  - Reading the [Java Tutorials](https://docs.oracle.com/javase/tutorial/java/index.html) to understand `boolean` expressions and operators.
  - Reviewing looping constructs in Java, such as `while` and `for` loops.
  - Familiarizing yourself with [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm) for quick Java code testing, so you can try out code snippets on the fly.

### ✅ Learning Goals

This week's learning goals include:

- Understanding and using `boolean` expressions and operators to control flow.
- Mastering `while` loops to perform repeated tasks.
- Utilizing `for` loops for controlled iteration.
- Practicing code snippets using JShell.
- Understanding and applying the concept of function overloading in Java.

### 🚨 Troubleshooting Guide

If you face any difficulties, follow this path:

1. Check out this week's [forum issues](https://academia.forum/discussion). Is your problem mentioned there?
2. If not, create a [New Issue](https://academia.forum/discussion/new) yourself. Use a descriptive title starting with "Task _x_: _issue summary_".
3. Consult a teaching assistant during [office hours](https://officehours.academia.com). Verify the schedule for the next available session.

We highly encourage collaboration with classmates to deepen your understanding. However, **avoid sharing solutions directly!** Embrace AI for comprehension, but ensure that solutions are independently derived and understandable, as they may be evaluated.

### 🔔 Assignment

Imagine an eerie bell that rings continuously until dawn breaks. Our task is to program the mechanics of this bell using Java, exploring looping constructs and managing control flow.

This exercise involves working with boolean logic to manage states, looping to simulate the passage of time, and function overloading to handle variations in bell ringing patterns.

<details>
<summary> 📚 Understanding Boolean Logic and Operators </summary>

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) can be either true or false. Java offers boolean expressions which, when evaluated, result in `true` or `false`. For instance, the expression `3 > 2` is `true`.

Three primary boolean operators are ["and"](https://en.wikipedia.org/wiki/Logical_conjunction), ["or"](https://en.wikipedia.org/wiki/Logical_disjunction), and ["not"](https://en.wikipedia.org/wiki/Negation), represented in Java as `&&`, `||`, and `!`.

These operators can be combined in logical statements. For example, `true || (false && true)` evaluates as `true`, given operator precedence.

</details>

#### Exercise 1 -- Boolean Expressions Practice

Go to `docs/README.md` and evaluate the boolean expressions provided there. Examples include comparisons and combinations using logical operators. Use JShell to verify your answers effortlessly.

#### Exercise 2 -- Bell Tower Simulation

Create a Java class `BellTower.java` in your `src` directory. Follow these exercises:

1. **Exercise 2.1**: Use a `while` loop to simulate a bell ringing until dawn. Assume dawn breaks after the bell has tolled 10800 times (which can represent 6 hours if one tolls every two seconds).

```java
public class BellTower {
    public void ringUntilDawn() {
        int tollCount = 0;
        while (tollCount < 10800) {
            System.out.println("Ding, dong!");
            tollCount += 1;
        }
    }
}
```

2. **Exercise 2.2**: Iterate over each hour using a `for` loop and print out `n` tolls for the nth hour of the nighttime, thus incrementing the bell tolling pattern.

```java
public void ringHourlyToll() {
    for (int hour = 1; hour <= 12; hour++) { // Simulating a 12-hour nightly cycle
        for (int toll = 0; toll < hour; toll++) {
            System.out.println("Ding dong at hour: " + hour);
        }
    }
}
```

#### Exercise 3 -- Function Overloading: Custom Bell Tolls

Enhance your `BellTower` class to include overloaded functions for customizing the toll pattern.

```java
// Default toll
public void customToll(int duration) {
    System.out.println("Tolling for " + duration + " seconds.");
}

// Overloaded toll with custom message
public void customToll(int duration, String message) {
    System.out.println("Tolling: " + message + " for " + duration + " seconds.");
}
```

Experiment with different toll patterns, using both overloaded methods in JShell to test quickly.

#### Exercise 4 -- Time Simulation and Display

Design a custom display in your bell tower that outputs the current toll and time left until dawn, using a boolean expression to stop exactly at sunrise.

```java
public void timeSimulation(int seconds) {
    int whileCount = 0;
    while (seconds > 0 && !isDawn(seconds)) {
        System.out.println("Seconds remaining: " + seconds);
        seconds--;
        whileCount++;
    }
}

private boolean isDawn(int seconds) {
    return seconds <= 0;
}
```

Call this method with `timeSimulation(3600)` to simulate an hour at dawn.

> **Assistant's Note**: This week's tasks are designed with iteration in mind. Utilize JShell to test each piece of functionality quickly and effectively, ensuring mastery over boolean logic, loops, and overloaded functions. This will be instrumental when debugging larger codebases.

By engaging with this exercise, you'll gain deeper insights into control flow, honing skills essential for tackling complex programming challenges in Java.