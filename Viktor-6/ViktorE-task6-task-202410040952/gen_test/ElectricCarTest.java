package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElectricCarTest {
    private ElectricCar tesla;

    @Before
    public void setUp() {
        tesla = new ElectricCar("Tesla Model S", 2022, 50);
    }

    @Test
    public void testRecharge() {
        tesla.recharge();
        assertEquals(100, tesla.batteryLevel);
    }

    @Test
    public void testDisplayBatteryStatus() {
        tesla.displayBatteryStatus();
        assertEquals(50, tesla.batteryLevel);
    }

    @Test
    public void testStartAndStopCar() {
        tesla.startCar();
        assertEquals("Tesla Model S starting.", outContent.toString().trim());
        outContent.reset();

        tesla.stopCar();
        assertEquals("Tesla Model S stopping.", outContent.toString().trim());
    }
}

// FleetManagerTest.java
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

