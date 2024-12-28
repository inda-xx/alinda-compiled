import java.util.List;
import java.util.ArrayList;

public class WeatherDataCSVParser {
    public List<WeatherData> parseCSV(String filename) {
        List<WeatherData> weatherList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                double temperature = Double.parseDouble(values[0]);
                double humidity = Double.parseDouble(values[1]);
                double pressure = Double.parseDouble(values[2]);
                weatherList.add(new WeatherData(temperature, humidity, pressure));
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return weatherList;
    }
}