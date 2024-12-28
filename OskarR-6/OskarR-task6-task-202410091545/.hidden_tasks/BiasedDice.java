import java.util.Random;

public class BiasedDice extends Dice {

    /**
     * Overrides the constructor to give a 50% chance of rolling a six.
     */
    public BiasedDice() {
        super();
        if (new Random().nextBoolean()) {
            value = 6;
        }
    }
}