public class MessageEncryptor {

    public static String encryptMessage(String message, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < message.length(); i++) { // Fix Bug 1: Start loop from 0
            char c = (char)(message.charAt(i) + key);
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        String message = "Hello, World!";
        int key = 3;
        String encryptedMessage = encryptMessage(message, key);
        System.out.println("Encrypted Message: " + encryptedMessage);
    }
}