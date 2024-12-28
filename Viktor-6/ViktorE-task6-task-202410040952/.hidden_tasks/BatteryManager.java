import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class BatteryManager {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car01");
        cars.add("Car02");
        cars.add("Car03");

        manageBattery(cars);
    }

    public static void manageBattery(ArrayList<String> cars) {
        Random random = new Random();
        for (String car : cars) {
            int battery = random.nextInt(100) + 1; // Generates number between 1-100
            String status = (battery <= 20) ? "Recharge Needed" : "Battery Sufficient";
            System.out.println(car + " - Battery Level: " + battery + "%, Status: " + status);
        }
    }
}