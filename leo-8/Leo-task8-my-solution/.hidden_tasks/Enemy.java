public class Enemy {
    private String type;
    private int health;
    private int positionX, positionY;

    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public static Enemy fromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] data = reader.readLine().split(",");
            String type = data[0];
            int health = Integer.parseInt(data[1]);
            int positionX = Integer.parseInt(data[2]);
            int positionY = Integer.parseInt(data[3]);
            return new Enemy(type, health, positionX, positionY);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading enemy data: " + e.getMessage());
            return null;
        }
    }

    public boolean interact(Player player) {
        // Implement interaction logic here. For example, reduce health or change score.
        player.updateScore(-10); // Example interaction
        return true;
    }

    // Getters and other methods...
}