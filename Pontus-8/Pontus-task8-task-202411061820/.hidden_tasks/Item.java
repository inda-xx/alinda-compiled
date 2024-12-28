public class Item {
    private String name;
    private String description;
    private int pointValue;

    public Item(String name, String description, int pointValue) {
        this.name = name;
        this.description = description;
        this.pointValue = pointValue;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPointValue() {
        return pointValue;
    }
}