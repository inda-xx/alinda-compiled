public class SecureData {
    private String dataId;
    private long createdAt;

    public SecureData(String dataId) {
        this.dataId = dataId;
        this.createdAt = System.currentTimeMillis();
    }

    public String getDataId() {
        return dataId;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}