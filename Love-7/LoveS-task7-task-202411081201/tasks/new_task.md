### Task: Text Analysis with Java 🎓

In this assignment, you will develop Java functionality to analyze textual data by integrating multiple programming concepts. This task will challenge you to apply these concepts in real-world applications and enhance your understanding by using Java documentation, reading from text files, and utilizing the `HashMap` class for data management.

#### Learning Goals

- **Using Documentation:** Learn to navigate Java documentation for efficient understanding and implementation of classes and libraries.
  
- **Reading from a Text File:** Gain proficiency in file I/O operations, focusing on reading data from text files using Java.

- **Using the `HashMap` Class:** Explore `HashMap` for storing and managing key-value pairs effectively.

---

### Exercises

#### Exercise 1: 📚 Understanding Java Documentation

**Description:** Understand and explore how to find and use official Java documentation.

- **Task:** Explain how you would locate and use Java documentation for `BufferedReader` and `HashMap`. Write a short coherent description detailing:
  - How to navigate to the official Java API documentation.
  - How to understand example snippets provided.
  - Best practices to integrate code examples into your projects.

#### Exercise 2: 📄 Concepts of File Reading in Java

**Description:** Conceptual understanding of reading files using Java.

- **Task:** Describe the process of reading a text file in Java, including:
  - Setting up file paths and understanding the necessary classes (`FileReader` and `BufferedReader`).
  - Handling exceptions using try-with-resources.
  - Provide detailed pseudocode of reading a text file line by line.

#### Exercise 3: 📝 Implementing a File Reader Class

**Description:** Implement a class to read text from a file and store words.

- **Task:** Create a Java class `FileWordSplitter` in your project. 

  ```java
  public class FileWordSplitter {
      private ArrayList<String> words;
      
      public FileWordSplitter(String filename) {
          // Initialize words ArrayList
          // Read file and split text into words
      }
      
      public ArrayList<String> getWords() {
          return words;
      }
  }
  ```

- **Objective:** Fill in the constructor to read from a given filename and use Java library functions (e.g., `String.split`) to add words to the `words` list. Ensure to manage resources effectively.

#### Exercise 4: 📊 Analyzing Text with `HashMap`

**Description:** Integrate `FileWordSplitter` with `HashMap` for analyzing word occurrences.

- **Task:** Create a class `FileTextAnalyzer`:

  ```java
  public class FileTextAnalyzer {
      private HashMap<String, Integer> wordOccurrences;
      
      public FileTextAnalyzer(String filename) {
          // Initialize wordOccurrences HashMap
          // Add words with their occurrence count
      }
      
      public int occurrencesOf(String word) {
          // Return count of the given word
      }
  }
  ```

- **Objective:** Create a `FileTextAnalyzer` object that populates `wordOccurrences` with the number of times each word appears. Make it case-insensitive.

#### Exercise 5: 📐 Unique Word Analysis and Frequencies

**Description:** Extend your `FileTextAnalyzer` for more detailed analyses.

- **Task:**

  - **Method 1:** Implement `public int uniqueWordCount()` to return the total number of unique words.
  - **Method 2:** Implement `public double frequencyOf(String word)` to return the frequency of a specific word in the text. Use conversion to ensure fractional results.

- **Objective:** Use `HashMap` capabilities to extract more insights about the text, ensuring methods are robust and efficient.

#### Exercise 6: 🔍 Advanced Textual Analysis

**Description:** Conduct detailed linguistic analysis utilizing all implemented functionalities.

- **Task:** Create a comprehensive report (in markdown or a text document) using your Java applications to analyze a given text file (e.g., a sample provided by your instructor).
  - **Include:** Total words, unique words count, frequency of selected keywords.
  - Provide insights about the text based on your analysis.

--- 

### Final Checklist 🚀

Ensure your solution meets the following criteria before submission:

- [ ] Correctly navigated and described usage of Java documentation.
- [ ] Detailed understanding and explanation of reading files in Java.
- [ ] Implemented `FileWordSplitter` for efficient file data extraction.
- [ ] Developed `FileTextAnalyzer` accurately counting word occurrences.
- [ ] Case insensitivity implemented in word counting and searching.
- [ ] Produced reports accurately depicting textual data insights.

---

### Tips for Success 🌟

- Utilize Java documentation and Stack Overflow effectively for understanding class methods and best practices.
- Manage your resources well with try-with-resources when implementing file reading.
- Ensure your `HashMap` use is efficient and understand the implications of key management.
- Approach each exercise incrementally, building upon the previous work for comprehensive learning and implementation.

This assignment is aimed at refining your programming skills, considering both theory and implementation, to equip you with valuable real-world coding and problem-solving abilities. Good luck! 🍀