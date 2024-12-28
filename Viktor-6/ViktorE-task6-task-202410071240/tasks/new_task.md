# 🎲 Creating a Lottery Application in Java

Welcome to your task of creating a simple lottery application. This project is designed to challenge and enhance your skills in using Java. You will explore various fundamental and advanced concepts while building a simplified version of a lottery system. This task is divided into multiple exercises that sequentially build upon each other.

---

## 📚 Learning Goals

1. **Understanding the Java `Random` object** 
2. **Understanding the Ternary Operator**
3. **Deep vs. Shallow Copy**
4. **Finding and Fixing Bugs**
5. **Using an Iterator to Modify a Collection During Iteration**
6. **Optional: Using Inheritance to Avoid Code Duplication**

---

## 🏗️ Exercise Overview

- **Exercises 1 & 2**: Theoretical understanding and explanation.
- **Exercises 3 & 4**: Practical coding to apply theoretical concepts.
- **Exercises 5 & 6**: Comprehensive exercises with incremental difficulty.

---

## Exercise 1: 🎲 Random Object Deep Dive

**Objective:** Gain a theoretical understanding of Java's `Random` object.

1. **Question:** Explain what the `Random` class is used for in Java. 
   
   - **Hint:** Discuss the difference between using Math.random() and `Random` class.
   
2. **Question:** Describe how you can use the `Random` class to simulate rolling a six-sided die.

3. **Discussion:** Are there any risks or considerations when using the `Random` class for security-sensitive operations?

---

## Exercise 2: 🔀 Ternary Operator Comprehension

**Objective:** Understand and explain the use of the ternary operator in Java.

1. **Question:** Explain the syntax and usage of the ternary operator. Provide an example where it can be used to simplify code.

2. **Task:** Consider the following code and refactor it using the ternary operator:

   ```java
   int number = 10;
   String message;
   
   if(number > 5) {
       message = "Number is greater than 5";
   } else {
       message = "Number is 5 or smaller";
   }
   ```

---

## Exercise 3: 📜 Implementing a Lottery Ticket Generator

**Objective:** Use the `Random` object to generate lottery tickets.

1. **Task:** Write a Java method `generateTicket()` that generates and returns a lottery ticket with 6 unique random numbers between 1 and 49. Use Java's `Random` object.

   ```java
   import java.util.ArrayList;
   import java.util.Random;

   public class Lottery {
       public ArrayList<Integer> generateTicket() {
           // Your implementation goes here.
       }
   }
   ```

2. **Question:** Discuss the implications of deep vs. shallow copying if you were to store multiple copies of these tickets for further manipulation.

---

## Exercise 4: 🐛 Bug Hunting and Fixing

**Objective:** Understand common bugs and practice fixing them.

1. **Task:** There is a bug in the code snippet below. Identify and fix it.

   ```java
   Random random = new Random();
   int number = random.nextInt(49) + 1;
   int[] lotteryNumbers = new int[6];
   
   for(int i = 1; i < 6; i++) {
       lotteryNumbers[i] = random.nextInt(49) + 1;
   }
   ```
   
2. **Discussion:** Explain your fix and any assumptions you made.

---

## Exercise 5: 🔄 Modify Collection During Iteration

**Objective:** Use an `Iterator` to safely modify a collection during iteration.

1. **Task:** Implement a method to remove any duplicate numbers from a lottery ticket using an `Iterator`. Assume you've discovered duplicates in a generated ticket.

   ```java
   import java.util.ArrayList;
   import java.util.Iterator;

   public class Lottery {
       public void removeDuplicates(ArrayList<Integer> ticket) {
           // Implement using Iterator
       }
   }
   ```

2. **Question:** Why is directly modifying a collection during iteration often a problem? How does using an `Iterator` solve it?

---

## Exercise 6: 🏆 Extending the Lottery System with Inheritance

**Objective (Optional):** Use inheritance to avoid code duplication for different types of lottery games.

1. **Task:** Suppose you have different types of lottery games (e.g., 6/49 and 5/50). Refactor your code using inheritance to create a base `LotteryGame` class and specific subclasses for different games.

   ```java
   public class LotteryGame {
       // Common attributes and methods
   }

   public class SixFortyNineGame extends LotteryGame {
       // Specific implementation for the 6/49 game
   }

   public class FiveFiftyGame extends LotteryGame {
       // Specific implementation for the 5/50 game
   }
   ```

2. **Discussion:** Explain the benefits of using inheritance in this scenario. What are the trade-offs?

---

Happy Coding! 💻🎉 Remember to test your solutions thoroughly and practice explaining your code and reasoning as you work through these exercises. Keep exploring the nuances and efficiency of Java programming!