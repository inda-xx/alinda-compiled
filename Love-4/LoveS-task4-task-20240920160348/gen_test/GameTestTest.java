package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {

    private Game game;
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;

    @Before
    public void setUp() {
        game = new Game();
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testInitialPlayerPosition() {
        game.displayGrid();
        String output = outContent.toString().trim();
        assertTrue(output.startsWith("P...."));
    }

    @Test
    public void testInitialEnemyPosition() {
        game.displayGrid();
        String output = outContent.toString().trim();
        assertTrue(output.endsWith("....E"));
    }

    @Test
    public void testMovePlayerValidMove() {
        game.movePlayer('S'); // Move down
        game.displayGrid();
        String output = outContent.toString().trim();
        assertTrue(output.contains(".P..."));
    }

    @Test
    public void testMovePlayerInvalidMove() {
        game.movePlayer('Z'); // Invalid move
        assertEquals("Invalid move! Use W, A, S, D to move.\n", outContent.toString().trim());
    }

    @Test
    public void testBoundaryConditionsTopLeft() {
        game.movePlayer('W'); // invalid, already at top
        assertEquals("Move not allowed, out of bounds.\n", outContent.toString().trim());
        
        game.movePlayer('A'); // invalid, already at left
        assertEquals("Move not allowed, out of bounds.\n", outContent.toString().split("\n")[1]);
    }

    @Test
    public void testBoundaryConditionsBottomRight() {
        game.movePlayerByOffset(4, 4); // directly teleport near to bottom-right
        game.movePlayer('S'); // Out of bounds
        assertEquals("Move not allowed, out of bounds.\n", outContent.toString().trim());

        game.movePlayer('D'); // Out of bounds
        assertEquals("Move not allowed, out of bounds.\n", outContent.toString().split("\n")[1]);
    }

    @Test
    public void testPlayerScoreAtSpecialPosition() {
        game.movePlayerByOffset(0, 4); // Move directly to special position
        assertTrue(outContent.toString().contains("You've scored! Current score: 10"));
    }

    @Test
    public void testPlayerEnemyCollision() {
        game.movePlayerByOffset(4, 4); // directly teleport to enemy
        assertTrue(outContent.toString().contains("You've encountered an enemy! Score penalized."));
    }

    @Test
    public void testMultipleMovesAndScoring() {
        game.movePlayerByOffset(0, 3); // Move to position (0,4)
        outContent.reset();
        game.movePlayer('D'); // Move to special position
        assertTrue(outContent.toString().contains("You've scored! Current score: 10"));

        outContent.reset();
        game.movePlayer('S'); // Move towards enemy
        game.movePlayer('D');
        game.movePlayer('S');
        game.movePlayer('S');
        assertTrue(outContent.toString().contains("You've encountered an enemy! Score penalized."));

        outContent.reset();
        game.movePlayer('A'); // Should be valid move
        String output = outContent.toString();
        assertFalse(output.contains("Move not allowed, out of bounds."));
    }

    @Test
    public void testTeleportFunction() {
        game.teleportPlayer(2, 3);
        game.displayGrid();
        String output = outContent.toString().trim();
        assertTrue(output.contains("..P.."));
    }
}