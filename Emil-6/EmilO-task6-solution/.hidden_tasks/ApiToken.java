public class ApiToken extends SecureData {
    private String tokenValue;

    public ApiToken(String dataId, String tokenValue) {
        super(dataId);
        this.tokenValue = tokenValue;
    }

    public String getTokenValue() {
        return tokenValue;
    }
}