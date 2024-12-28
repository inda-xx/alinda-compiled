package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testPickUpAndUseItem() {
        Player player = new Player();
        Item potion = new Item("Potion", "Heals 50 HP");

        // Test picking up item
        player.pickUpItem(potion);
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Test using item
        player.useItem("Potion");
        assertTrue(out.toString().contains("Using item: Potion"));
    }

    @Test
    public void testUseItemNotInInventory() {
        Player player = new Player();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Test using non-existent item
        player.useItem("Invisible Cloak");
        assertTrue(out.toString().contains("Item not found in inventory: Invisible Cloak"));
    }
}