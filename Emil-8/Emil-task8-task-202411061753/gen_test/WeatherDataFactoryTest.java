package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherDataFactoryTest {

    private WeatherDataFactory factory;
    private WeatherDataCSVParser parserMock;
    private static final String TEMP_FILENAME = "temp_weather_data.csv";

    @Before
    public void setUp() {
        factory = new WeatherDataFactory();
        parserMock = mock(WeatherDataCSVParser.class);
    }

    @Test
    public void testCreateWeatherData() {
        WeatherData data = factory.createWeatherData(25.3, 65.0, 1012.0);
        assertEquals(25.3, data.getTemperature(), 0.001);
        assertEquals(65.0, data.getHumidity(), 0.001);
        assertEquals(1012.0, data.getPressure(), 0.001);
    }

    @Test
    public void testReadWeatherDataFromValidCSV() throws IOException {
        writeTestCSVContent("20.5,60.2,1015.5\n15.3,80.5,1020.1\n");
        List<WeatherData> data = factory.readWeatherDataFromFile(TEMP_FILENAME);
        assertEquals(2, data.size());
        assertEquals(20.5, data.get(0).getTemperature(), 0.001);
        assertEquals(60.2, data.get(0).getHumidity(), 0.001);
        assertEquals(1015.5, data.get(0).getPressure(), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void testReadWeatherDataFromInvalidCSV() throws IOException {
        writeTestCSVContent("invalid,60.2,1015.5\n");
        List<WeatherData> data = factory.readWeatherDataFromFile(TEMP_FILENAME);
    }

    @Test
    public void testReadWeatherDataFromEmptyFile() throws IOException {
        writeTestCSVContent("");
        List<WeatherData> data = factory.readWeatherDataFromFile(TEMP_FILENAME);
        assertTrue(data.isEmpty());
    }

    // Helper method to create temporary test CSV files
    private void writeTestCSVContent(String content) throws IOException {
        Files.write(Paths.get(TEMP_FILENAME), content.getBytes());
    }
    
    // Cleanup temporary files if necessary
    @After
    public void cleanUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEMP_FILENAME));
    }
}
```

WeatherDataTest.java
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

