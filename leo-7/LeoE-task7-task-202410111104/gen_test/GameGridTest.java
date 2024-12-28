package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameGridTest {

    @Test
    public void testMovePlayerDefeatEnemy() {
        char[][] grid = {
            {'.', '.', '.', 'P', '.'},
            {'.', 'E', '.', '.', '.'},
            {'.', '.', '.', '.', '.'}
        };
        GameGrid gameGrid = new GameGrid(grid);
        
        gameGrid.movePlayer('S');
        GameScoringSystem scoringSystem = gameGrid.getScoringSystem();
        assertEquals(100, scoringSystem.getTotalScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerMoveDirection() {
        char[][] grid = {
            {'.', 'P', '.', '.', '.'},
            {'.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.'}
        };
        GameGrid gameGrid = new GameGrid(grid);
        gameGrid.movePlayer('X');
    }

    @Test
    public void testValidPlayerMoveWithoutEnemy() {
        char[][] grid = {
            {'.', 'P', '.', '.', '.'},
            {'.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.'}
        };
        GameGrid gameGrid = new GameGrid(grid);
        gameGrid.movePlayer('D');
        assertEquals(0, gameGrid.getPlayerRow());
        assertEquals(2, gameGrid.getPlayerCol());
    }

    @Test
    public void testPlayerMoveBoundaryCheck() {
        char[][] grid = {
            {'P', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.'}
        };
        GameGrid gameGrid = new GameGrid(grid);
        gameGrid.movePlayer('W'); // Move up out of bounds
        assertEquals(0, gameGrid.getPlayerRow());
        assertEquals(0, gameGrid.getPlayerCol());
    }
}

// GameScoringSystemTest.java
import org.junit.Test;
import static org.junit.Assert.*;

