package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameCollectionManagerTest {

    private List<Enemy> enemies;
    private GameCollectionManager manager;

    @Before
    public void setUp() {
        manager = new GameCollectionManager();
    }

    @Test
    public void testRemoveDeadEnemiesRemovesDeadEnemies() {
        enemies = new ArrayList<>();
        enemies.add(new Enemy(0));  // Dead
        enemies.add(new Enemy(50)); // Alive
        enemies.add(new Enemy(0));  // Dead

        manager.removeDeadEnemies(enemies);

        assertEquals(1, enemies.size());
        assertEquals(50, enemies.get(0).getHealth());
    }

    @Test
    public void testRemoveDeadEnemiesWithAllAlive() {
        enemies = new ArrayList<>();
        enemies.add(new Enemy(50));
        enemies.add(new Enemy(30));

        manager.removeDeadEnemies(enemies);

        assertEquals(2, enemies.size());
    }

    @Test
    public void testRemoveDeadEnemiesWithNoEnemies() {
        enemies = new ArrayList<>();

        manager.removeDeadEnemies(enemies);

        assertTrue(enemies.isEmpty());
    }

    @Test
    public void testRemoveDeadEnemiesWithNullList() {
        manager.removeDeadEnemies(null); // Expect no exceptions
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

