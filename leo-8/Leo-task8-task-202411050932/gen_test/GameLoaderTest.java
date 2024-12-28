package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLoaderTest {

    @Test
    public void testLoadGameElements() {
        GameLoader loader = new GameLoader();
        String validFileContent = "Room;start;You are in a starting room.";
        try (FileWriter writer = new FileWriter("gameElements.txt")) {
            writer.write(validFileContent);
        } catch (IOException e) {
            fail("Error setting up test file: " + e.getMessage());
        }

        loader.loadGameElements("gameElements.txt");

        // Since implementation details on console outputs or effects of loading are missing,
        // the test assumes no exception is raised, i.e., the method handled file reading successfully
    }

    @Test
    public void testFileNotFound() {
        GameLoader loader = new GameLoader();
        loader.loadGameElements("nonExistentFile.txt"); // Should print error about file reading
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

