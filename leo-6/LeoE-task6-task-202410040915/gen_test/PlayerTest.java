package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testUpdateScorePowerMoveUnlocked() {
        Player player = new Player(100, 0);
        player.updateScore(100);
        assertTrue(player.hasPowerMove());
    }

    @Test
    public void testUpdateScorePowerMoveNotUnlocked() {
        Player player = new Player(100, 0);
        player.updateScore(50);
        assertFalse(player.hasPowerMove());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

