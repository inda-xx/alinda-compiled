### 📚 Java Programming Task: Build a Word Counter

Welcome to this programming task! In this exercise, you'll develop a Java program that reads text from a file and counts the occurrence of each word using a `HashMap`. This task will help you understand how to navigate Java documentation, perform file I/O operations, and leverage the powerful `HashMap` class for data processing. Let's dive into the exercises!

---

### 📝 Exercise 1: Navigating Java Documentation

**Learning Objective:** Utilize official Java documentation to understand and implement Java classes.

**Description:** Begin by exploring the Java documentation. Understand the basic structure and components of Java's API Reference:

- **Explore:** Visit the [official Java documentation](https://docs.oracle.com/javase/10/docs/api/overview-summary.html).
- **Task:** Find the documentation for `HashMap`, `BufferedReader`, and `FileReader`.
- **Questions:**
  1. What are the key methods available in the `HashMap` class?
  2. How does a `BufferedReader` read data from a file?

---

### 📂 Exercise 2: Understanding File I/O in Java

**Learning Objective:** Gain knowledge of file I/O operations in Java.

**Description:** Learn how to set up file paths and use classes for reading text files:

- **Query:** Explain the significance of file streams in Java. How are `FileReader` and `BufferedReader` used for efficient file I/O?
- **Questions:**
  1. Describe the process of handling file not found exceptions in Java.
  2. What is the benefit of using `try-with-resources` in Java?

---

### 🔧 Exercise 3: Implementing File Reading

**Learning Objective:** Practice reading from a text file and storing data.

**Task:** Write a Java class `FileWordReader` to read words from a text file:

- **Requirements:**
  1. Implement a constructor `public FileWordReader(String fileName)` that initializes the file path.
  2. Use a `BufferedReader` to read the file in the constructor, line by line.
  3. Split lines into words using `String.split("\\s+")` and store them in an `ArrayList<String>` called `words`.

```java
public class FileWordReader {
    private ArrayList<String> words = new ArrayList<>();

    public FileWordReader(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordsArray = line.split("\\s+");
                words.addAll(Arrays.asList(wordsArray));
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }
}
```

---

### 🔍 Exercise 4: Building the Word Counter

**Learning Objective:** Use `HashMap` to count occurrences of words.

**Task:** Create a `WordCounter` class:

- **Requirements:**
  1. Include a private `HashMap<String, Integer>` to track word counts.
  2. Implement a method `public void countWords(ArrayList<String> words)` that populates the `HashMap` with word frequencies.
  3. Use `lowercase` for keys to ensure case insensitivity.

```java
public class WordCounter {
    private HashMap<String, Integer> wordCounts = new HashMap<>();

    public void countWords(ArrayList<String> words) {
        for (String word : words) {
            word = word.toLowerCase();
            wordCounts.merge(word, 1, Integer::sum);
        }
    }

    public HashMap<String, Integer> getWordCounts() {
        return wordCounts;
    }
}
```

---

### 🚀 Exercise 5: Advanced Word Counter Operations

**Learning Objective:** Implement complex operations using `HashMap`.

**Task:** Extend the `WordCounter` with additional functionalities:

- **Method:** `public int getOccurrencesOf(String word)`
  - Return the number of occurrences of a specific word.
- **Method:** `public double getFrequencyOf(String word, int totalWords)`
  - Calculate the frequency of a word as a proportion of the total words.

```java
public int getOccurrencesOf(String word) {
    return wordCounts.getOrDefault(word.toLowerCase(), 0);
}

public double getFrequencyOf(String word, int totalWords) {
    int count = getOccurrencesOf(word);
    return (double) count / totalWords;
}
```

---

### 🏆 Exercise 6: Comprehensive Text Analysis

**Learning Objective:** Perform complete analysis of text data.

**Task:** Bring everything together to analyze a text file:

- **Program:** Create a `TextAnalyzer` class to utilize `FileWordReader` and `WordCounter`.
- **Objective:**
  1. Calculate the total number of words.
  2. Determine and display the top 10 most frequent words.
  3. Identify the number of unique words.

```java
public class TextAnalyzer {
    private FileWordReader reader;
    private WordCounter counter;

    public TextAnalyzer(String fileName) {
        this.reader = new FileWordReader(fileName);
        this.counter = new WordCounter();
        counter.countWords(reader.getWords());
    }

    public int totalWords() {
        return reader.getWords().size();
    }

    public List<Map.Entry<String, Integer>> topFrequentWords(int n) {
        return counter.getWordCounts().entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(n)
            .collect(Collectors.toList());
    }

    public int uniqueWordCount() {
        return counter.getWordCounts().size();
    }
}
```

---

### 🎯 Task Completion Checklist

- [ ] Understand official Java documentation and `HashMap` functionalities.
- [ ] Implement file reading using Java I/O classes.
- [ ] Develop a `WordCounter` to manage word occurrences with a `HashMap`.
- [ ] Enhance the program with word frequency calculations.
- [ ] Create a text analysis program that reports frequent and unique words.

Take your time exploring these exercises. Make sure to test your code and confirm that it meets the specified requirements. Good luck, and enjoy the process of learning through coding!