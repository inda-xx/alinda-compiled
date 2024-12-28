# 📚 Hashmaps: A Practical Introductory Task

Welcome to your first deep dive into Java's `HashMap` class! This task is designed to enhance your understanding of hashmaps, file I/O operations, and the importance of leveraging documentation effectively. By completing this task, you'll garner foundational skills crucial for handling data efficiently in Java applications. Let's get started!

## 📝 Task Overview

**Theme:** Basic Introduction to Hashmaps

You'll complete a series of exercises that gradually increase in complexity, focusing on:

- Using Documentation
- Reading from a Text File
- Implementing the `HashMap` Class

---

## 📖 Exercises

### Exercise 1: Understanding Java Documentation

**Objective:** Navigate and comprehend Java Documentation, particularly focusing on the `HashMap`, `FileReader`, and `BufferedReader` classes.

- **Task:**
  - Visit the official [Java Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/overview-summary.html).
  - Locate the `HashMap` class documentation. Explain the purpose of the `HashMap` class and list three key methods, including their use cases.
  - Do the same for `FileReader` and `BufferedReader` classes concerning file I/O operations.
  
- **Outcome:** Ability to effectively locate and interpret documentation information for Java classes.

### Exercise 2: Conceptual Questions on File I/O

**Objective:** Develop theoretical insights into Java file reading mechanisms.

- **Task:**
  - Explain the role of `FileReader` and `BufferedReader` in reading from a text file in Java.
  - Discuss the importance of exception handling using `try-with-resources` in file I/O operations.
  - Write down pseudocode for reading lines from a text file and processing each line.

- **Outcome:** Strong theoretical understanding of file reading operations and error handling in Java.

### Exercise 3: Implementing File Reading with HashMap

**Objective:** Combine file reading operations with `HashMap` implementations.

- **Task:**
  - Read a file named `input.txt` (a simple text file you create) that includes several lines of text.
  - Write a Java class `FileReaderWithMap` which reads the contents and stores each unique word using a `HashMap`. The key will be the word, and the value will be its count.
  
  ```java
  try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
      HashMap<String, Integer> wordMap = new HashMap<>();
      String line;
      while ((line = br.readLine()) != null) {
          String[] words = line.split("\\s+");
          for (String word : words) {
              word = word.toLowerCase();
              wordMap.merge(word, 1, Integer::sum);
          }
      }
  } catch (IOException e) {
      e.printStackTrace();
  }
  ```

- **Outcome:** Proficiency in reading files and updating hashmap entries efficiently.

### Exercise 4: Counting Word Frequencies

**Objective:** Develop methods to count and retrieve word frequencies from a `HashMap`.

- **Task:**
  - Extend `FileReaderWithMap` with methods:
    - `public int getWordCount(String word)`: Returns how often a word appears.
    - `public double getFrequency(String word)`: Returns the frequency of a word across the total word count.
  
- **Outcome:** Capability to manipulate and retrieve data effectively using hashmap.

### Exercise 5: Hash Function and Collision Handling

**Objective:** Explore how hash functions and collision handling work in hashmaps.

- **Task:**
  - Research and write a brief report on hash functions in Java `HashMap` and how Java handles hash collisions. Reflect on the implications for performance.
  
- **Outcome:** Increased understanding of internal workings of data structures beyond surface-level usage.

### Exercise 6: Building a Simple Search Engine

**Objective:** Utilize hashmaps and file I/O operations to create a basic search feature.

- **Task:** 
  - Implement a Java class `SimpleSearchEngine` capable of:
    - Reading multiple files and storing each word and its file location in a `HashMap`.
    - Implementing a method `public List<String> search(String keyword)` that returns a list of files containing the keyword.
  
- **Outcome:** Demonstrated ability to integrate various concepts into a functional, real-world application.

---

## 🏆 Conclusion

Through these exercises, you have explored not only the technical implementation of hashmaps and file I/O but also delved into understanding the underlying mechanisms that make Java a powerful tool for developers. Remember, strong proficiency in using documentation and theoretical comprehension of Java classes are keys to brilliant programming!

Happy coding! 😊