public class Enemy {
    private String type;
    private int health;
    private int positionX, positionY;

    public Enemy(String type, int health, int positionX, int positionY) {
        // Constructor
    }

    public static Enemy fromFile(String filePath) {
        // Read enemy data from file
        return null;
    }

    public boolean interact(Player player) {
        // Interact with player
        return true;
    }

    // Other methods...
}