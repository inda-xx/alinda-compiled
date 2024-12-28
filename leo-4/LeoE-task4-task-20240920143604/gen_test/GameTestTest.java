package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testInitialPlayerPosition() {
        char[][] grid = game.getGrid();
        assertEquals('P', grid[2][2]); // Initial player position should be center of grid
    }

    @Test
    public void testMovePlayerValidMoves() {
        game.movePlayer('W'); // Move up
        char[][] grid = game.getGrid();
        assertEquals('P', grid[1][2]);
        
        game.movePlayer('A'); // Move left
        grid = game.getGrid();
        assertEquals('P', grid[1][1]);
        
        game.movePlayer('S'); // Move down
        grid = game.getGrid();
        assertEquals('P', grid[2][1]);
        
        game.movePlayer('D'); // Move right
        grid = game.getGrid();
        assertEquals('P', grid[2][2]); // Back to center
    }

    @Test
    public void testMovePlayerOutOfBounds() {
        // Trying to move player beyond boundaries
        game.movePlayer('W'); // Move up to (1,2)
        game.movePlayer('W'); // Move up to (0,2)
        game.movePlayer('W'); // Invalid move, still at (0,2)
        
        char[][] grid = game.getGrid();
        assertEquals('P', grid[0][2]);
    }

    @Test
    public void testCollideWithPoint() {
        // Assuming the test ensures that moving to a point increases score correctly
        int initialScore = game.calculateScore();
        
        placeItemNearPlayer(Game.POINT, 2, 3);
        game.movePlayer('D');
        
        assertEquals(initialScore + 10, game.calculateScore());
    }

    @Test
    public void testCollideWithEnemy() {
        // Assuming the test ensures that moving to an enemy reduces score correctly
        int initialScore = game.calculateScore();
        
        placeItemNearPlayer(Game.ENEMY, 2, 3);
        game.movePlayer('D');
        
        assertEquals(initialScore - 10, game.calculateScore());
    }

    @Test
    public void testCalculateScoreWithBonus() {
        int score = game.calculateScore(5);
        assertEquals(5, score);
        
        score = game.calculateScore(-3);
        assertEquals(2, score);
    }

    private void placeItemNearPlayer(char item, int x, int y) {
        char[][] grid = game.getGrid();
        grid[x][y] = item;
    }
}