import java.util.List;
import java.util.ArrayList;

public class DiceGame {

    /**
     * Rolls a sequence of dice with n rolls.
     * @param n number of dice rolls
     * @return a list of dice representing the sequence
     */
    public static ArrayList<Dice> rollDiceSequence(int n) {
        ArrayList<Dice> diceSequence = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            diceSequence.add(new Dice());
        }
        return diceSequence;
    }

    /**
     * Computes the sum of the two highest consecutive dice values.
     * @param sequence list of dice
     * @return the maximum sum of two consecutive dice values
     */
    public static int maxConsecutiveDiceRolls(ArrayList<Dice> sequence) {
        if (sequence.size() < 2) {
            return 0;
        }
        int maxSum = 0;
        for (int i = 0; i < sequence.size() - 1; i++) {
            int currentSum = sequence.get(i).getValue() + sequence.get(i + 1).getValue();
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    /**
     * Removes all dice having a specific value from the sequence.
     * @param sequence list of dice
     * @param value the value to be removed
     * @return the list of dice after removing specific values
     */
    public static ArrayList<Dice> removeDice(ArrayList<Dice> sequence, int value) {
        Iterator<Dice> iterator = sequence.iterator();
        // Using an iterator to safely remove items from the list while iterating
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == value) {
                iterator.remove();
            }
        }
        return sequence;
    }
}