import java.util.List;
import java.util.ArrayList;

public class Game {
    private boolean running;
    private Player player;
    private List<Enemy> enemies;
    private int score;

    public Game() {
        this.running = false;
        this.player = new Player();
        this.enemies = new ArrayList<>();
        this.score = 0;
        initializeEnemies();
    }

    private void initializeEnemies() {
        enemies.add(new Enemy(5, 100));
        enemies.add(new Enemy(10, 150));
        // Add more enemies as needed
    }

    public void start() {
        running = true;
        System.out.println("Game started!");
        // Game loop
        while (running) {
            updateGame();
            if (checkWinCondition()) {
                System.out.println("You won! Final score: " + score);
                running = false;
            }
        }
    }

    private void updateGame() {
        // Move player and interact with enemies in a simple manner
        // Here we just move the player right a fixed number of steps for demonstration
        player.moveRight(2);

        // Check collisions and interactions with enemies
        for (Enemy enemy : enemies) {
            if (player.getPosition() == enemy.getPosition()) {
                if (enemy.attack(10)) {
                    // Player defeats the enemy
                    score += 100;
                    System.out.println("Enemy defeated at position " + enemy.getPosition() + "! Current score: " + score);
                }
            }
        }
    }

    private boolean checkWinCondition() {
        return enemies.stream().allMatch(e -> e.getHealth() <= 0);
    }
}