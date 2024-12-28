package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataCSVParserTest {

    private WeatherDataCSVParser parser;

    @Before
    public void setUp() {
        parser = new WeatherDataCSVParser();
    }

    @Test
    public void testParseCSVValidContent() throws Exception {
        String validContent = "20.5,60.2,1015.5\n15.3,80.5,1020.1\n";
        BufferedReader reader = new BufferedReader(new StringReader(validContent));
        List<WeatherData> data = parser.parseCSV(reader);

        assertEquals(2, data.size());
        
        assertEquals(20.5, data.get(0).getTemperature(), 0.001);
        assertEquals(60.2, data.get(0).getHumidity(), 0.001);
        assertEquals(1015.5, data.get(0).getPressure(), 0.001);

        assertEquals(15.3, data.get(1).getTemperature(), 0.001);
        assertEquals(80.5, data.get(1).getHumidity(), 0.001);
        assertEquals(1020.1, data.get(1).getPressure(), 0.001);
    }

    @Test
    public void testParseCSVHandlesEmptyContent() throws Exception {
        String emptyContent = "";
        BufferedReader reader = new BufferedReader(new StringReader(emptyContent));
        List<WeatherData> data = parser.parseCSV(reader);
        assertTrue(data.isEmpty());
    }

    @Test(expected = NumberFormatException.class)
    public void testParseCSVHandlesInvalidContent() throws Exception {
        String invalidContent = "invalid,60.2,1015.5\n";
        BufferedReader reader = new BufferedReader(new StringReader(invalidContent));
        parser.parseCSV(reader);
    }
}
```