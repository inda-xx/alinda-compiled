import java.util.List;
import java.util.ArrayList;

public class CardDeck {
    private List<Card> cards;

    public CardDeck() {
        this.cards = new ArrayList<>();
        // Populate the deck with cards (details omitted for brevity)
    }

    // Method to create a deep copy of the deck
    public CardDeck getDeepCopy() {
        CardDeck newDeck = new CardDeck();
        for (Card card : this.cards) {
            newDeck.cards.add(new Card(card)); // Assuming Card has a copy constructor
        }
        return newDeck;
    }

    // Example to illustrate the difference between shallow and deep copy
    public static void main(String[] args) {
        // Create a new deck and deep copy it
        CardDeck originalDeck = new CardDeck();
        CardDeck copiedDeck = originalDeck.getDeepCopy();

        System.out.println("Deep copy example complete.");
    }
}

class Card {
    private String suit;
    private String rank;

    // Copy constructor for deep copying
    public Card(Card other) {
        this.suit = other.suit;
        this.rank = other.rank;
    }
}