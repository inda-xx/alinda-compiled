# Arrays and Sets: Deep Dive into Java Collections 🌟

This week's task takes a comprehensive look at Java's essential collection frameworks: Arrays and ArrayLists. You'll explore manipulating data within these foundational structures while developing a deeper understanding of loops, static methods, and set theory. 

### 📝 Preparation 

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Read and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals
This week's learning targets include:

- Working with `Arrays` and manipulating data within them
- Understanding the usage and significance of the `static` keyword
- Creating and managing dynamic collections using `ArrayLists`
- Applying loops to iterate and modify collections

### 🚨 Troubleshooting Guide
If you encounter issues while working through this task, follow these steps:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) for similar problems faced by others.
2. If the issue remains unresolved, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) and include a descriptive title starting with "Task: *your problem summary*".
3. Engage with a TA during the [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA), scheduled as per your itinerary.

Collaborative discussions with peers are encouraged while maintaining academic integrity—please do not share direct solutions. Similarly, use any AI tools for clarification, but ensure you are submitting your own understanding.

### 🏛 Assignment Overview

In Java, arrays provide a means to store fixed-size sequential elements of the same type. On the other hand, `ArrayList` offers dynamic arrays whose size can change. This task will guide you through basic operations on arrays and introduce you to modeling mathematical sets with `ArrayLists`. Both tools are pivotal in managing and organizing data efficiently.

#### 📚 Understanding Java Arrays

Arrays in Java are zero-indexed collections of elements. They hold elements in a contiguous block of memory, allowing for efficient access. The syntax includes square brackets and you can initialize arrays directly with values using curly braces:

```java
int[] numbers = {2, 4, 6, 8}; // initializes an array with four elements
```

For array manipulation, loops are handy:

```java
for(int number : numbers){
    System.out.println(number);
}
```

Methods operating on arrays are declared `static` for calling without instantiating objects:

```java
public static int findSum(int[] array) {
    int sum = 0;
    for(int i : array) {
        sum += i;
    }
    return sum;
}
```

-----

#### Exercise 1: Arrays in Action

1. **Average of an Integer Array**
   - Implement a method:
     ```java
     public static int average(int[] array)
     ```
   - Return the integer average of the array after rounding down.

2. **Average of a Double Array**
   - Implement a method:
     ```java
     public static double average(double[] array)
     ```
   - Compute the double average of the array.

3. **Smallest Element**
   - Find the smallest element in an array. Your method should return `Integer.MAX_VALUE` for an empty array.
   - Method header:
     ```java
     public static int smallestElement(int[] array)
     ```

4. **Reverse Array**
   - Implement a method that creates a reversed copy of the array without modifying the original:
     ```java
     public static int[] reverse(int[] array)
     ```

5. **Extract Even Numbers**
   - Create a method to return an array with all even numbers:
     ```java
     public static int[] evenNumbers(int[] array)
     ```

-----

#### 🧑‍🔧 Creating a Set with ArrayLists

Mathematical sets can be effectively modeled using `ArrayLists`, ensuring only unique elements are present. The universe of this task is the set of integers from 0 to 99.

Ensure to import ArrayList into your Java file:
```java
import java.util.ArrayList;
```

#### Exercise 2: Set Theory in Java

1. **Generate a Set**
   - Define a method:
     ```java
     public static ArrayList<Integer> generateSet(int min, int max)
     ```
   - This method should return an `ArrayList` containing integers ∈ [min, max). Handle edge cases like overflows beyond 99.

2. **Union of Sets**
   - Implement:
     ```java
     public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b)
     ```
   - Return the union (unique elements) of both lists.

3. **Intersection of Sets**
   - Construct:
     ```java
     public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b)
     ```
   - Return elements common to both.

4. **Complement of a Set**
   - Method:
     ```java
     public static ArrayList<Integer> complement(ArrayList<Integer> a)
     ```
   - Return the complement set in the universe [{0, ..., 99}].

5. **Cardinality Calculation**
   - Create a method:
     ```java
     public static int cardinality(ArrayList<Integer> a)
     ```
   - Calculate the size of the set.

6. **Cardinality of a Union**
   - Implement:
     ```java
     public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b)
     ```
   - Calculate the size of the union of two sets.

---

Successful completion of these exercises will deepen your proficiency with Java collections, reinforce programming fundamentals, and sharpen problem-solving skills. Dive into these tasks, and refine your ability to manipulate and manage data structures in Java!