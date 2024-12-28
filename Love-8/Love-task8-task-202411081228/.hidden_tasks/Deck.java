import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> cards;
    private static Deck instance;
    
    private Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", 
                          "10", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
        shuffle();
    }
    
    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(cards.size() - 1);
        }
        return null; // Should handle empty deck scenario accordingly
    }
}