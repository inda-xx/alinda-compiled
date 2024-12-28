import java.util.Random;

public class RandomTheory {

    /**
     * Task 1.1: Explain the Random class.
     * 
     * The Random class in Java provides methods to generate pseudo-random numbers.
     * It uses a seed value to initialize the random number generator; if no seed is
     * provided, it uses the current system time. This ensures that the sequence of
     * random numbers is different across different runs.
     */
    public void explainRandom() {
        System.out.println("The Random class provides a way to generate random numbers in a predictable way.");
        System.out.println("Can be used for spawning objects at random locations, enemy attacks, etc.");
    }

    /**
     * Task 1.2: Example of Ternary Operator
     * 
     * The ternary operator is a shorthand for if-else. It's useful for simple
     * conditions. Example:
     */
    public String getPlayerOutcome(int score, int threshold) {
        // If score is > threshold, "Win", otherwise "Lose"
        return score > threshold ? "Win" : "Lose";
    }

    public void explainTernaryOperator() {
        System.out.println("Ternary operator offers concise syntax for if-else conditions.");
        System.out.println("Particularly useful for simple decision-making in code.");
    }

    public static void main(String[] args) {
        RandomTheory theory = new RandomTheory();
        theory.explainRandom();
        System.out.println("Player outcome: " + theory.getPlayerOutcome(85, 70));
        theory.explainTernaryOperator();
    }
}