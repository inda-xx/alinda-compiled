package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FleetManagerTest {

    @Test
    public void testRemoveCarFromFleet() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car01");
        cars.add("Car02");
        cars.add("Car03");

        FleetManager.removeCarFromFleet(cars, "Car02");
        
        assertEquals(2, cars.size());
        assertEquals("Car01", cars.get(0));
        assertEquals("Car03", cars.get(1));
    }
}

// BatteryManagerTest.java
import org.junit.Test;

import java.util.ArrayList;

