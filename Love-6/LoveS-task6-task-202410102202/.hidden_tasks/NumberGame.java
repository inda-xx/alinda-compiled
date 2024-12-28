import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NumberGame {

    protected Random random = new Random();

    // Generates a list of random integers
    protected List<Integer> generateRandomNumbers(int n, int bound) {
        List<Integer> randomNumbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            randomNumbers.add(random.nextInt(bound));
        }
        return randomNumbers;
    }

    // Prints a list of numbers
    protected void printNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}