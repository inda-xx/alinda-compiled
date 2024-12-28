public class Message {
    private User sender;
    private User recipient;
    private String content;
    private boolean isEncrypted;

    public Message(User sender, User recipient, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        this.isEncrypted = false;
    }

    public void encrypt() {
        if (!isEncrypted) {
            EncryptionHandler encryptionHandler = EncryptionHandler.getInstance();
            this.content = encryptionHandler.encrypt(content);
            this.isEncrypted = true;
        }
    }

    public void decrypt() {
        if (isEncrypted) {
            EncryptionHandler encryptionHandler = EncryptionHandler.getInstance();
            this.content = encryptionHandler.decrypt(content);
            this.isEncrypted = false;
        }
    }

    public void sendMessage() {
        if (!isEncrypted) {
            encrypt();
        }
        // Logic to write the message to a file or simulate sending
        System.out.println("Sending message: " + content);
    }

    public void receiveMessage() {
        // Logic to receive a message, which is simulated here
        System.out.println("Received message: " + content);
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", recipient=" + recipient +
                ", content='" + content + '\'' +
                ", isEncrypted=" + isEncrypted +
                '}';
    }
}