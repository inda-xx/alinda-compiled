import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class GameLoop {
    private final Random random = new Random();
    private Player player;
    private List<Enemy> enemies;

    public GameLoop() {
        player = new Player(100, 0);
        enemies = new ArrayList<>();
        // Initialize enemies
        for (int i = 0; i < 5; i++) {
            enemies.add(new Enemy(20));
        }
    }

    public void run() {
        while (player.isAlive() && !enemies.isEmpty()) {
            player.move(random.nextInt(6) + 1);

            Iterator<Enemy> iterator = enemies.iterator();
            while (iterator.hasNext()) {
                Enemy enemy = iterator.next();
                if (enemy.isDead()) {
                    iterator.remove();
                } else {
                    enemy.takeDamage(random.nextInt(10));
                }
            }

            player.updateScore(5);

            System.out.println("Player at position: " + player.getPosition() + " with health: " + player.getHealth());
            System.out.println("Enemies remaining: " + enemies.size());
        }

        if (!player.isAlive()) {
            System.out.println("Game Over!");
        } else {
            System.out.println("Victory!");
        }
    }

    public static void main(String[] args) {
        new GameLoop().run();
    }
}