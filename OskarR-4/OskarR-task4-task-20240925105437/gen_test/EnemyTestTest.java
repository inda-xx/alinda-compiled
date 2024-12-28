package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testEncounterWithoutWeapon() {
        assertTrue(enemy.encounter(5, 5));
        assertFalse(enemy.encounter(4, 5));
        assertFalse(enemy.encounter(5, 4));
    }

    @Test
    public void testEncounterWithWeapon() {
        assertTrue(enemy.encounter(5, 5, true));
        assertTrue(enemy.encounter(5, 5, false));
        assertFalse(enemy.encounter(4, 5, false));
    }

    @Test
    public void testNoEncounterWithWeapon() {
        assertFalse(enemy.encounter(4, 4, true));
    }
}