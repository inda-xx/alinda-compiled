package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player(0, 0);
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerMoveWithinGrid() {
        player.movePlayer(50, 50);
        assertEquals(50, player.getX());
        assertEquals(50, player.getY());
    }

    @Test
    public void testPlayerMoveBeyondGridBorders() {
        player.movePlayer(200, 200);
        assertEquals(100, player.getX());
        assertEquals(100, player.getY());
    }

    @Test
    public void testPlayerMoveBelowZero() {
        player.movePlayer(-10, -10);
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerIncreaseScore() {
        int initialScore = player.getScore();
        player.increaseScore(10);
        assertEquals(initialScore + 10, player.getScore());
    }
}

// EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

