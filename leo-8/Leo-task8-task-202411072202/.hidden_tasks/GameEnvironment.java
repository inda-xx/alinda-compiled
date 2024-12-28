import java.util.List;

public class GameEnvironment {
    private List<Player> players;
    private List<Enemy> enemies;
    private int score;

    public GameEnvironment(List<Player> players, List<Enemy> enemies) {
        this.players = players;
        this.enemies = enemies;
        this.score = 0;
    }

    public void startGame() {
        System.out.println("Game started!");
        // Implement game loop and logic
    }

    public void updateScore(int points) {
        score += points;
        System.out.println("Score updated! Current score: " + score);
    }

    public void playerInteraction(Player player, Enemy enemy) {
        player.attack(enemy);
        if (enemyDefeated(enemy)) {
            updateScore(100);
        }
    }

    private boolean enemyDefeated(Enemy enemy) {
        // Simplistic check for enemy defeat
        return enemy.health <= 0;
    }
}