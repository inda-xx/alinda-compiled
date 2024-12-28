import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public int remainingCards() {
        return cards.size();
    }
}