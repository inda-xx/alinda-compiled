import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class EnhancedHigherLowerGame extends NumberGame {

    // Starts the play loop for the Higher or Lower game
    private void playGame() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = generateRandomNumbers(10, 100);
        int score = 0;

        System.out.println("Welcome to the Enhanced Higher or Lower Game!");
        System.out.println("Initial number: " + sequence.get(0));

        for (int i = 1; i < sequence.size(); i++) {
            System.out.println("Will the next number be higher or lower? (H/L)");
            String guess = scanner.nextLine();
            boolean isHigher = sequence.get(i) > sequence.get(i - 1);
            boolean guessedCorrectly = (isHigher && "H".equalsIgnoreCase(guess)) ||
                    (!isHigher && "L".equalsIgnoreCase(guess));

            System.out.println(guessedCorrectly ? "Correct guess!" : "Incorrect guess!");
            
            // Providing hints using ternary operation
            int proximity = Math.abs(sequence.get(i) - sequence.get(i - 1));
            System.out.println(proximity < 10 ? "Hint: Very Close!" : "Hint: Not Close!");

            if (guessedCorrectly) score++;
            System.out.println("Next number: " + sequence.get(i));
        }

        System.out.println("Game over! Your final score: " + score);
        scanner.close();
    }

    // Main method to demonstrate the EnhancedHigherLowerGame
    public static void main(String[] args) {
        EnhancedHigherLowerGame game = new EnhancedHigherLowerGame();
        game.playGame();
    }
}