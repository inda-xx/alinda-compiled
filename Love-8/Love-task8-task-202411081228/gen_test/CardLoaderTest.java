package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardLoaderTest {
    private String validFilePath;
    private String invalidFilePath;
    private String emptyFilePath;

    @Before
    public void setUp() throws IOException {
        validFilePath = "validDeck.txt";
        invalidFilePath = "invalidDeck.txt";
        emptyFilePath = "emptyDeck.txt";

        // Setup valid file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(validFilePath))) {
            writer.write("Ace of Spades\n");
            writer.write("King of Hearts\n");
            writer.write("3 of Diamonds\n");
        }

        // Setup invalid file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(invalidFilePath))) {
            writer.write("Ace of Spades\n");
            writer.write("Invalid Format\n");
        }

        // Setup empty file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(emptyFilePath))) {
        }
    }

    @Test
    public void testLoadCardsFromFile_ValidFile() {
        CardLoader loader = new CardLoader();
        List<Card> deck = loader.loadCardsFromFile(validFilePath);
        assertEquals(3, deck.size());
        assertEquals("Ace", deck.get(0).getRank());
        assertEquals("Spades", deck.get(0).getSuit());
    }

    @Test
    public void testLoadCardsFromFile_InvalidFile() {
        CardLoader loader = new CardLoader();
        List<Card> deck = loader.loadCardsFromFile(invalidFilePath);
        assertEquals(1, deck.size());
        assertEquals("Ace", deck.get(0).getRank());
        assertEquals("Spades", deck.get(0).getSuit());
    }

    @Test
    public void testLoadCardsFromFile_EmptyFile() {
        CardLoader loader = new CardLoader();
        List<Card> deck = loader.loadCardsFromFile(emptyFilePath);
        assertTrue(deck.isEmpty());
    }

    @Test
    public void testLoadCardsFromFile_NonExistentFile() {
        CardLoader loader = new CardLoader();
        List<Card> deck = loader.loadCardsFromFile("nonexistent.txt");
        assertTrue(deck.isEmpty());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

