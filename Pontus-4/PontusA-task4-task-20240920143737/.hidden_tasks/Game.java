import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    private Player player;
    private List<Enemy> enemies;
    private boolean gameOver;

    public Game() {
        this.player = new Player(0, 0);
        this.enemies = new ArrayList<>();
        this.gameOver = false;
        initEnemies();
    }

    private void initEnemies() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            enemies.add(new Enemy(rand.nextInt(101), rand.nextInt(101)));
        }
    }

    public boolean checkCollision(Enemy enemy) {
        return player.getX() == enemy.getX() && player.getY() == enemy.getY();
    }

    public void updateGame() {
        for (Enemy enemy : enemies) {
            if (checkCollision(enemy)) {
                gameOver = true;
                System.out.println("Game Over! Collision detected.");
                return;
            }
        }
        player.increaseScore(10);
    }

    public void collectPowerUp(String type) {
        if (type.equalsIgnoreCase("shield")) {
            System.out.println("Collected Shield Power-Up!");
            // Implement shield logic
        } else if (type.equalsIgnoreCase("speed")) {
            System.out.println("Collected Speed Power-Up!");
            // Implement speed logic
        }
    }

    public void collectPowerUp(int boost) {
        player.increaseScore(boost);
        System.out.println("Score boosted by " + boost);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            System.out.print("Enter move (dx dy): ");
            int dx = scanner.nextInt();
            int dy = scanner.nextInt();
            player.movePlayer(dx, dy);
            updateGame();
            System.out.println("Player position: (" + player.getX() + ", " + player.getY() + ")");
            System.out.println("Player score: " + player.getScore());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}