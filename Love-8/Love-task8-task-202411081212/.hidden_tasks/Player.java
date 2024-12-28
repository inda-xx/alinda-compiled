import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Card> hand;
    private String name;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public int calculateScore() {
        int score = 0;
        int aces = 0;

        for (Card card : hand) {
            switch (card.getValue()) {
                case "J":
                case "Q":
                case "K":
                    score += 10;
                    break;
                case "A":
                    aces++;
                    score += 11;
                    break;
                default:
                    score += Integer.parseInt(card.getValue());
            }
        }

        while (score > 21 && aces > 0) {
            score -= 10;
            aces--;
        }

        return score;
    }

    public String getName() {
        return name;
    }

    public void clearHand() {
        hand.clear();
    }
}