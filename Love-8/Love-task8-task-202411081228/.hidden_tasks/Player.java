import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Card> hand;
    
    public Player() {
        hand = new ArrayList<>();
    }
    
    public void receiveCard(Card card) {
        hand.add(card);
    }
    
    public int calculateTotal() {
        int total = 0;
        int aceCount = 0;
        
        for (Card card : hand) {
            String rank = card.getRank();
            if (rank.equals("Ace")) {
                aceCount++;
                total += 11;
            } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                total += 10;
            } else {
                total += Integer.parseInt(rank);
            }
        }
        
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        
        return total;
    }
    
    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }
}