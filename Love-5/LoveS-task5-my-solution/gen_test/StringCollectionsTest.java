package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCollectionsTest {

    @Test
    public void storeUsingArrayReturnsSameArray() {
        String[] input = {"apple", "banana", "cherry"};
        String[] result = StringCollections.storeUsingArray(input);
        assertArrayEquals(input, result);
    }

    @Test
    public void storeUsingArrayHandlesEmptyArray() {
        String[] input = {};
        String[] result = StringCollections.storeUsingArray(input);
        assertArrayEquals(input, result);
    }

    @Test(expected = NullPointerException.class)
    public void storeUsingArrayThrowsOnNullArray() {
        StringCollections.storeUsingArray(null);
    }

    @Test
    public void storeUsingArrayListReturnsCorrectArrayList() {
        String[] input = {"apple", "banana", "cherry"};
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(input));
        ArrayList<String> result = StringCollections.storeUsingArrayList(input);
        assertEquals(expected, result);
    }

    @Test
    public void storeUsingArrayListHandlesEmptyArray() {
        String[] input = {};
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> result = StringCollections.storeUsingArrayList(input);
        assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void storeUsingArrayListThrowsOnNullArray() {
        StringCollections.storeUsingArrayList(null);
    }

    @Test
    public void areSizesEqualReturnsTrueForEqualSizes() {
        String[] array = {"apple", "banana", "cherry"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        assertTrue(StringCollections.areSizesEqual(array, arrayList));
    }

    @Test
    public void areSizesEqualReturnsFalseForDifferentSizes() {
        String[] array = {"apple", "banana"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        assertFalse(StringCollections.areSizesEqual(array, arrayList));
    }

    @Test(expected = NullPointerException.class)
    public void areSizesEqualThrowsOnNullArray() {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana"));
        StringCollections.areSizesEqual(null, arrayList);
    }

    @Test(expected = NullPointerException.class)
    public void areSizesEqualThrowsOnNullArrayList() {
        String[] array = {"apple", "banana"};
        StringCollections.areSizesEqual(array, null);
    }
}