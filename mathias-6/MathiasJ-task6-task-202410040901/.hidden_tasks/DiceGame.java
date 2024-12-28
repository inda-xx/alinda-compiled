import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Roll two dice
        int die1 = random.nextInt(6) + 1; // Random number between 1 and 6
        int die2 = random.nextInt(6) + 1; // Random number between 1 and 6
        
        // Calculate sum of dice
        int sum = die1 + die2;
        
        // Determine win or lose using ternary operator
        String result = (sum == 7 || sum == 11) ? "Player wins!" : "Player loses!";
        
        // Display result
        System.out.println("Dice 1: " + die1 + ", Dice 2: " + die2);
        System.out.println("Sum: " + sum);
        System.out.println(result);
    }
}