package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiceGameTest {

    @Test
    public void testRollDiceSequenceLength() {
        int n = 5;
        ArrayList<Dice> diceSequence = DiceGame.rollDiceSequence(n);
        assertEquals(n, diceSequence.size());
    }

    @Test
    public void testMaxConsecutiveDiceRollsNormalCase() {
        ArrayList<Dice> diceSequence = new ArrayList<>();
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 3;
            }
        });
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 4;
            }
        });
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 5;
            }
        });
        int maxSum = DiceGame.maxConsecutiveDiceRolls(diceSequence);
        assertEquals(9, maxSum); // 4 + 5 = 9
    }

    @Test
    public void testMaxConsecutiveDiceRollsEdgeCaseEmpty() {
        ArrayList<Dice> emptySequence = new ArrayList<>();
        int maxSum = DiceGame.maxConsecutiveDiceRolls(emptySequence);
        assertEquals(0, maxSum);
    }

    @Test
    public void testRemoveDiceNormalCase() {
        ArrayList<Dice> diceSequence = new ArrayList<>();
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 2;
            }
        });
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 3;
            }
        });
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 2;
            }
        });
        ArrayList<Dice> filteredSequence = DiceGame.removeDice(diceSequence, 2);
        assertEquals(1, filteredSequence.size());
        assertEquals(3, filteredSequence.get(0).getValue());
    }

    @Test
    public void testRemoveDiceEdgeCaseAllRemove() {
        ArrayList<Dice> diceSequence = new ArrayList<>();
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 2;
            }
        });
        diceSequence.add(new Dice() {
            @Override
            public int getValue() {
                return 2;
            }
        });
        ArrayList<Dice> filteredSequence = DiceGame.removeDice(diceSequence, 2);
        assertEquals(0, filteredSequence.size());
    }

    @Test
    public void testRemoveDiceEdgeCaseEmpty() {
        ArrayList<Dice> emptySequence = new ArrayList<>();
        ArrayList<Dice> filteredSequence = DiceGame.removeDice(emptySequence, 2);
        assertEquals(0, filteredSequence.size());
    }
}
```

These tests use JUnit to validate the functionality of each of the methods in the provided classes, covering both typical usage and edge cases.