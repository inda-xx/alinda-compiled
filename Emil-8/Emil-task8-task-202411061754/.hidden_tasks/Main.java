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