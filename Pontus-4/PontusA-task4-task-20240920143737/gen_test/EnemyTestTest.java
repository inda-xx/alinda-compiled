package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(10, 20);
    }

    @Test
    public void testEnemyInitialPosition() {
        assertEquals(10, enemy.getX());
        assertEquals(20, enemy.getY());
    }
}