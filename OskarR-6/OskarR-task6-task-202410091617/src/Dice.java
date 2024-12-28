import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private int[] diceSides = new int[6];
    private Random random;

    public Dice() {
        for (int i = 0; i < 6; i++){
            this.diceSides[i] = random.nextInt(100);
        }

    }

    public static ArrayList<Dice> rollDiceSequence(int n) {
        ArrayList<Integer> diceSequence = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            diceSequence.add(diceSides[random.nextInt(6)]);
        }

        return diceSequence;
    }
}
