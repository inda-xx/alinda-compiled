public class MessageEncryptor {

    public static String encryptMessage(String message, int key) {
        StringBuilder encrypted = new StringBuilder();

        if(message.length() == 0 || message == null){
            return "No input";
        } else {
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
            
            // Handle uppercase letters
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + key) % 26);
            }
            // Handle lowercase letters
            else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + key) % 26);
            }
            
            // Other characters remain unchanged
            encrypted.append(c);
            }
    
            return encrypted.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println("Message: Hello World 2024!");
        System.out.println("Encrypted message: " + encryptMessage("Hello World 2024!", 3));
    }
}