public class Player {
    private String name;
    private int score;
    private int positionX, positionY;

    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public static Player fromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String[] data = reader.readLine().split(",");
            String name = data[0];
            int score = Integer.parseInt(data[1]);
            int positionX = Integer.parseInt(data[2]);
            int positionY = Integer.parseInt(data[3]);
            return new Player(name, score, positionX, positionY);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading player data: " + e.getMessage());
            return null;
        }
    }

    public void move(int deltaX, int deltaY) {
        positionX += deltaX;
        positionY += deltaY;
    }

    public void updateScore(int deltaScore) {
        score += deltaScore;
    }

    // Getters and other methods...
}