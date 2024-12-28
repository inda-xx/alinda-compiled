import java.util.List;
import java.util.ArrayList;

public class CollectionUtils {

    /**
     * Calculates the integer average of an array of integers.
     *
     * @param numbers an array of integers
     * @return the average of array elements as an integer
     */
    public static int calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**
     * Calculates the average of an array of doubles with precision.
     *
     * @param numbers an array of doubles
     * @return the average of array elements as a double
     */
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**
     * Filters odd numbers from an array of integers and returns them in an ArrayList.
     *
     * @param array an array of integers
     * @return an ArrayList of odd numbers
     */
    public static ArrayList<Integer> filterOddNumbers(int[] array) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int number : array) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    /**
     * Reverses an ArrayList of integers.
     *
     * @param list an ArrayList of integers
     * @return a reversed ArrayList
     */
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}