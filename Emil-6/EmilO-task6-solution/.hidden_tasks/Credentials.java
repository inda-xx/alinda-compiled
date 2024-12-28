public class Credentials extends SecureData {
    private String username;
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
}