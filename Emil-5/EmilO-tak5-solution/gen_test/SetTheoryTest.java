package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetTheoryTest {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final List<Integer> UNIVERSE = IntStream.range(MIN, MAX).boxed().toList();

    @Test
    public void generateSetEmptyResultWhenInvalidRange() {
        assertEquals(Collections.emptyList(), SetTheory.generateSet(2, 1));
        assertEquals(Collections.emptyList(), SetTheory.generateSet(1, 1));
    }

    @Test
    public void generateSetHandlesEdgeCases() {
        List<Integer> expected = IntStream.range(50, MAX).boxed().toList();
        assertEquals(expected, SetTheory.generateSet(50, 101));

        expected = IntStream.range(MIN, 50).boxed().toList();
        assertEquals(expected, SetTheory.generateSet(-1, 50));
    }

    @Test
    public void unionHandlesBothOverlappingAndDisjointSets() {
        List<Integer> a = IntStream.range(10, 55).boxed().toList();
        List<Integer> b = IntStream.range(50, 90).boxed().toList();

        Set<Integer> expected = new HashSet<>(a);
        expected.addAll(b);
        assertEquals(expected.stream().toList(), SetTheory.union(new ArrayList<>(a), new ArrayList<>(b)));

        a = IntStream.range(10, 50).boxed().toList();
        b = IntStream.range(55, 90).boxed().toList();

        expected = new HashSet<>(a);
        expected.addAll(b);
        assertEquals(expected.stream().toList(), SetTheory.union(new ArrayList<>(a), new ArrayList<>(b)));
    }

    @Test
    public void intersectionReturnsCorrectResults() {
        List<Integer> a = IntStream.range(10, 55).boxed().toList();
        List<Integer> b = IntStream.range(50, 90).boxed().toList();

        Set<Integer> expected = new HashSet<>(a);
        expected.retainAll(b);
        assertEquals(expected.stream().toList(), SetTheory.intersection(new ArrayList<>(a), new ArrayList<>(b)));

        a = IntStream.range(10, 50).boxed().toList();
        b = IntStream.range(55, 90).boxed().toList();
        assertEquals(Collections.emptyList(), SetTheory.intersection(new ArrayList<>(a), new ArrayList<>(b)));
    }

    @Test
    public void complementEvaluatesCorrectly() {
        assertEquals(Collections.emptyList(), SetTheory.complement(new ArrayList<>(UNIVERSE)));

        List<Integer> set = IntStream.range(45, 67).boxed().toList();
        var expected = new HashSet<>(UNIVERSE);
        expected.removeAll(set);
        assertEquals(expected.stream().toList(), SetTheory.complement(new ArrayList<>(set)));
    }

    @Test
    public void cardinalityOfSetsCheck() {
        assertEquals(UNIVERSE.size(), SetTheory.cardinality(new ArrayList<>(UNIVERSE)));
        assertEquals(0, SetTheory.cardinality(new ArrayList<>()));

        int actual = SetTheory.cardinalityOfUnion(new ArrayList<>(UNIVERSE), new ArrayList<>(UNIVERSE));
        assertEquals(UNIVERSE.size(), actual);

        List<Integer> a = IntStream.range(MIN, 21).boxed().toList();
        List<Integer> b = IntStream.range(50, 67).boxed().toList();
        actual = SetTheory.cardinalityOfUnion(new ArrayList<>(a), new ArrayList<>(b));
        assertEquals(a.size() + b.size(), actual);

        assertEquals(0, SetTheory.cardinalityOfUnion(new ArrayList<>(), new ArrayList<>()));
    }
}