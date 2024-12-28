package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testCalculateTotalWithNoCards() {
        Player player = new Player();
        assertEquals(0, player.calculateTotal());
    }

    @Test
    public void testCalculateTotalWithSeveralCards() {
        Player player = new Player();
        player.receiveCard(new Card("5", "Hearts"));
        player.receiveCard(new Card("King", "Diamonds"));
        assertEquals(15, player.calculateTotal());
    }

    @Test
    public void testCalculateTotalWithAces() {
        Player player = new Player();
        player.receiveCard(new Card("Ace", "Clubs"));
        player.receiveCard(new Card("Ace", "Spades"));
        player.receiveCard(new Card("9", "Diamonds"));
        assertEquals(21, player.calculateTotal());
    }

    @Test
    public void testReceiveCardIncreasesHandSize() {
        Player player = new Player();
        player.receiveCard(new Card("7", "Hearts"));
        assertEquals(1, player.getHand().size());
    }
}
```

LibrarySystemTest.java
```
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

