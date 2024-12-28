package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BatteryManagerTest {

    @Test
    public void testManageBattery() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car01");
        cars.add("Car02");
        cars.add("Car03");

        BatteryManager.manageBattery(cars); // Just ensure it runs without error; out of scope to validate console output.
    }
}

// FleetCloningTest.java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;

import java.util.ArrayList;

