package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShuffleUtilTest {

    @Test
    public void testShuffleList() {
        ArrayList<Integer> originalList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> shuffledList = ShuffleUtil.shuffleList(originalList);

        assertEquals(originalList.size(), shuffledList.size());
        assertTrue(shuffledList.containsAll(originalList));
        assertNotEquals(originalList, shuffledList);  // The order should differ
    }

    @Test
    public void testShuffleListWithEmpty() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> shuffledList = ShuffleUtil.shuffleList(emptyList);
        assertEquals(emptyList, shuffledList);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

