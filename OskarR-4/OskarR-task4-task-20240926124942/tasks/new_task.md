# Java Practice Tasks: Mastering Loops and Boolean Expressions 🌟

A key aspect of programming is leveraging the power of iteration to automate repetitive tasks effectively. This week's focus is on understanding and implementing Java's `boolean` expressions, `while` and `for` loops, utilizing JShell for Java experimentation, and exploring function overloading. These foundational concepts will help you solve more complex problems efficiently.

### 📝 Preparation

- Review the [Java Basics Overview](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html) to refresh your understanding of Java.
- Read [Java Boolean Expressions and Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html) and familiarize yourself with different operators.
- Explore JShell basics and experiments with simple Java expressions using [JShell Documentation](https://docs.oracle.com/javase/9/tools/jshell.htm).

### ✅ Learning Goals

By the end of this task, you should be able to:
- Understand and use `boolean` expressions and operators.
- Write and execute `while` and `for` loops.
- Experiment with Java code snippets using JShell.
- Demonstrate the concept of function overloading.

### 🚨 Troubleshooting Guide

If you hit any snags:
1. Check common issues and solutions on online programming forums and resources.
2. Post your own questions on class discussion boards.
3. Consult with peers or instructors during lab sessions for personalized support.

### 🏛 Assignment: Weather-Based Decision Making System 🌦️

The objective of this task is to build a weather-based decision-making tool. It will involve manipulating boolean expressions, constructing loops to process data, and practicing function overloading.

#### Step-by-Step Exercises

<details>
<summary> 📚 Boolean Expressions and Operators </summary>

Boolean expressions are at the core of making decisions in programming. They help evaluate conditions such as weather parameters to decide subsequent actions.

Try the following exercises in JShell:
- Evaluate simple boolean expressions like `35 > 12`.
- Develop compound expressions using logical operators: `humidity > 80 && temperature < 20`.
- Try negation for filtering data: `!(windSpeed < 10)`.

Use JShell to verify the results and gain confidence in understanding boolean logic in Java.

</details>

#### Exercise 1: Implementing `FetchingWeatherData.java`

1. **Fetching Weather Data:**

   Create a Java class `FetchingWeatherData` with a method `fetchData()` that simulates fetching weather data points for temperature, humidity, and wind speed using a `while` loop. This method should generate random data until a valid dataset (e.g., temperature between -10 and 50 Celsius) is found.

   ```java
   public void fetchData() {
       double temperature;
       int humidity;
       int windSpeed;
       boolean validData = false;

       while (!validData) {
           temperature = Math.random() * 60 - 10; // Random temperature between -10 and 50
           humidity = (int) (Math.random() * 101); // Random humidity between 0 and 100
           windSpeed = (int) (Math.random() * 50); // Random wind speed between 0 and 50

           validData = (temperature >= -10 && temperature <= 50);
       }

       // Output the generated weather data
       System.out.printf("Temperature: %.2f, Humidity: %d%%, Wind Speed: %d km/h%n", temperature, humidity, windSpeed);
   }
   ```

#### Exercise 2: Building a Weather Summary System

2. **Summarizing Weather Data:**

   Extend the `FetchingWeatherData` class with a method `summarizeData` that iterates over several data points (using a `for` loop) and outputs average weather statistics.

   ```java
   public void summarizeData(int numberOfDays) {
       double totalTemperature = 0;
       int totalHumidity = 0;
       int totalWindSpeed = 0;

       for (int i = 0; i < numberOfDays; i++) {
           // Simulate fetching new data set using fetchData()
           fetchData();

           // Simulating data aggregation
           totalTemperature += Math.random() * 60 - 10;
           totalHumidity += (int) (Math.random() * 101);
           totalWindSpeed += (int) (Math.random() * 50);
       }

       System.out.printf("Average Temperature: %.2f, Average Humidity: %d%%, Average Wind Speed: %d km/h%n",
               totalTemperature / numberOfDays, totalHumidity / numberOfDays, totalWindSpeed / numberOfDays);
   }
   ```

#### Exercise 3: Function Overloading 🎛️

3. **Weather Report Overloading:**

   Add a method `generateWeatherReport` to demonstrate function overloading by providing different versions based on parameters.

   ```java
   // Overloaded method with different parameters for weather report
   public String generateWeatherReport(int day) {
       return String.format("Report for day %d: Sunny", day);
   }

   public String generateWeatherReport(int day, boolean detailed) {
       if (detailed) {
           return String.format("Detailed report for day %d: Light showers with temperature of 22°C, humidity 75%%, wind 18 km/h", day);
       } else {
           return generateWeatherReport(day);
       }
   }
   ```

   Use JShell to quickly try out these overloaded methods and understand how different parameter types and counts influence method selection.

This task will provide you with practical experience in handling boolean logic, loops, and method overloading in Java. Happy coding! 🖥️💻