# Answers
---
## Exercise 1
1. The `Random` class belongs to the `java.util` package. It is used to generate pseudo-random values of type `int`, `float`, or `boolean`.
2. `java.util.Random` is faster but not as secure as `java.security.SecureRandom`. `Random` can be predicted, whereas `SecureRandom` cannot. This makes `Random` more suitable for general applications where security is not a concern. `SecureRandom` is better suited for scenarios where security is important. It is more resistant to attacks such as brute-forcing or reverse-engineering because it uses more advanced cryptographic algorithms.

## Exercise 2
The Ternary Operator is a shorter way to write an `if-else` statement.

```java
if (userRole.equals("admin")) {
    accessLevel = "full";
} else {
    accessLevel = "restricted";
}   
```

This code can be rewritten like this:

```java
accessLevel = userRole.equals("admin") ? "full" : "restricted";
```

If `userRole.equals("admin")` is `true`, `accessLevel` will be set to `"full"`.  
If `userRole.equals("admin")` is `false`, `accessLevel` will be set to `"restricted"`.

## Exercise 4
```java
public String encryptMessage(String message, int key) {
    StringBuilder encrypted = new StringBuilder();
    for (int i = 1; i < message.length(); i++) {
        char c = (char)(message.charAt(i) + key);
        encrypted.append(c);
    }
    return encrypted.toString();
}
```

### **Problems:**
1. The loop should start at index `0`.
2. The method should be `static`.
3. Overflow could be a problem.
4. Handle an empty string case.

See corrected code in `MessageEncryptor.java`.