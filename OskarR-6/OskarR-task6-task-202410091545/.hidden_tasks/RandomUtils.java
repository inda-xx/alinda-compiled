import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomUtils {

    /**
     * Generate 'n' random integers and return them in an ArrayList.
     * @param n the number of random numbers to generate.
     * @return an ArrayList of n random numbers from 0 to 9.
     */
    public static ArrayList<Integer> generateRandomNumbers(int n) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(10)); // Generates a number between 0 and 9
        }
        return numbers;
    }

    /**
     * Create and return a shuffled deep copy of the numbers list.
     * @param numbers the list to shuffle.
     * @return a shuffled version of the provided list.
     */
    public static ArrayList<Integer> shuffleNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> copy = new ArrayList<>(numbers); // Create a deep copy
        Collections.shuffle(copy); // Shuffle the copy
        return copy;
    }
}