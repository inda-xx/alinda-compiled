package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testMove() {
        Player player = new Player();

        // Move player to the right
        player.move('D');
        assertEquals(1, player.getX());
        assertEquals(0, player.getY());

        // Move player up
        player.move('W');
        assertEquals(1, player.getX());
        assertEquals(-1, player.getY());

        // Move player left
        player.move('A');
        assertEquals(0, player.getX());
        assertEquals(-1, player.getY());

        // Move player down
        player.move('S');
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testInvalidMoveDirection() {
        Player player = new Player();

        // Try an invalid move
        player.move('Z'); // Should print "Invalid direction..."
        
        // Verify position hasn't changed
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

