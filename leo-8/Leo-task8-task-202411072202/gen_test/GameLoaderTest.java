package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLoaderTest {

    @Test
    public void testLoadPlayersFromValidFile() {
        List<Player> players = GameLoader.loadPlayersFrom("validPlayers.csv");
        // Verify that players list is loaded correctly from a valid file
        // Compare sizes and details of the player list
    }

    @Test
    public void testLoadPlayersFromInvalidFileFormat() {
        List<Player> players = GameLoader.loadPlayersFrom("invalidFormat.csv");
        // Verify correct error handling when file format is incorrect
    }

    @Test
    public void testLoadEnemiesFromValidFile() {
        List<Enemy> enemies = GameLoader.loadEnemiesFrom("validEnemies.csv");
        // Similarly, verify that enemies are loaded correctly
    }

    @Test
    public void testLoadEnemiesFromNonExistentFile() {
        List<Enemy> enemies = GameLoader.loadEnemiesFrom("nonExistent.csv");
        // Test handling of non-existent files, typically expect an error message or empty list
    }
}