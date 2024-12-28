package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testCarStartAndStop() {
        Car car = new Car("Generic Car", 2022);
        
        car.startCar();
        // Assert output of starting the car

        car.stopCar();
        // Assert output of stopping the car
    }
}

// CarStatusTest.java
import org.junit.Test;

