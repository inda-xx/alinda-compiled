package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModifyCollectionTest {

    @Test
    public void testRemoveDuplicates() {
        ModifyCollection collection = new ModifyCollection();
        ArrayList<Integer> ticket = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5));
        collection.removeDuplicates(ticket);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), ticket, "Should remove duplicates");
    }
    
    @Test
    public void testRemoveDuplicatesOnEmpty() {
        ModifyCollection collection = new ModifyCollection();
        ArrayList<Integer> ticket = new ArrayList<>();
        collection.removeDuplicates(ticket);
        assertTrue(ticket.isEmpty(), "Empty list should remain empty");
    }

    @Test
    public void testRemoveDuplicatesOnNull() {
        ModifyCollection collection = new ModifyCollection();
        collection.removeDuplicates(null); // Should not throw exception
    }
}

Ensure each of these test files is saved as shown, with the corresponding naming conventions, in separate files named according to the test class they contain in the `src/test/java/` directory. Each of these tests checks a variety of behaviors such as expected list lengths, uniqueness of numbers in the list, and proper functionality of the `ModifyCollection` class.