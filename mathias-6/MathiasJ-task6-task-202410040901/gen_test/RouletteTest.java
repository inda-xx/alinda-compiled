package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RouletteTest {

    @Test
    public void testStart() {
        Roulette game = new Roulette();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        game.start();

        String expectedOutput = "Starting game: null\nSpinning the Roulette wheel...\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEnd() {
        Roulette game = new Roulette();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        game.end();

        String expectedOutput = "Ending game: null\nDisplaying Roulette results...\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

// CollectionModifierTest.java
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

