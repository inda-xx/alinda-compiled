import java.util.List;
import java.util.ArrayList;

public class FleetCloning {
    
    public static void main(String[] args) {
        ArrayList<String> originalFleet = new ArrayList<String>();
        originalFleet.add("Car01");
        originalFleet.add("Car02");

        ArrayList<String> shallowCopyFleet = shallowCopy(originalFleet);
        ArrayList<String> deepCopyFleet = deepCopy(originalFleet);

        originalFleet.add("Car03");
        shallowCopyFleet.add("Car04");
        deepCopyFleet.add("Car05");

        System.out.println("Original Fleet: " + originalFleet);
        System.out.println("Shallow Copy Fleet: " + shallowCopyFleet);
        System.out.println("Deep Copy Fleet: " + deepCopyFleet);
    }
    
    public static ArrayList<String> shallowCopy(ArrayList<String> original) {
        return new ArrayList<>(original); // A new list with the same references
    }

    public static ArrayList<String> deepCopy(ArrayList<String> original) {
        ArrayList<String> deepCopyList = new ArrayList<>();
        for (String item : original) {
            deepCopyList.add(new String(item)); // Creating new string objects for each item
        }
        return deepCopyList;
    }
}