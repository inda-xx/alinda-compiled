package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataTest {

    @Test
    public void testWeatherDataConstructorAndGetters() {
        WeatherData data = new WeatherData(25.0, 70.0, 1013.0);
        assertEquals(25.0, data.getTemperature(), 0.001);
        assertEquals(70.0, data.getHumidity(), 0.001);
        assertEquals(1013.0, data.getPressure(), 0.001);
    }

    @Test
    public void testSetTemperature() {
        WeatherData data = new WeatherData(0.0, 0.0, 0.0);
        data.setTemperature(25.0);
        assertEquals(25.0, data.getTemperature(), 0.001);
    }

    @Test
    public void testSetHumidity() {
        WeatherData data = new WeatherData(0.0, 0.0, 0.0);
        data.setHumidity(70.0);
        assertEquals(70.0, data.getHumidity(), 0.001);
    }

    @Test
    public void testSetPressure() {
        WeatherData data = new WeatherData(0.0, 0.0, 0.0);
        data.setPressure(1013.0);
        assertEquals(1013.0, data.getPressure(), 0.001);
    }
}
```

WeatherDataCSVParserTest.java
```java
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import java.io.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

