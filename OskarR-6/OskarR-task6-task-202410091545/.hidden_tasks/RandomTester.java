import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class RandomTester {

    /**
     * Remove all dice with a specific value from a sequence using an iterator.
     * @param diceList the list of dice to process.
     * @param value the value to remove.
     * @return an ArrayList of dice not containing the specified value.
     */
    public static ArrayList<Dice> removeDiceWithSpecificValue(ArrayList<Dice> diceList, int value) {
        Iterator<Dice> iterator = diceList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == value) {
                iterator.remove(); // Safe modification using iterator
            }
        }
        return diceList;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(10); // Generates numbers between 0 and 9
        boolean isEven = randomValue % 2 == 0; // The ternary operator usage was redundant
        System.out.println("Random value " + randomValue + " is even: " + isEven);
    }
}