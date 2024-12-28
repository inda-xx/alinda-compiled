public class Player {
    private int x;
    private int y;
    private int score;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.score = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScore() {
        return score;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public void movePlayer(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
        ensureWithinBounds();
    }

    private void ensureWithinBounds() {
        if (this.x < 0) this.x = 0;
        if (this.y < 0) this.y = 0;
        // Assuming a grid of 100x100 for this example
        if (this.x > 100) this.x = 100;
        if (this.y > 100) this.y = 100;
    }
}