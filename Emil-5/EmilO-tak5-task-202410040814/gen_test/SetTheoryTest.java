package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetTheoryTest {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final List<Integer> UNIVERSE = IntStream.range(MIN, MAX).boxed().toList();

    @Test
    public void generateSetReturnsEmptySetWhenMinIsGreaterThanMax() {
        List<Integer> actual = SetTheory.generateSet(2, 1);
        assertEquals(Collections.emptyList(), actual);
    }

    @Test
    public void generateSetReturnsExpectedResultWhenMaxIsGreaterThan100() {
        List<Integer> expected = IntStream.range(50, MAX).boxed().toList();
        List<Integer> actual = SetTheory.generateSet(50, 150);
        assertEquals(expected, actual);
    }

    @Test
    public void unionReturnsExpectedResultWhenSetsOverlap() {
        List<Integer> a = IntStream.range(10, 55).boxed().toList();
        List<Integer> b = IntStream.range(50, 90).boxed().toList();

        Set<Integer> expected = new HashSet<>(a);
        expected.addAll(b);
        List<Integer> actual = SetTheory.union(new ArrayList<>(a), new ArrayList<>(b));

        assertEquals(expected.stream().toList(), actual);
    }

    @Test
    public void intersectionReturnsExpectedResultWhenSetsOverlap() {
        List<Integer> a = IntStream.range(10, 55).boxed().toList();
        List<Integer> b = IntStream.range(50, 90).boxed().toList();

        Set<Integer> expected = new HashSet<>(a);
        expected.retainAll(b);
        List<Integer> actual = SetTheory.intersection(new ArrayList<>(a), new ArrayList<>(b));

        assertEquals(expected.stream().toList(), actual);
    }

    @Test
    public void complementReturnsUniverseForEmptySet() {
        assertEquals(UNIVERSE, SetTheory.complement(new ArrayList<>()));
    }

    @Test
    public void complementReturnsEmptySetWhenInputIsUniverse() {
        assertEquals(Collections.emptyList(), SetTheory.complement(new ArrayList<>(UNIVERSE)));
    }

    @Test
    public void cardinalityReturnsCorrectValueForUniverse() {
        assertEquals(UNIVERSE.size(), SetTheory.cardinality(new ArrayList<>(UNIVERSE)));
    }

    @Test
    public void cardinalityReturnsCorrectValueForEmptySet() {
        assertEquals(0, SetTheory.cardinality(new ArrayList<>()));
    }
}