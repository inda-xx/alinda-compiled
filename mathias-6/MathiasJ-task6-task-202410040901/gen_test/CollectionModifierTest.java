package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CollectionModifierTest {

    @Test
    public void testRemoveBankruptPlayersAllBankrupt() {
        List<String> players = new ArrayList<>(List.of("John", "Paul", "Sam"));
        CollectionModifier.removeBankruptPlayers(players);
        assertTrue(players.isEmpty());
    }

    @Test
    public void testRemoveBankruptPlayersSomeBankrupt() {
        List<String> players = new ArrayList<>(List.of("Alexander", "Paul", "Monica"));
        CollectionModifier.removeBankruptPlayers(players);
        assertEquals(2, players.size());
        assertTrue(players.contains("Alexander"));
        assertTrue(players.contains("Monica"));
    }

    @Test
    public void testRemoveBankruptPlayersNoneBankrupt() {
        List<String> players = new ArrayList<>(List.of("Alexander", "Monica"));
        CollectionModifier.removeBankruptPlayers(players);
        assertEquals(2, players.size());
        assertTrue(players.contains("Alexander"));
        assertTrue(players.contains("Monica"));
    }

    @Test
    public void testRemoveBankruptPlayersEmptyList() {
        List<String> players = new ArrayList<>();
        CollectionModifier.removeBankruptPlayers(players);
        assertTrue(players.isEmpty());
    }
}

// CardDeckTest.java
import org.junit.Test;
import static org.junit.Assert.*;

