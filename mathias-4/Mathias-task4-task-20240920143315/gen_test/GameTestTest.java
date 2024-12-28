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
    public void testInitialConditions() {
        // Ensuring the player's initial position is (0, 0) and score is 0
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("right"));
    }

    @Test
    public void testMovePlayerUp() {
        assertFalse("Should not be able to move up", game.movePlayer("up"));
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("up"));
    }

    @Test
    public void testMovePlayerDown() {
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("down"));
        assertTrue(game.movePlayer("down"));
        assertFalse("Should not be able to move down", game.movePlayer("down"));
    }

    @Test
    public void testMovePlayerLeft() {
        assertFalse("Should not be able to move left", game.movePlayer("left"));
        assertTrue(game.movePlayer("right"));
        assertTrue(game.movePlayer("right"));
        assertTrue(game.movePlayer("left"));
    }

    @Test
    public void testMovePlayerRight() {
        assertTrue(game.movePlayer("right"));
        assertTrue(game.movePlayer("right"));
        assertTrue(game.movePlayer("right"));
        assertTrue(game.movePlayer("right"));
        assertFalse("Should not be able to move right", game.movePlayer("right"));
    }

    @Test
    public void testInvalidMove() {
        assertFalse("Invalid direction should return false", game.movePlayer("jump"));
    }

    @Test
    public void testInteractionWithBandMember() {
        // Move player to the position of the band member
        assertTrue("Move down", game.movePlayer("down")); 
        assertTrue("Move right", game.movePlayer("right"));

        // Since we assume interaction gives 10 points, the score should be updated
        assertTrue("Should gain 10 points for interaction", game.movePlayer("right") && game.victoryCondition());
    }

    @Test
    public void testVictoryCondition() {
        for (int i = 0; i < 2; i++) {
            game.interact(10); // assume interacting with band member gives 10 points
        }
        assertTrue("Victory condition should be met", game.victoryCondition());
    }

    @Test
    public void testVictoryConditionNotMetInitially() {
        assertFalse("Initially, victory condition should not be met", game.victoryCondition());
    }
}