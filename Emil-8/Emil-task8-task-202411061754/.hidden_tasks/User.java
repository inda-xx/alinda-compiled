public class User {
    private String username;
    private String publicKey;

    public User(String username, String publicKey) {
        this.username = username;
        this.publicKey = publicKey;
    }

    public String getUsername() {
        return username;
    }

    public String getPublicKey() {
        return publicKey;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", publicKey='" + publicKey + '\'' +
                '}';
    }
}