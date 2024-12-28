import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomUtil {

    /**
     * Generates a list of n random integers between 1 and 100.
     * @param n the number of random numbers to generate.
     * @return an ArrayList containing n random integers.
     */
    public static ArrayList<Integer> generateRandomNumbers(int n) {
        Random random = new Random();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(100) + 1;
            randomNumbers.add(number);
            System.out.println("Number: " + number + " is " + (number % 2 == 0 ? "even" : "odd"));
        }
        return randomNumbers;
    }

    /**
     * Removes all instances of a specified number from a list using an Iterator.
     * @param list the list of integers.
     * @param numberToRemove the number to remove from the list.
     * @return an ArrayList with the specified number removed.
     */
    public static ArrayList<Integer> removeNumber(ArrayList<Integer> list, int numberToRemove) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == numberToRemove) {
                iterator.remove(); // Using iterator's remove method to avoid ConcurrentModificationException
            }
        }
        return list;
    }
}