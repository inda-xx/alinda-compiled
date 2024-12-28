// File: Player.java
import java.util.List;
import java.util.ArrayList;

public class Player {
    private List<Card> hand;
    
    public Player() {
        // Constructor
    }
    
    public void receiveCard(Card card) {
        // Method to receive a card
    }
    
    public int calculateTotal() {
        // Method to calculate the total value of the hand
    }
    
    public List<Card> getHand() {
        // Method to get a copy of the hand
    }
}

// File: Card.java
// Note: Assume the existence of a Card class with at least a getRank method.
// public class Card {
//     public String getRank() {
//         // Method to get the rank of the card
//     }
// }