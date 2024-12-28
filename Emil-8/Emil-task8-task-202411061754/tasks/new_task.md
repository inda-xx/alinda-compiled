![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-lg1KLSQPbl7RwCgE822PyE2G.png?st=2024-11-06T15%3A54%3A43Z&se=2024-11-06T17%3A54%3A43Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T20%3A27%3A30Z&ske=2024-11-06T20%3A27%3A30Z&sks=b&skv=2024-08-04&sig=UM8Ao6N4HnO4h7Jf268AFoTyKmp1ZT1xncmPf2QPFWY%3D)

# 🚀 Cyber Security Programming Task: Secure Messaging System

In this task, you will design and implement a simplified secure messaging system, simulating how encrypted messages are transmitted and stored securely. This task will provide you an opportunity to integrate several essential concepts in programming with a focus on cyber security.

## 🎯 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understanding file formats and parsing techniques for data extraction.
   - Using file I/O classes to read data and convert it into object attributes.
   - Handling exceptions and ensuring data integrity during object instantiation.

2. **Designing Classes**
   - Identifying class responsibilities and defining clear interfaces.
   - Implementing cohesive class structures with appropriate fields and methods.
   - Leveraging design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Exploring different approaches to problem-solving and algorithm design.
   - Encouraging experimentation and iteration to refine solutions.
   - Integrating user feedback and testing to improve program effectiveness and usability.

## 📝 Task Outline

### Exercise 1: Understanding File-Based Data Instantiation 📄

**Objective:** Comprehend the theoretical aspects of utilizing data from files to instantiate objects.

- **Question 1:** Describe two file formats that are commonly used for storing structured data (such as JSON and CSV), highlighting their advantages and possible use scenarios in a secure messaging system.
  
- **Question 2:** Explain the challenges and considerations in reading data from files for object instantiation, focusing on data integrity and exception handling.

### Exercise 2: Class Design Fundamentals 🏗️

**Objective:** Explore the principles of designing robust classes for secure communication systems.

- **Question 1:** Discuss the key responsibilities and collaboration methods for three classes you would design in a secure messaging system: `User`, `Message`, and `EncryptionHandler`.

- **Question 2:** Explain how the Singleton design pattern could be beneficial in designing an EncryptionHandler class in your system.

### Exercise 3: File Parsing and Object Instantiation 📌

**Objective:** Implement basic file-reading functionality to instantiate objects from data.

1. Create a `User` class with attributes like username and public key.
2. Read a file containing user data in CSV format (e.g., `users.csv`) and instantiate User objects.
  
   ```java
   // Example of a line in users.csv:
   // john_doe,john_key
   ```

3. Implement error handling to manage potential issues in file reading and data conversion.

```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("users.csv"));
    String line;
    while ((line = reader.readLine()) != null) {
        String[] data = line.split(",");
        // Instantiate User object here
    }
} catch (IOException e) {
    // Handle exceptions
}
```

### Exercise 4: Designing and Implementing Classes 🔍

**Objective:** Design and implement classes for the secure messaging system, focusing on cohesion and interface clarity.

1. Implement the `Message` class with attributes like sender, recipient, content, and encryption status.
2. Create the `EncryptionHandler` class to handle encryption and decryption tasks.
3. Design interfaces for these classes, ensuring that responsibilities are clearly defined and methods are appropriately encapsulated.

```java
public class Message {
    private User sender;
    private User recipient;
    private String content;
    private boolean isEncrypted;

    // Constructors, getters, setters
}

public class EncryptionHandler {
    private static EncryptionHandler instance;

    private EncryptionHandler() {}

    public static EncryptionHandler getInstance() {
        if (instance == null) {
            instance = new EncryptionHandler();
        }
        return instance;
    }

    public String encrypt(String data) {
        // Encryption logic
    }

    public String decrypt(String data) {
        // Decryption logic
    }
}
```

### Exercise 5: Implementing a Core Messaging Functionality 📨

**Objective:** Implement the process of encrypting a message and transmitting it.

1. Modify the `Message` class to include methods for encrypting content using the `EncryptionHandler`.
2. Simulate sending an encrypted message by writing it to a file called `messages.txt`.

```java
// In Message class
public void sendMessage() {
    EncryptionHandler encryptionHandler = EncryptionHandler.getInstance();
    this.isEncrypted = true;
    String encryptedContent = encryptionHandler.encrypt(this.content);
    // Logic to write to messages.txt
}
```

### Exercise 6: Expanding the Secure Messaging System 🌐

**Objective:** Challenge yourself by enhancing the messaging system with advanced features.

1. Implement a `receiveMessage()` functionality that reads the encrypted message from `messages.txt`, decrypts it using `EncryptionHandler`, and displays it to the recipient.
2. Introduce a security feature, such as verification of sender identity, to the messaging process.

```java
// Example in Message class
public void receiveMessage() {
    EncryptionHandler encryptionHandler = EncryptionHandler.getInstance();
    // Logic to read from messages.txt and decrypt
    String decryptedContent = encryptionHandler.decrypt(this.content);
    // Display the message
}
```

## ⚠️ Note
- Document your code with Javadoc.
- Maintain a README that includes usage instructions and descriptions of the overall system design.
- Test your implementation thoroughly to ensure reliability and security.

By completing this task, you'll gain hands-on experience with file manipulation, class design, and creative problem-solving in a cyber security context, enhancing both your technical and analytical skills. Happy coding! 🎉