# 📚 Java Programming Task: "Robo-Car Fleet Management"

Welcome to the "Robo-Car Fleet Management" task! In this assignment, you'll apply your Java skills to tackle challenges faced by a futuristic car-sharing company, RoboFleet, which maintains a fleet of autonomous cars 🚗🤖. This task will provide you with a comprehensive understanding of Java concepts through a series of exercises that increase in complexity as you progress. Let's dive into the world of autonomous cars and data manipulation!

## 🛠 Objectives
- Understand and use the `Random` object.
- Utilize the ternary operator to simplify conditional logic.
- Know the difference between deep and shallow copies.
- Identify and fix bugs in provided code snippets.
- Use an `Iterator` to modify collections during iterations.
- **Optional**: Implement inheritance to reduce code duplication.

## Exercise 1: Theory Time - Randomness and Conditionals 🤔🃏
### 1.1 Understanding Java's `Random` Object
Explain the role and applications of the `Random` class in Java. Consider the following questions:
- How does the `Random` class produce pseudorandom numbers?
- How can it be useful in a real-world application like managing a fleet of autonomous cars for routes or tasks?

**Expected Outcome:**
Write a brief explanation (150-200 words) on how `Random` can be used, focusing on fleet management scenarios.

### 1.2 Understanding the Ternary Operator
The ternary operator is a compact way of writing conditional statements. Explain how the ternary operator works and provide an example in the context of deciding whether a car should go for recharging based on its current battery level.

**Expected Outcome:**
Provide one example using the ternary operator to set a status message for the car based on its battery level.

## Exercise 2: Differentiating Copies 🖨️🔍
### 2.1 Shallow vs. Deep Copy
With Java array lists representing car details, explain the difference between shallow and deep copies. Discuss the implications of each in the scenario of duplicating the car fleet list for maintenance scheduling.

**Expected Outcome:**
Describe scenarios in fleet management where each type of copy might cause issues or be beneficial.

## Exercise 3: Bug Hunt 🔍🐞
Provided Code:
```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class FleetManager {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car01");
        cars.add("Car02");
        cars.add("Car03");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.equals("Car02")) {
                cars.remove(car); // This line causes a ConcurrentModificationException
            }
        }
    }
}
```
### 3.1 Bug Identification and Fixing
Identify the bug in the code, explain why it occurs, and propose a solution using the `Iterator` object.

**Expected Outcome:**
Correct the bug using `iterator.remove()` instead of directly removing from the list. Provide an explanation for your correction.

## Exercise 4: Practical Application - Random and Ternary 🚗⚡
### 4.1 Battery Management System
Implement a method that simulates the battery percentage for all cars using `Random`. Then, use a ternary operator to log whether each car needs recharging.

**Method Specification:**
```java
public static void manageBattery(ArrayList<String> cars)
```
- Use `Random` to generate battery levels (1-100) for each car.
- Use a ternary statement to determine if a car requires charging (`battery <= 20`).

## Exercise 5: Deep Dive - Fleet Cloning and Maintenance 🛠️🔄
### 5.1 Cloning Strategy
Implement two methods for copying the fleet: one for shallow copy and one for deep copy, then explain their implications on the schedule.

**Method Specification:**
```java
public static ArrayList<String> shallowCopy(ArrayList<String> original)
public static ArrayList<String> deepCopy(ArrayList<String> original)
```

- Discuss how modifications in one list affect each other.

### 5.2 Maintenance Scheduling
Use the copies to demonstrate a maintenance schedule without affecting the main list, simulating deep copy advantages.

## Exercise 6: Bonus Challenge - Inheritance for Efficient Management 🔄🧬
### 6.1 Reducing Code Duplication
Design a base class `Car` with a subclass `ElectricCar`. Add properties related to battery management and features. Use inheritance to implement efficient fleet management.

**Class Specification:**
```java
class Car {
    String model;
    int year;
    // Tasks like starting, stopping, and basic maintenance checks
}

class ElectricCar extends Car {
    int batteryLevel;
    // Extra tasks specific to electric cars like recharging
}
```
- Share how inheritance reduces redundancy and promotes reusability in code, especially in a fleet scenario where various types of cars are managed.

---

## Conclusion
By completing these exercises, you will gain insights into applying random generation, conditional simplification, iteration modification, and inheritance principles within a real-world context. This task equips you with practical knowledge that is crucial in managing complex systems like a fleet of autonomous cars. Happy coding! 🚀