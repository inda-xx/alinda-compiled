package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameEnvironmentTest {

    @Test
    public void testStartGame() {
        // Test to ensure that startGame method prints the expected start message
        // Note: This is more of a functional test and not recommended for typical unit tests due to reliance on output
        List<Player> players = Collections.emptyList();
        List<Enemy> enemies = Collections.emptyList();
        GameEnvironment environment = new GameEnvironment(players, enemies);
        environment.startGame();
    }

    @Test
    public void testUpdateScore() {
        List<Player> players = Collections.emptyList();
        List<Enemy> enemies = Collections.emptyList();
        GameEnvironment environment = new GameEnvironment(players, enemies);
        environment.updateScore(50);
        // Test if score updates correctly
        // If there was a method to retrieve the score, you could check the value
    }

    @Test
    public void testPlayerInteractionDefeatsEnemy() {
        Player player = new Player("1", "Hero", 100, 20);
        Enemy enemy = new Enemy("1", "Orc", 10, 5);
        GameEnvironment environment = new GameEnvironment(Collections.singletonList(player), Collections.singletonList(enemy));

        environment.playerInteraction(player, enemy);
        // Test to check if enemy's health drops below zero and score is updated
        // This would typically verify internal state if accessible
    }

    @Test
    public void testPlayerInteractionDoesNotDefeatEnemy() {
        Player player = new Player("1", "Hero", 100, 5);
        Enemy enemy = new Enemy("1", "Orc", 20, 5);
        GameEnvironment environment = new GameEnvironment(Collections.singletonList(player), Collections.singletonList(enemy));

        environment.playerInteraction(player, enemy);
        // Similarly, test if player's attack does not defeat the enemy
        // Again, typically verifying through the state post-interaction
    }
}

