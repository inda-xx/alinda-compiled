# Building a Simple 12-hour Clock in Java

A clock is an essential tool that helps us keep track of the time. In this week's lab, you will build a simple 12-hour clock in Java using various programming concepts. You'll work with boolean expressions, different types of loops, function overloading, and utilize JShell to validate your Java code incrementally. This exercise is designed to reinforce your understanding of Java syntax and programming paradigms.

### 📝 Preparation

- Review the following resources:
  - [Lecture Slides on Booleans and Loops](https://docs.google.com/presentation/d/1kcsmcuBBu4Jr3O_r6eNP6IFrP6DEITDWeRS5_7rtV30/edit#slide=id.p)
  - [Module on Looping with For-Each](https://qbl.sys.kth.se/sections/dd1337_programming/page/looping_with_foreach)
  - [Module on Iteration](https://qbl.sys.kth.se/sections/dd1337_programming/page/iteration__continued)

### ✅ Learning Goals

By the end of this assignment, you should be able to:

* Understand and use `boolean` expressions and operators.
* Implement and understand the flow of `while` loops.
* Implement and understand the flow of `for` loops.
* Use JShell to test parts of your Java program quickly.
* Understand and apply function overloading.

### 🚨 Troubleshooting Guide

If you encounter any difficulties, follow this guide:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if other students faced similar problems.
2. If not, create a new issue [here](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title: "Task x: summary of problem here".
3. Attend the weekly lab and ask a TA in person. Check your schedule for lab timings.

Remember, discussing with peers is encouraged, but direct sharing or copying of solutions is not allowed.🚀

### 🏛 Assignment

In this task, you'll create and manage the functionality of a simple 12-hour clock using Java. This involves using boolean expressions, looping structures, constructors, and function overloading.

#### Exercise 1: Understand Boolean Expressions and Operators

Use JShell to evaluate the following boolean expressions. Open your terminal and type `jshell` to start.

```java
// Evaluate these expressions
boolean expr1 = (5 < 10 && 2 < 3);
boolean expr2 = (14 != 14 || 2 > 1);
boolean expr3 = !(10 == 5);

// Experiment with more expressions of your own
```

#### Exercise 2: Implement Basic 12-hour Clock Structure

1. Create a class named `Clock` in your `src` folder.
2. Define three private integer fields: `hours`, `minutes`, and `seconds`.

```java
public class Clock {
   private int hours;
   private int minutes;
   private int seconds;
   
   // Define getter methods
   public int getHours() { return hours; }
   public int getMinutes() { return minutes; }
   public int getSeconds() { return seconds; }
}
```

#### Exercise 3: Validate Clock Time

Add `public` setter methods that validate input for `hours`, `minutes`, and `seconds`:

- `setHours(int h)`: Valid hours are 1-12.
- `setMinutes(int m)` and `setSeconds(int s)`: Valid values are 0-59.

```java
public void setHours(int hours) {
   if (hours >= 1 && hours <= 12) this.hours = hours;
}

public void setMinutes(int minutes) {
   if (minutes >= 0 && minutes <= 59) this.minutes = minutes;
}

public void setSeconds(int seconds) {
   if (seconds >= 0 && seconds <= 59) this.seconds = seconds;
}
```

#### Exercise 4: Constructor Overloading

Implement two constructors:

1. A default constructor that sets the time to 12:00:00.
2. An overloaded constructor with parameters for initializing hours, minutes, and seconds.

```java
// Constructor without parameters
public Clock() {
   this.hours = 12;
   this.minutes = 0;
   this.seconds = 0;
}

// Overloaded constructor
public Clock(int hours, int minutes, int seconds) {
   this(); // Call default constructor
   setHours(hours);
   setMinutes(minutes);
   setSeconds(seconds);
}
```

#### Exercise 5: Display Time (Override `toString` Method)

Override the `toString` method to return the time in the format "HH:MM:SS".

```java
@Override
public String toString() {
   return String.format("%02d:%02d:%02d", hours, minutes, seconds);
}
```

Launch JShell and test the toString method:

```bash
jshell Clock.java
Clock myClock = new Clock(10, 5, 30);
System.out.println(myClock.toString());  // Output: 10:05:30
```

#### Exercise 6: Incrementing Seconds - Tick Method

Create a `tick` method that advances the time by one second.

```java
public void tick() {
   seconds = (seconds + 1) % 60;
   if (seconds == 0) {
       minutes = (minutes + 1) % 60;
       if (minutes == 0) {
           hours = (hours % 12) + 1;
       }
   }
}
```

#### Exercise 7: Implement and Test Looping with Function Overloading

Add a tick method to move the clock forward by a given number of seconds. Use a loop structure for this (choose between `for` or `while`).

```java
public void tick(int seconds) {
   for (int i = 0; i < seconds; i++) {
       tick();
       System.out.println(toString());
   }
}
```

Test this method using JShell to see the output after each tick:

```bash
jshell
Clock myClock = new Clock(11, 59, 58);
myClock.tick(5);  // Simulates ticking 5 seconds forward
```

Congratulations! 🎉 You've now built a simple clock using loops, boolean logic, and function overloading, and you've practiced using JShell for quicker iteration and testing of your Java programs.