package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testInitialPlayerHand() {
        Game game = new Game();
        game.play();
        assertEquals(2, game.getPlayer().getHand().size());
    }

    @Test
    public void testInitialDealerHand() {
        Game game = new Game();
        game.play();
        assertEquals(2, game.getDealer().getHand().size());
    }

    @Test
    public void testPlayerBust() {
        Game game = new Game();
        game.getPlayer().receiveCard(new Card("King", "Clubs"));
        game.getPlayer().receiveCard(new Card("Queen", "Diamonds"));
        game.getPlayer().receiveCard(new Card("4", "Hearts"));
        game.determineOutcome();
        assertEquals("You lose!", game.getOutcome());
    }

    @Test
    public void testDealerBust() {
        Game game = new Game();
        game.getDealer().receiveCard(new Card("10", "Hearts"));
        game.getDealer().receiveCard(new Card("7", "Clubs"));
        game.getDealer().receiveCard(new Card("5", "Diamonds"));
        game.determineOutcome();
        assertEquals("You win!", game.getOutcome());
    }

    // Mock inputs for play method and test player decisions can be expansion cases
}
```

LibraryTest.java
```
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

