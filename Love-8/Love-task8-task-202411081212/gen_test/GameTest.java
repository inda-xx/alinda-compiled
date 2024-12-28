package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testPlayGame_PlayerBust() {
        Deck mockedDeck = mock(Deck.class);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("10", "Hearts"));
        cards.add(new Card("5", "Clubs"));
        cards.add(new Card("7", "Diamonds"));
        when(mockedDeck.getCards()).thenReturn(cards);

        Game game = new Game(mockedDeck, new Scanner(new StringReader("hit\n")));
        
        assertEquals("Bust! Your score is over 21.", game.play());
    }

    @Test
    public void testPlayGame_DealerBust() {
        Deck mockedDeck = mock(Deck.class);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("10", "Hearts"));
        cards.add(new Card("A", "Clubs"));
        cards.add(new Card("6", "Diamonds"));
        cards.add(new Card("Q", "Hearts"));
        cards.add(new Card("7", "Spades"));
        when(mockedDeck.getCards()).thenReturn(cards);

        Game game = new Game(mockedDeck, new Scanner(new StringReader("stand\n")));
        
        assertEquals("Dealer busted! You win.", game.play());
    }

    @Test
    public void testPlayGame_PlayerWin() {
        Deck mockedDeck = mock(Deck.class);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("10", "Hearts"));
        cards.add(new Card("9", "Clubs"));
        cards.add(new Card("8", "Diamonds"));
        cards.add(new Card("Q", "Hearts"));
        when(mockedDeck.getCards()).thenReturn(cards);

        Game game = new Game(mockedDeck, new Scanner(new StringReader("stand\n")));
        
        assertEquals("You win!", game.play());
    }

    @Test
    public void testPlayGame_DealerWin() {
        Deck mockedDeck = mock(Deck.class);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("10", "Hearts"));
        cards.add(new Card("7", "Clubs"));
        cards.add(new Card("8", "Diamonds"));
        cards.add(new Card("Q", "Hearts"));
        when(mockedDeck.getCards()).thenReturn(cards);

        Game game = new Game(mockedDeck, new Scanner(new StringReader("stand\n")));
        
        assertEquals("Dealer wins!", game.play());
    }

    @Test
    public void testPlayGame_Tie() {
        Deck mockedDeck = mock(Deck.class);
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("10", "Hearts"));
        cards.add(new Card("K", "Clubs"));
        cards.add(new Card("Q", "Diamonds"));
        cards.add(new Card("J", "Spades"));
        when(mockedDeck.getCards()).thenReturn(cards);

        Game game = new Game(mockedDeck, new Scanner(new StringReader("stand\n")));
        
        assertEquals("It's a tie!", game.play());
    }
}