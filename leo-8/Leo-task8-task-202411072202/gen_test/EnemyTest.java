package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testEnemyTakeDamage() {
        Enemy enemy = new Enemy("1", "Orc", 50, 10);
        enemy.takeDamage(20);
        // Test to ensure that enemy health is reduced correctly
        // Assuming we have getter methods to verify decrement
    }

    @Test
    public void testEnemyDefeated() {
        Enemy enemy = new Enemy("1", "Orc", 15, 5);
        enemy.takeDamage(15);
        // Check if the enemy's defeated status message is printed or internal state reflects this
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

