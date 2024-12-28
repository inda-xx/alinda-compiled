package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BiasedDiceTest {

    @Test
    public void testBiasedDiceInitializationValue() {
        BiasedDice biasedDice = new BiasedDice();
        int value = biasedDice.getValue();
        assertTrue(value >= 1 && value <= 6);
    }

    @Test
    public void testBiasedDiceBias() {
        int sixCount = 0;
        int iterations = 10000;
        for (int i = 0; i < iterations; i++) {
            BiasedDice biasedDice = new BiasedDice();
            if (biasedDice.getValue() == 6) {
                sixCount++;
            }
        }
        double sixProbability = (double) sixCount / iterations;
        // Expected about 20% probability for rolling a 6
        assertTrue(sixProbability > 0.15 && sixProbability < 0.25);
    }
}
```

DiceGameTest.java:
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;

