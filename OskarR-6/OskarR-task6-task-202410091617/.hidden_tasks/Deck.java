import java.util.List;

public class Deck extends CardCollection {

    private static final List<String> SUITS = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    private static final List<String> RANKS = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

    public Deck() {
        super();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Draws a card from the deck.
     * 
     * @return The drawn card.
     */
    public Card drawCard() {
        return removeCard();
    }
}