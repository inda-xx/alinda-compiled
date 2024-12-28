package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BiasedDiceTest {

    @Test
    public void testBiasDiceHasHigherProbabilityOfSix() {
        int numberOfSixes = 0;
        int trials = 1000;
        for (int i = 0; i < trials; i++) {
            BiasedDice biasedDice = new BiasedDice();
            if (biasedDice.getValue() == 6) {
                numberOfSixes++;
            }
        }
        assertTrue("Number of sixes: " + numberOfSixes, numberOfSixes > trials / 6);
    }
}