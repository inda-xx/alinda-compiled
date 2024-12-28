// GameCollectionManager.java
import java.util.List;

public class GameCollectionManager {

    public void removeDeadEnemies(List<Enemy> enemies) {
        // Method signature remains
    }

    public void discussIteratorUsage() {
        // Method signature remains
    }

    public static void main(String[] args) {
        // Method signature remains
    }
}

// Player.java
class Player extends GameEntity {
    
    public Player(int health, int position) {
        // Constructor signature remains
    }

    public void updateScore(int delta) {
        // Method signature remains
    }

    public boolean hasPowerMove() {
        // Method signature remains
    }
}

// GameEntity.java
class GameEntity {
    
    public GameEntity(int health, int position) {
        // Constructor signature remains
    }

    public void reduceHealth(int damage) {
        // Method signature remains
    }

    public boolean isAlive() {
        // Method signature remains
    }

    public void move(int spaces) {
        // Method signature remains
    }

    public int getHealth() {
        // Method signature remains
    }

    public int getPosition() {
        // Method signature remains
    }
}