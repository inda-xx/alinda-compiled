package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackjackTest {

    @Test
    public void testStart() {
        Blackjack game = new Blackjack();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        game.start();

        String expectedOutput = "Starting game: null\nDealing cards for Blackjack...\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testEnd() {
        Blackjack game = new Blackjack();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        game.end();

        String expectedOutput = "Ending game: null\nCalculating results for Blackjack...\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

// RouletteTest.java
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

