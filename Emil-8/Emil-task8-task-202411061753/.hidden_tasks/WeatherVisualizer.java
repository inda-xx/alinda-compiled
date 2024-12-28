import java.util.List;

public class WeatherVisualizer extends Application {
    
    private List<WeatherData> weatherDataList;
    
    @Override
    public void start(Stage stage) {
        WeatherDataFactory factory = new WeatherDataFactory();
        weatherDataList = factory.readWeatherDataFromFile("weather_data.csv");

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        xAxis.setLabel("Attributes");
        yAxis.setLabel("Values");

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Weather Stats");

        for (int i = 0; i < weatherDataList.size(); i++) {
            WeatherData data = weatherDataList.get(i);
            series1.getData().add(new XYChart.Data<>("Temperature " + i, data.getTemperature()));
            series1.getData().add(new XYChart.Data<>("Humidity " + i, data.getHumidity()));
            series1.getData().add(new XYChart.Data<>("Pressure " + i, data.getPressure()));
        }

        barChart.getData().addAll(series1);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(barChart);

        Scene scene = new Scene(pane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Weather Data Visualization");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}