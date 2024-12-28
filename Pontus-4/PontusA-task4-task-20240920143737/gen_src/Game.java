import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private Player player;
    private List<Enemy> enemies;
    private boolean gameOver;

    public Game() {
        // TODO: Implement this constructor.
    }

    private void initEnemies() {
        // TODO: Implement this method.
    }

    public boolean checkCollision(Enemy enemy) {
        // TODO: Implement this method.
        return false; // Placeholder return value.
    }

    public void updateGame() {
        // TODO: Implement this method.
    }

    public void collectPowerUp(String type) {
        // TODO: Implement this method.
    }

    public void collectPowerUp(int boost) {
        // TODO: Implement this method.
    }

    public void play() {
        // TODO: Implement this method.
    }

    public static void main(String[] args) {
        // TODO: Implement this method.
    }
}

class Player {
    private int x;
    private int y;
    private int score;

    public Player(int x, int y) {
        // TODO: Implement this constructor.
    }

    public int getX() {
        // TODO: Implement this method.
        return 0; // Placeholder return value.
    }

    public int getY() {
        // TODO: Implement this method.
        return 0; // Placeholder return value.
    }

    public int getScore() {
        // TODO: Implement this method.
        return 0; // Placeholder return value.
    }

    public void increaseScore(int amount) {
        // TODO: Implement this method.
    }

    public void movePlayer(int dx, int dy) {
        // TODO: Implement this method.
    }
}

class Enemy {
    private int x;
    private int y;

    public Enemy(int x, int y) {
        // TODO: Implement this constructor.
    }

    public int getX() {
        // TODO: Implement this method.
        return 0; // Placeholder return value.
    }

    public int getY() {
        // TODO: Implement this method.
        return 0; // Placeholder return value.
    }
}