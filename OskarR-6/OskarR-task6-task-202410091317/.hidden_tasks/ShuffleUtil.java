import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ShuffleUtil {

    /**
     * Shuffles a list of integers and demonstrates deep vs shallow copy.
     * @param originalList the original list to shuffle.
     * @return a shuffled copy of the list.
     */
    public static ArrayList<Integer> shuffleList(ArrayList<Integer> originalList) {
        // Shallow copy: Both lists share the same objects
        ArrayList<Integer> shallowCopy = originalList;  // same reference

        // Deep copy: New list with new objects
        ArrayList<Integer> deepCopy = new ArrayList<>(originalList);  // different reference

        // Shuffle the deep copy to prevent altering the original list
        Collections.shuffle(deepCopy, new Random());

        // Returning the shuffled deep copy
        return deepCopy;
    }
}