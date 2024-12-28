import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Card> hand;
    private int score;

    public Player() {
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void addCard(Card card) {
        if (card != null) {
            hand.add(card);
            score += card.getValue();
        }
    }

    public int getScore() {
        return score;
    }

    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }

    public void clearHand() {
        hand.clear();
        score = 0;
    }

    @Override
    public String toString() {
        return "Player's hand: " + hand + " | Score: " + score;
    }
}