import java.util.List;

public class WeatherDataFactory {
    public WeatherData createWeatherData(double temperature, double humidity, double pressure) {
        return new WeatherData(temperature, humidity, pressure);
    }
    
    public List<WeatherData> readWeatherDataFromFile(String filename) {
        WeatherDataCSVParser parser = new WeatherDataCSVParser();
        return parser.parseCSV(filename);
    }
}