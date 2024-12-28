File: Player.java

```java
import java.util.List;

public class Player {
    private List<Card> hand;
    private String name;

    public Player(String name) {
        // Constructor
    }

    public void addCard(Card card) {
        // Method to add a card to the player's hand
    }

    public List<Card> getHand() {
        // Method to get the player's hand
    }

    public int calculateScore() {
        // Method to calculate the player's score
    }

    public String getName() {
        // Method to get the player's name
    }

    public void clearHand() {
        // Method to clear the player's hand
    }
}
```

File: Card.java

This solution implies that there is another class named `Card`. Make sure to define it even if minimally for the code structure to remain clear.
```java
public class Card {
    public String getValue() {
        // Method to get the card's value
    }
}
```