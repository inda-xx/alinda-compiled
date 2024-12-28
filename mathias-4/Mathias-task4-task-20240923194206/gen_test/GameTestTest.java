package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        game = new Game();
        player = new Player();
        enemy = new Enemy(5, 100);
    }

    @Test
    public void testGameStartsWithCorrectInitialState() {
        assertFalse(game.isRunning()); // Check the game is not running initially
        assertEquals(0, player.getPosition());
        assertNotNull(game.getEnemies());
        assertEquals(0, game.getScore());
    }

    @Test
    public void testPlayerMovesRightSuccessfully() {
        player.moveRight(2);
        assertEquals(2, player.getPosition());
    }

    @Test
    public void testPlayerMovesLeftSuccessfully() {
        player.moveRight(10);
        player.moveLeft(3);
        assertEquals(7, player.getPosition());
    }

    @Test
    public void testPlayerDoesNotMoveLeftPastZero() {
        player.moveLeft(5);
        assertEquals(0, player.getPosition());
    }

    @Test
    public void testEnemyPositionAndHealthAreCorrect() {
        assertEquals(5, enemy.getPosition());
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testAttackReducesEnemyHealth() {
        enemy.attack(30);
        assertEquals(70, enemy.getHealth());
    }

    @Test
    public void testAttackDefeatsEnemy() {
        boolean defeated = enemy.attack(100);
        assertTrue(defeated);
        assertEquals(0, enemy.getHealth());
    }
    
    @Test
    public void testAttackWithStringFireReducesEnemyHealthCorrectly() {
        enemy.attack("fire");
        assertEquals(50, enemy.getHealth());
    }

    @Test
    public void testAttackWithStringIceReducesEnemyHealthCorrectly() {
        enemy.attack("ice");
        assertEquals(70, enemy.getHealth());
    }

    @Test
    public void testAttackWithStringDefaultReducesEnemyHealthCorrectly() {
        enemy.attack("slap");
        assertEquals(90, enemy.getHealth());
    }

    @Test
    public void testGameWinningCondition() {
        for (Enemy e : game.getEnemies()) {
            while (e.getHealth() > 0) {
                e.attack(10);
            }
        }
        assertTrue(game.checkWinCondition());
    }

    @Test
    public void testUpdateGameIncrementsScoreOnDefeat() {
        int initialScore = game.getScore();
        player.moveRight(5);
        game.updateGame();
        assertTrue(game.getScore() > initialScore);
    }
    
    @Test
    public void testMultipleEnemyInteraction() {
        Enemy enemy2 = new Enemy(8, 150);
        player.moveRight(8);
        game.getEnemies().add(enemy2);
        game.updateGame();
        assertEquals(50, enemy2.getHealth());
    }
} 

// Assuming you will also create separate test files for Player and Enemy to test them individually.