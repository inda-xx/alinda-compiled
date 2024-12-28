# Prime Number Explorer

This week's task is about exploring the world of prime numbers using Java collections. You will work with arrays and `ArrayList`s, learn how to leverage the `static` keyword, and combine loops with collections to solve a series of tasks.

### 📝 Preparation

- Review the [lecture slides on arrays and collections](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Complete the exercises in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals

This task will help you:

* Work effectively with `Arrays`
* Understand and utilize the `static` keyword
* Master working with `ArrayLists`
* Combine loops and collections in Java

### 🚨 Troubleshooting Guide

If you encounter issues:

1. Check out this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others have encountered similar problems.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title, starting with "Task: summary of problem here".
3. Discuss with a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) session. Consult your schedule for the next lab timing.
4. Discussions with course peers are encouraged, but ensure solutions remain your own. Remember, you should understand and be able to explain your solutions during examinations.

### 🏛 Assignment: Calculate Prime Numbers Between Two Integers

For this assignment, you'll write methods to find all prime numbers between two integers using various Java constructs.

#### 📚 Arrays and `ArrayList` Overview

Java provides arrays to store fixed-size collections of elements of a single type, while `ArrayList`s offer dynamic resizing. Here's how you can declare and use an array:

```java
// Declaring an array
int[] numbers = new int[5];

// Initializing an array with values
int[] primes = {2, 3, 5, 7, 11};
```

To work with `ArrayList`s, you must first import the `ArrayList` class:

```java
import java.util.ArrayList;

ArrayList<Integer> dynamicList = new ArrayList<>();
dynamicList.add(5);
dynamicList.add(10);
```

#### 📚 The `static` Keyword

The `static` keyword indicates that a particular method or field belongs to the class, rather than instances of the class. This means you can call static methods without creating an instance of the class:

```java
public class MathUtils {
    public static boolean isPrime(int number) {
        // Implementation
    }
}

boolean result = MathUtils.isPrime(7);
```

#### Exercise 1 -- Create a Class

Create a class named `PrimeNumberExplorer` in a file called `PrimeNumberExplorer.java`.

#### Exercise 2 -- Implement a Static Method to Calculate Primes

Your first task is to implement a static method in the `PrimeNumberExplorer` class with the following signature:

```java
public static int[] calculatePrimes(int start, int end)
```

This method should return an array containing all prime numbers between `start` and `end` (inclusive). If `start > end`, the method should return an empty array. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

#### Exercise 3 -- Utilize `ArrayList` for Flexibility

Now, modify the `calculatePrimes` method to take advantage of `ArrayList`s by adding an overloaded method with this signature:

```java
public static ArrayList<Integer> calculatePrimesList(int start, int end)
```

This method should perform the same computation as in Exercise 2, but it should return an `ArrayList<Integer>` instead of an array. 

#### Exercise 4 -- Using Loops and Collections

Implement the method logic for both exercises so it efficiently combines loops and collections to compute the prime numbers. Iterate through your range using a loop and store qualifying numbers (i.e., primes) in an `ArrayList`.

#### Exercise 5 -- Main Method Testing

Create a `main` method to test the correctness of your implementations. Make sure your methods handle edge cases, such as `start` being greater than `end`, or the range having no prime numbers:

```java
public static void main(String[] args) {
    int[] primesArray = calculatePrimes(10, 30);
    System.out.println("Primes in array form: " + Arrays.toString(primesArray));

    ArrayList<Integer> primesList = calculatePrimesList(10, 30);
    System.out.println("Primes in list form: " + primesList);
}
```

### Explanation of Prime Number Calculation

A number *n* is prime if it is greater than 1 and is not divisible by any number other than 1 and itself. This can be checked by trying to divide *n* by each number from 2 to √*n*.

#### Further Exploration

Optionally, explore ways to optimize prime checking using the Sieve of Eratosthenes algorithm, which can offer improvements in performance for large ranges.

This assignment combines arrays, the adaptive capabilities of `ArrayList`, and efficient looping to accurately explore prime numbers, enhancing your understanding and application of Java collections. Good luck with unveiling the treasures of prime numbers! ✨