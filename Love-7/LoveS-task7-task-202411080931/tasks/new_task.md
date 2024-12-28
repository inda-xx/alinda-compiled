## 🌟 Programming Task: Create a Word Counter in Java

In this task, you'll develop a comprehensive word counter application in Java, which will help you explore key programming concepts including file I/O operations and leveraging the `HashMap` class. This project will also emphasize the importance of consulting Java documentation effectively to solve real-world problems. 

### Overview
You will create a Java application that reads a text file, counts the occurrences of each word, and provides insightful statistics about the text. This will involve:

- Navigating and utilizing official Java documentation.
- Reading and processing data from a text file.
- Storing word count information using `HashMap`.

By the end of this task, you should have a deeper understanding of handling data files, using Java collections for efficient data handling, and the importance of consulting documentation.

---

### 📝 Exercise 1: Understanding Java Documentation

**Objective:** Explore how Java documentation can help in understanding how to implement classes such as `HashMap`.

- **Conceptual Question:** Discuss the importance of Java documentation. Why is it beneficial to use official Java API references? Provide an example of when documentation helped you solve a programming challenge.
  
- **Research Task:** Use the Java documentation to answer the following:
  1. What method in `String` class can be used to convert a string to lowercase?
  2. Identify a method in Java's `BufferedReader` class that reads text from a file efficiently.

---

### 📚 Exercise 2: Reading Theory on File I/O

**Objective:** Understand the process of reading from text files in Java.

- **Theoretical Question:** Explain the significance of using `BufferedReader` over `FileReader` alone for reading text files. What advantages does buffering provide?

- **Practical Explanation:** Describe, step-by-step, how you would read all lines from a text file using `BufferedReader`. Include how you would ensure that all resources are properly closed after use to prevent resource leaks.

---

### 🧩 Exercise 3: Implementing File Reading

**Objective:** Implement a Java class to read words from a file and store them.

- **Task Description:**
  - Create a class named `FileWordReader` with a private field `ArrayList<String> words`.
  - Implement a constructor `public FileWordReader(String filename)` that reads words from the provided file and stores them in `words`.

- **Code Snippet:**
  ```java
  public class FileWordReader {
      private ArrayList<String> words;

      public FileWordReader(String filename) {
          // Implement file reading and word extraction logic here
      }
  }
  ```

---

### 🔄 Exercise 4: Using `HashMap` for Word Counting

**Objective:** Utilize a `HashMap` to count occurrences of each word.

- **Task Description:**
  - Create a class `WordCounter` with a `private HashMap<String, Integer> wordCounts`.
  - Initialize `wordCounts` to count word occurrences from `FileWordReader`.

- **Instructions:**
  - In the constructor, iterate through the words, convert them to lowercase, and populate `wordCounts` using `put` and `merge` methods for counting.

---

### 🚀 Exercise 5: Advanced Word Analysis

**Objective:** Extend your application to provide more insights.

- **Task Description:**
  - Add a method `public int totalWordCount()` to `WordCounter` that returns the total number of words.
  - Implement `public int uniqueWordCount()` which returns the number of unique words.
  - Develop `public double wordFrequency(String word)` which calculates the frequency of a given word.

- **Instructions:**
  - Ensure all methods handle case insensitivity appropriately and manage words absent from the text gracefully.

---

### 🌟 Exercise 6: Building a Complete Word Counter Application

**Objective:** Develop a complete application that integrates file reading, word counting, and analysis.

- **Task Description:**
  - Combine previous exercises into a working application named `TextAnalyzer`.
  - Implement a `main` method that:
    - Reads from `hamlet.txt` or another user-provided text file.
    - Outputs total word count, unique word count, and frequency of several chosen words.

- **Challenge:** Enhance your program's functionality based on additional criteria, such as excluding common stopwords from the analysis or providing the ten most frequent words.

---

### 🎯 Final Checklist

- [ ] Understand and navigate Java documentation for various classes.
- [ ] Implement file reading using `BufferedReader` and handle I/O resources properly.
- [ ] Use `HashMap` efficiently for word counting.
- [ ] Develop methods to analyze word frequency and uniqueness.
- [ ] Integrate and test the complete `TextAnalyzer` application.

Good luck with your task, and remember, thorough exploration of documentation and thoughtful implementation are key to success! Happy coding! 🚀