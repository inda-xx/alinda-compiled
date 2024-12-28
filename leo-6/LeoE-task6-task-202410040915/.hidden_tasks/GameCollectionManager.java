import java.util.ArrayList;

public class GameCollectionManager {

    /**
     * Task 4.1: Modify collection using Iterator
     */
    public void removeDeadEnemies(List<Enemy> enemies) {
        Iterator<Enemy> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            Enemy enemy = iterator.next();
            if (enemy.isDead()) {
                iterator.remove();
            }
        }
    }

    /**
     * Task 4.2: Discuss other Iterator scenarios
     */
    public void discussIteratorUsage() {
        System.out.println("Iterators prevent ConcurrentModificationException during collection modification.");
        System.out.println("Beneficial for modifying dynamic game state collections like enemies or items.");
    }

    public static void main(String[] args) {
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(0));
        enemies.add(new Enemy(50));

        GameCollectionManager manager = new GameCollectionManager();
        manager.removeDeadEnemies(enemies);
        System.out.println("Remaining enemies: " + enemies.size());
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class Player extends GameEntity {
    private int score;
    private boolean powerMove;

    public Player(int health, int position) {
        super(health, position);
        this.score = 0;
        this.powerMove = false;
    }

    public void updateScore(int delta) {
        score += delta;
        powerMove = score >= 100; // Example threshold
    }

    public boolean hasPowerMove() {
        return powerMove;
    }
}

class GameEntity {
    protected int health;
    protected int position;

    public GameEntity(int health, int position) {
        this.health = health;
        this.position = position;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void move(int spaces) {
        position += spaces;
    }

    public int getHealth() {
        return health;
    }

    public int getPosition() {
        return position;
    }
}