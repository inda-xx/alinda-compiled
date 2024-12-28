import java.util.List;
import java.util.ArrayList;

public class FleetManager {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Car01");
        cars.add("Car02");
        cars.add("Car03");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.equals("Car02")) {
                iterator.remove(); // Use iterator to avoid ConcurrentModificationException
            }
        }
        
        System.out.println(cars); // To verify the remaining cars in the list
    }
}