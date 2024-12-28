package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {
    
    private Game game;
    private Player player;
    private List<Enemy> enemies;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player(0, 0);
        enemies = new ArrayList<>();
    }

    @Test
    public void testInitialPlayerPositionAndScore() {
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemiesInitialization() {
        assertNotNull(game);
        assertEquals(5, game.getEnemies().size());
    }

    @Test
    public void testCheckCollisionWhenNoCollision() {
        Enemy enemy = new Enemy(10, 10);
        assertFalse(game.checkCollision(enemy));
    }

    @Test
    public void testCheckCollisionWhenCollisionOccurs() {
        Enemy enemy = new Enemy(0, 0);
        assertTrue(game.checkCollision(enemy));
    }

    @Test
    public void testPlayerMoveEnsuresWithinBounds() {
        player.movePlayer(-5, -5);
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());

        player.movePlayer(200, 200);
        assertEquals(100, player.getX());
        assertEquals(100, player.getY());
    }

    @Test
    public void testCollectPowerUpWithTypeShield() {
        String expectedOutput = "Collected Shield Power-Up!";
        assertEquals(expectedOutput, game.collectPowerUp("shield"));
    }

    @Test
    public void testCollectPowerUpWithTypeSpeed() {
        String expectedOutput = "Collected Speed Power-Up!";
        assertEquals(expectedOutput, game.collectPowerUp("speed"));
    }

    @Test
    public void testCollectPowerUpWithInvalidType() {
        String type = "invalid";
        String expectedOutput = "";
        assertEquals(expectedOutput, game.collectPowerUp(type));
    }

    @Test
    public void testCollectPowerUpWithIntegerBoost() {
        int initialScore = player.getScore();
        int boost = 20;
        game.collectPowerUp(boost);
        assertEquals(initialScore + boost, player.getScore());
    }

    @Test
    public void testUpdateGameWithoutCollision() {
        int initialScore = player.getScore();
        game.updateGame();
        assertFalse(game.isGameOver());
        assertEquals(initialScore + 10, player.getScore());
    }

    @Test
    public void testUpdateGameWithCollision() {
        Enemy enemy = new Enemy(0, 0);
        game.getEnemies().add(enemy);
        game.updateGame();
        assertTrue(game.isGameOver());
    }
    
    @Test
    public void testCollisionBoundary() {
        player.setX(100);
        player.setY(100);
        Enemy enemy = new Enemy(100, 100);
        assertTrue(game.checkCollision(enemy));
    }

    @Test
    public void testLargeNumberOfEnemiesPerformance() {
        for (int i = 0; i < 1000; i++) {
            game.getEnemies().add(new Enemy(i, i));
        }
        long startTime = System.currentTimeMillis();
        game.updateGame();
        long endTime = System.currentTimeMillis();
        assertTrue("Performance issue with large number of enemies", endTime - startTime < 1000);
    }
}

// PlayerTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

