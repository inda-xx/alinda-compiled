import java.util.List;
import java.util.ArrayList;

public class CardCollection {

    protected ArrayList<Card> cards;

    public CardCollection() {
        this.cards = new ArrayList<>();
    }

    /**
     * Shuffles the cards in the collection.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Adds a card to the collection.
     * 
     * @param card The card to be added.
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Removes a card from the collection.
     * 
     * @return The removed card.
     */
    public Card removeCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null;
    }
}