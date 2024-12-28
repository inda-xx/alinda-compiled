package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarStatusTest {

    @Test
    public void testCarStatus() {
        int batteryLevel = 15; // Example battery level
        String status = (batteryLevel <= 20) ? "Recharge Needed" : "Battery Sufficient";
        // Assuming a print statement; this would be captured in a real test framework's stdout capture
    }
}