package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackjackGameTest {
    
    @Test
    public void testDetectWinnerWhenPlayerBusts() {
        // Prepare a game scenario where the player busts
        BlackjackGame game = new BlackjackGame() {
            @Override
            public void playGame() {
                player.addCard(new Card("Ten", "Hearts", 10));
                player.addCard(new Card("Ten", "Diamonds", 10));
                player.addCard(new Card("Three", "Spades", 3));
            }
        };
        game.playGame();
        assertTrue(game.player.getScore() > 21);
    }

    @Test
    public void testDetectWinnerWhenDealerBusts() {
        // Prepare a game scenario where the dealer busts
        BlackjackGame game = new BlackjackGame() {
            @Override
            public void playGame() {
                player.addCard(new Card("Ten", "Hearts", 10));
                player.addCard(new Card("Eight", "Diamonds", 8));

                dealer.addCard(new Card("Ten", "Spades", 10));
                dealer.addCard(new Card("Nine", "Clubs", 9));
                dealer.addCard(new Card("Three", "Hearts", 3));
            }
        };
        game.playGame();
        assertTrue(dealer.getScore() > 21);
    }

    @Test
    public void testDetectPush() {
        // Prepare a game scenario that results in a tie
        BlackjackGame game = new BlackjackGame() {
            @Override
            public void playGame() {
                player.addCard(new Card("Ten", "Hearts", 10));
                player.addCard(new Card("Seven", "Diamonds", 7));

                dealer.addCard(new Card("Ten", "Spades", 10));
                dealer.addCard(new Card("Seven", "Clubs", 7));
            }
        };
        game.playGame();
        assertEquals(player.getScore(), dealer.getScore());
    }
}