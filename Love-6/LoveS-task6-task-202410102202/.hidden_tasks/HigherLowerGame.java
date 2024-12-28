import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class HigherLowerGame {

    // Generates a sequence of n random numbers
    public static List<Integer> generateRandomSequence(int n) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            randomNumbers.add(random.nextInt(100)); // 100 to generate numbers from 0 to 99
        }
        return randomNumbers;
    }

    // Removes numbers greater than the given threshold
    public static List<Integer> removeNumbersAboveThreshold(List<Integer> numbers, int threshold) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > threshold) {
                iterator.remove();
            }
        }
        return numbers;
    }

    // Main method to play the Higher or Lower game
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = generateRandomSequence(10);
        int score = 0;

        System.out.println("Welcome to the Higher or Lower Game!");
        System.out.println("Initial number: " + sequence.get(0));

        for (int i = 1; i < sequence.size(); i++) {
            System.out.println("Will the next number be higher or lower? (H/L)");
            String guess = scanner.nextLine();
            boolean isHigher = sequence.get(i) > sequence.get(i - 1);
            boolean guessedCorrectly = (isHigher && "H".equalsIgnoreCase(guess)) ||
                    (!isHigher && "L".equalsIgnoreCase(guess));

            if (guessedCorrectly) {
                score++;
                System.out.println("Correct guess!");
            } else {
                System.out.println("Incorrect guess!");
            }
            System.out.println("Next number: " + sequence.get(i));
        }

        System.out.println("Game over! Your score: " + score);
        scanner.close();
    }
}