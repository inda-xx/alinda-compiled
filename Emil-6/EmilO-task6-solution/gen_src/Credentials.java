public class Credentials extends SecureData {
    private final String username;
    private String password;

    public Credentials(String dataId, String username, String password) {
        super(dataId);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Data ID: " + getDataId() + ", Username: " + username + ", Password: " + password;
    }
}