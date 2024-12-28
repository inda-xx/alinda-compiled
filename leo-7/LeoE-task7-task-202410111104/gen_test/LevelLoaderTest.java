package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LevelLoaderTest {

    @Test
    public void testLoadLevel() throws IOException {
        String filename = "test_level.txt";
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println("...P..");
            out.println(".E.E..");
            out.println("..E...");
        }

        LevelLoader levelLoader = new LevelLoader();
        levelLoader.loadLevel(filename);

        char[][] grid = levelLoader.getGrid();
        assertNotNull(grid);
        assertArrayEquals(new char[] {'.', '.', '.', 'P', '.', '.'}, grid[0]);
        assertArrayEquals(new char[] {'.', 'E', '.', 'E', '.', '.'}, grid[1]);
        assertArrayEquals(new char[] {'.', '.', 'E', '.', '.', '.'}, grid[2]);

        new File(filename).delete();
    }

    @Test
    public void testLoadLevelNonExistentFile() {
        LevelLoader levelLoader = new LevelLoader();
        levelLoader.loadLevel("non_existent_file.txt");
        assertNull(levelLoader.getGrid());
    }
}

// GameGridTest.java
import org.junit.Test;
import static org.junit.Assert.*;

