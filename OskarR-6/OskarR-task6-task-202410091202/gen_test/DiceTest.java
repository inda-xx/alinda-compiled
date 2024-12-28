package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testDiceInitializationValue() {
        Dice dice = new Dice();
        int value = dice.getValue();
        assertTrue(value >= 1 && value <= 6);
    }
}
```

BiasedDiceTest.java:
```java
import org.junit.Test;
import static org.junit.Assert.assertTrue;

