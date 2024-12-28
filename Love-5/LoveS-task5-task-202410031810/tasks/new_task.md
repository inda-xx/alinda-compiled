# Collections: Exploring Arrays and ArrayLists with Strings

This week, we delve into Java collections to understand how to work with `Array` and `ArrayList`—two essential tools for organizing groups of objects in Java.

### 📝 Preparation

- Review the [lecture slides on Collections](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Read and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals

This week's learning goals include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure: <br/>

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, **but do not share answers!** Similarly, use of any AI services 🤖 are great to help explain things, **but please do not submit AI-generated solutions**—you must be both responsible for your own solutions and must be able to explain them under examination.

### 🏛 Assignment

Java provides powerful data structures like `Arrays` and `ArrayLists` that allow programmers to store and manipulate collections of objects. This week's assignment will guide you through creating a Java program that involves storing and manipulating strings using these data structures.

<details>
<summary> 📚 A summary of Java's Arrays </summary>

Arrays in Java are a basic way to store a fixed number of items of a specific data type. Here’s a quick reference:

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "cucumber"};
        
        // Access array elements
        System.out.println(fruits[0]); // Outputs "apple"

        // Loop through an array with a for-loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
```

Arrays are great when the number of elements is known and fixed.
---
</details>

<details>
<summary> 📚 A summary of Java's ArrayLists </summary>

`ArrayList` is a part of the Java Collections Framework and provides a more flexible way to store collections of objects. You can change its size dynamically.

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declare and initialize an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cucumber");
        
        // Access elements
        System.out.println(fruits.get(0)); // Outputs "apple"

        // Loop through an ArrayList of strings
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

`ArrayList`s allow durable, flexible collections easily adapted to various use cases.
---
</details>

<details>
<summary> 📚 The static keyword </summary>

The `static` keyword in Java means that the particular member belongs to a type itself, rather than to an instance of that type.

```java
public class StaticExample {
    // Static variable
    static int count = 0;
    
    // Static method
    public static void displayCount() {
        System.out.println("Count: " + count);
    }
}
```

By using `static`, you ensure that you can call these methods and fields without creating instances.
---
</details>

#### Exercise 1 -- Create a Class for String Manipulation

Create a new class called `StringCollections` in the `src` folder.

#### Exercise 2 -- Using Arrays to Store Strings

Write a static method that accepts a list of strings and stores them in an array.

```java
public static String[] storeUsingArray(String[] words)
```

- Accepts a list of strings and returns a new array containing these strings.
- Print each word in the array using a `for` loop.

#### Exercise 3 -- Using ArrayLists to Store Strings

Modify your previous method to use an `ArrayList`.

```java
public static ArrayList<String> storeUsingArrayList(String[] words)
```

- Store the strings in an `ArrayList` instead of an array.
- Utilize a `foreach` loop to print each word in this `ArrayList`.

#### Exercise 4 -- Combining Arrays and ArrayLists with Loops

Create a method that combines the array and the `ArrayList` you created. Use a loop to iterate over each collection and display their contents.

```java
public static void displayBothCollections(String[] array, ArrayList<String> arrayList)
```

- Print the contents of both the array and the `ArrayList` using loops.
- Ensure that they display exactly the same values between each collection.

#### Exercise 5 -- Static Utility Method for Size Comparison

Develop a static method that compares the sizes of two collections, a `String[]` array and an `ArrayList<String>`, checking if they are equal.

```java
public static boolean areSizesEqual(String[] array, ArrayList<String> arrayList)
```

- Return `true` if the sizes of the array and `ArrayList` are equal, otherwise return `false`.

> **Assistant's note:** Focus on understanding the behavior of `Arrays` versus `ArrayLists`, `for` versus `foreach` loops, and usage of the `static` keyword to simplify code interaction without instantiating objects. 

By the end of these exercises, you should have a solid understanding of working with collections in Java and expanding your proficiency with `static` methods. 🌟