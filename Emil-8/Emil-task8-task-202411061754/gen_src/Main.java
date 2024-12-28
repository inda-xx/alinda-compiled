// ------------------- Main.java -------------------

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserLoader userLoader = new UserLoader();
        List<User> users = userLoader.loadUsersFromFile("users.csv");

        if (!users.isEmpty()) {
            User sender = users.get(0);
            User recipient = users.get(1);

            Message message = new Message(sender, recipient, "Hello, this is a test message!");
            System.out.println("Original Message: " + message);

            message.sendMessage();
            message.receiveMessage();

            message.decrypt();
            System.out.println("Decrypted Message: " + message);
        } else {
            System.out.println("No users loaded.");
        }
    }
}

// ------------------- UserLoader.java -------------------

import java.util.List;

public class UserLoader {
    public List<User> loadUsersFromFile(String filename) {
        // implementation
    }
}

// ------------------- User.java -------------------

public class User {
    // User class implementation
}

// ------------------- Message.java -------------------

public class Message {
    public Message(User sender, User recipient, String content) {
        // constructor implementation
    }

    public void sendMessage() {
        // send message implementation
    }

    public void receiveMessage() {
        // receive message implementation
    }

    public void decrypt() {
        // decrypt message implementation
    }
}