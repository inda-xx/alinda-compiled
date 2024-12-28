import java.util.Random;

public class BugFixing {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotteryNumbers = new int[6];

        for (int i = 0; i < 6; i++) { // Fixed: Loop should start from 0 and run till 6
            lotteryNumbers[i] = random.nextInt(49) + 1;
        }

        // Display numbers to verify:
        for (int number : lotteryNumbers) {
            System.out.println(number);
        }
    }
}