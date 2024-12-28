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
    public void testInitialPosition() {
        assertEquals(0, game.playerX);
        assertEquals(0, game.playerY);
    }

    @Test
    public void testMovePlayerValidInputs() {
        simulateInput("w\ns\nd\na\nexit\n");
        game.movePlayer();
        assertEquals(0, game.playerX);
        assertEquals(0, game.playerY);
    }
    
    @Test
    public void testMovePlayerInvalidInput() {
        simulateInput("x\nexit\n");
        game.movePlayer();
        assertEquals(0, game.playerX);
        assertEquals(0, game.playerY);
    }

    @Test
    public void testNegativeBoundaryConditions() {
        simulateInput("a\nw\n");
        game.movePlayer();
        assertTrue(game.gameOver);
    }

    @Test
    public void testCalculateScore() {
        game.calculateScore();
        assertEquals(1500, game.score);
    }
    
    private void simulateInput(String data) {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
        } finally {
            System.setIn(stdin);
        }
    }
}

// EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

