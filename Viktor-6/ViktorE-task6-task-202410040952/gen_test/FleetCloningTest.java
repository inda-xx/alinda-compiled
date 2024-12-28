package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FleetCloningTest {

    @Test
    public void testShallowCopy() {
        ArrayList<String> originalFleet = new ArrayList<>();
        originalFleet.add("Car01");
        originalFleet.add("Car02");

        ArrayList<String> shallowCopyFleet = FleetCloning.shallowCopy(originalFleet);

        assertEquals(originalFleet, shallowCopyFleet);
        assertNotSame(originalFleet, shallowCopyFleet);
    }

    @Test
    public void testDeepCopy() {
        ArrayList<String> originalFleet = new ArrayList<>();
        originalFleet.add("Car01");
        originalFleet.add("Car02");

        ArrayList<String> deepCopyFleet = FleetCloning.deepCopy(originalFleet);

        assertEquals(originalFleet, deepCopyFleet);
        assertNotSame(originalFleet, deepCopyFleet);

        // Adding new element should not affect the original fleet
        deepCopyFleet.add("Car05");
        assertEquals(2, originalFleet.size());
        assertEquals(3, deepCopyFleet.size());
    }
}


// CarTest.java
import org.junit.Test;

