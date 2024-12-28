import java.util.Random;

public class FetchingWeatherData {

    private final Random random = new Random();

    public void fetchData() {
        double temperature;
        int humidity;
        int windSpeed;
        boolean validData = false;

        while (!validData) {
            // Generate random weather data
            temperature = random.nextDouble() * 60 - 10; // Temperature between -10 and 50
            humidity = random.nextInt(101); // Humidity between 0 and 100
            windSpeed = random.nextInt(50); // Wind speed between 0 and 50

            // Validate data
            validData = (temperature >= -10 && temperature <= 50);
        }

        // Output the generated weather data
        System.out.printf("Temperature: %.2f, Humidity: %d%%, Wind Speed: %d km/h%n", temperature, humidity, windSpeed);
    }

    public void summarizeData(int numberOfDays) {
        double totalTemperature = 0;
        int totalHumidity = 0;
        int totalWindSpeed = 0;

        for (int i = 0; i < numberOfDays; i++) {
            // Assume fetchData updates global state or mimic it with new random data
            double dailyTemperature = random.nextDouble() * 60 - 10;
            int dailyHumidity = random.nextInt(101);
            int dailyWindSpeed = random.nextInt(50);

            // Accumulate the sums
            totalTemperature += dailyTemperature;
            totalHumidity += dailyHumidity;
            totalWindSpeed += dailyWindSpeed;
        }

        // Output the average weather statistics
        System.out.printf("Average Temperature: %.2f, Average Humidity: %d%%, Average Wind Speed: %d km/h%n",
                totalTemperature / numberOfDays, totalHumidity / numberOfDays, totalWindSpeed / numberOfDays);
    }

    // Overloaded methods for generating weather reports
    public String generateWeatherReport(int day) {
        return String.format("Report for day %d: Sunny", day);
    }

    public String generateWeatherReport(int day, boolean detailed) {
        if (detailed) {
            return String.format("Detailed report for day %d: Light showers with temperature of 22°C, humidity 75%%, wind 18 km/h", day);
        } else {
            return generateWeatherReport(day);
        }
    }

    public static void main(String[] args) {
        FetchingWeatherData weatherData = new FetchingWeatherData();
        weatherData.fetchData();
        weatherData.summarizeData(5);

        // Test overloaded methods
        System.out.println(weatherData.generateWeatherReport(1));
        System.out.println(weatherData.generateWeatherReport(2, true));
    }
}