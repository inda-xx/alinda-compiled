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
        return new StringBuilder(data).reverse().toString();
    }

    public String decrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }
}