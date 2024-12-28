package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class FetchingWeatherDataTest {

    private FetchingWeatherData fetchingWeatherData;

    @Before
    public void setUp() {
        fetchingWeatherData = new FetchingWeatherData();
    }

    @Test
    public void fetchDataPrintsValidTemperature() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        fetchingWeatherData.fetchData();
        String output = outContent.toString();

        assertTrue(output.contains("Temperature:"));
        assertTrue(output.contains("Humidity:"));
        assertTrue(output.contains("Wind Speed:"));
    }

    @Test
    public void generateWeatherReportReturnsNonNullForDay() {
        String report = fetchingWeatherData.generateWeatherReport(3);
        assertNotNull(report);
        assertTrue(report.contains("Sunny"));
    }

    @Test
    public void generateDetailedWeatherReportReturnsDetailedInfo() {
        String report = fetchingWeatherData.generateWeatherReport(3, true);
        assertNotNull(report);
        assertTrue(report.contains("Light showers"));
        assertTrue(report.contains("temperature of 22°C"));
    }

    @Test
    public void summarizeDataOutputsSummary() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        fetchingWeatherData.summarizeData(5);
        String output = outContent.toString();
        
        assertTrue(output.contains("Average Temperature:"));
        assertTrue(output.contains("Average Humidity:"));
        assertTrue(output.contains("Average Wind Speed:"));
    }
}