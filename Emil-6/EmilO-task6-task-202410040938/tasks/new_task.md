# 🛡️ Cybersecurity Programming Task

Welcome to the Cybersecurity Programming Task, where you'll explore key concepts related to cybersecurity through Java programming. This task will help you understand the importance of secure coding practices and the intricacies of data protection.

## 🎯 Learning Goals

1. Understanding the Java `Random` object
2. Understanding the ternary operator
3. Knowing the difference between a deep and shallow copy
4. Finding and fixing bugs
5. Using an Iterator to modify a collection during iteration
6. **Optional**: Using inheritance to avoid code duplication

## 📚 Task Overview

### Exercise 1: Understanding Randomness in Java (Theoretical)
**Goal**: Understanding the Java `Random` object.

**Instructions**: In the realm of cybersecurity, understanding randomness is crucial for generating secure keys and tokens. Research and answer the following questions related to the Java `Random` class:

1. What package does the `Random` class belong to, and why is it used in programming?
2. Discuss the difference between `java.util.Random` and `java.security.SecureRandom`. Why might one be preferred over the other in cybersecurity applications?

### Exercise 2: Ternary Operator in Decision Making (Theoretical)
**Goal**: Understanding the ternary operator.

**Instructions**: The ternary operator can be a concise way to write conditional logic, which is beneficial for quick decision-making processes in secure environments. Explain the ternary operator’s syntax and rewrite this conditional statement using it:

```java
if (userRole.equals("admin")) {
    accessLevel = "full";
} else {
    accessLevel = "restricted";
}
```

### Exercise 3: Secure Data Copying (Coding)
**Goal**: Knowing the difference between a deep and shallow copy.

**Instructions**: Write a method that demonstrates a shallow copy and a deep copy of an array of `Credentials` (a class you'll define). Your `Credentials` class should have two fields: a `String username` and a `String password`. Show how changes to objects in the shallow copy affect the original array, while changes in the deep copy do not.

### Exercise 4: Bug Hunting in Security Code (Coding)
**Goal**: Finding and fixing bugs.

**Instructions**: Consider this snippet of code meant for encrypting a message. Find and fix at least three bugs:

```java
public String encryptMessage(String message, int key) {
    StringBuilder encrypted = new StringBuilder();
    for (int i = 1; i < message.length(); i++) { // Bug 1: Incorrect loop start
        char c = (char)(message.charAt(i) + key);
        encrypted.append(c);
    }
    return encrypted.toString();
}
```

### Exercise 5: Using Iterators for Safe Collection Modification (Coding Challenge)
**Goal**: Using an Iterator to modify a collection during iteration.

**Instructions**: Given a list of `UserSession` objects, write a method that iteratively removes all sessions that have expired. Implement the method using an `Iterator` to avoid `ConcurrentModificationException`.

### Exercise 6: Inheritance in Secure Programming (Optional Challenge)
**Goal**: Using inheritance to avoid code duplication.

**Instructions**: Create a base class `SecureData` that contains common fields and methods used in classes like `Credentials` from Exercise 3 and another class `ApiToken`. Both `Credentials` and `ApiToken` should inherit from `SecureData` and include additional specific attributes or methods.

---

### 📝 Checklist
- [ ] Exercises 1 & 2: Answer theoretical questions on `Random` and the ternary operator.
- [ ] Exercise 3: Implement shallow and deep copy in a security context.
- [ ] Exercise 4: Identify and correct bugs in a code snippet.
- [ ] Exercise 5: Safely modify a collection using an iterator.
- [ ] Exercise 6: Utilize inheritance to enhance code reusability.

### 🌟 Tips for Success
- Pay attention to detail in your code, as security often hinges on small details.
- Consider edge cases that might affect security, such as integer overflows or invalid data types.
- Ensure your changes contribute to a more secure and maintainable codebase.

### 🙏 Acknowledgment
This task was designed by our dedicated team of programming instructors, aiming to challenge your understanding of cybersecurity in programming with Java. Happy coding, and stay secure!