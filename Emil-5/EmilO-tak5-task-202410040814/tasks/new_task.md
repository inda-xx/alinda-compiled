# Collections Tasks in Java: Understanding Arrays and ArrayLists

This week introduces Java collections - `Array` and `ArrayList` - as a way of organizing groups of objects. Within this task, you will explore these powerful tools and understand how the static keyword fits into writing reusable code. Let's dive into the world of Collections!


### 📝 Preparation

- Review the [lecture slides on Collections](https://docs.google.com/) 
- Read and answer all questions in [Module 5: Grouping Objects](https://docs.google.com/)

### ✅ Learning Goals

This week's learning goals include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, **but do not share answers!** Similarly, using any AI services 🤖 can help explain things, but please do not submit AI-generated solutions - you must be both responsible for your solutions and be able to explain them under examination.

### 🏛 Assignment

In Java, working effectively with collections like `Arrays` and `ArrayLists` enhances your program's capability to manage and manipulate data collections comprehensively. 

**Focus: Working with Arrays, Static Keyword, ArrayLists, Loops, and Collections.**

<details>
<summary> 📚 Java Arrays and ArrayLists Overview</summary>

Arrays are fixed-length collections of data of the same type:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Output: 1
```

Meanwhile, `ArrayLists` offer dynamic data handling:

```java
import java.util.ArrayList;

ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
System.out.println(fruits.get(1)); // Output: Banana
```

Important methods for both include iteration techniques like loops to go through all elements.

---

#### The Static Keyword in Java

Methods can be made `static`, indicating they belong to the class level rather than instances. A `static` method can be invoked without creating an instance of the class:

```java
public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Usage
int sum = MathUtil.add(5, 3);
```

---

</details>

### Exercise 1: Calculating Array Averages

**Objective**: Learn to process data within arrays and utilize loops.

- **Task 1.1**: Write a static method to calculate the integer average of an `int[]` array. 

  ```java
  public static int calculateAverage(int[] numbers) {
      // Code here
  }
  ```

- **Task 1.2**: Implement another static method for a `double[]` array to return a precise average.

  ```java
  public static double calculateAverage(double[] numbers) {
      // Code here
  }
  ```

### Exercise 2: Array Manipulation with ArrayLists

**Objective**: Learn to seamlessly transition between fixed and dynamic collections.

- **Task 2.1**: Create a static method that takes an `int[]` array and returns an `ArrayList<Integer>` of odd numbers only.

  ```java
  public static ArrayList<Integer> filterOddNumbers(int[] array) {
      // Code here
  }
  ```

- **Task 2.2**: Write a method that reverses an `ArrayList` using loops and returns it. 

  ```java
  public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
      // Code here
  }
  ```

### Exercise 3: Synthesizing Knowledge with a Complex Problem

**Objective**: Employ learned techniques to develop a utility performing complex data association.

- **Task 3**: Construct a class, `CollectionUtils`, incorporating the previously created methods to offer robust data operations.

  ```java
  public class CollectionUtils {

      public static int calculateAverage(int[] numbers) {
          // Method from Task 1.1
      }

      public static double calculateAverage(double[] numbers) {
          // Method from Task 1.2
      }

      public static ArrayList<Integer> filterOddNumbers(int[] array) {
          // Method from Task 2.1
      }

      public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
          // Method from Task 2.2
      }
  }
  ```

### Conclusion

In this assignment, you have applied critical programming concepts involving arrays, arraylists, and static methods while combining iteration techniques. These exercises are crafted to solidify your understanding and improve your competency in handling Java collections.

Feel free to reach out for further clarifications, and keep coding! 🌟