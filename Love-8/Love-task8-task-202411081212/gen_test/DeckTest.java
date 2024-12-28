package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testLoadDeckFromFile() throws IOException {
        Deck deck = new Deck();
        File tempFile = File.createTempFile("tempDeck", ".txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
            writer.println("A,Spades");
            writer.println("2,Hearts");
        }
        deck.loadDeckFromFile(tempFile.getAbsolutePath());
        List<Card> cards = deck.getCards();
        assertEquals(2, cards.size());
        assertEquals(new Card("A", "Spades"), cards.get(0));
        assertEquals(new Card("2", "Hearts"), cards.get(1));
    }

    @Test
    public void testLoadDeckFromFile_InvalidEntry() throws IOException {
        Deck deck = new Deck();
        File tempFile = File.createTempFile("tempDeck", ".txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {
            writer.println("A,Spades");
            writer.println("InvalidEntry");
        }
        deck.loadDeckFromFile(tempFile.getAbsolutePath());
        List<Card> cards = deck.getCards();
        assertEquals(1, cards.size());
        assertEquals(new Card("A", "Spades"), cards.get(0));
    }
}

