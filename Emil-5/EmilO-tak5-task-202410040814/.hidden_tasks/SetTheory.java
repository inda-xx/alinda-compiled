import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class SetTheory {

    private static final int MAX = 100;

    /**
     * Generate a set of integers in the range [min, max).
     * If the range exceeds the universe [0, 99], it is adjusted accordingly.
     * 
     * @param min Lower bound, inclusive
     * @param max Upper bound, non-inclusive
     * @return An ArrayList of integers in the specified range
     */
    public static ArrayList<Integer> generateSet(int min, int max) {
        ArrayList<Integer> set = new ArrayList<>();
        if (min >= max) return set;
        for (int i = Math.max(min, 0); i < Math.min(max, MAX); i++) {
            set.add(i);
        }
        return set;
    }

    /**
     * Return the union of two sets represented as ArrayLists.
     * 
     * @param a First set
     * @param b Second set
     * @return An ArrayList containing unique elements from both sets
     */
    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> union = new ArrayList<>(a);
        for (Integer i : b) {
            if (!union.contains(i)) {
                union.add(i);
            }
        }
        return union;
    }

    /**
     * Return the intersection of two sets represented as ArrayLists.
     * 
     * @param a First set
     * @param b Second set
     * @return An ArrayList containing elements present in both sets
     */
    public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }

    /**
     * Return the complement of the given set with respect to the universe [0, 99].
     * 
     * @param a The set to complement
     * @return An ArrayList representing the complement set
     */
    public static ArrayList<Integer> complement(ArrayList<Integer> a) {
        ArrayList<Integer> complement = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            if (!a.contains(i)) {
                complement.add(i);
            }
        }
        return complement;
    }

    /**
     * Return the cardinality (size) of the given set.
     * 
     * @param a The set whose cardinality is to be determined
     * @return The size of the set
     */
    public static int cardinality(ArrayList<Integer> a) {
        return a.size();
    }

    /**
     * Return the cardinality of the union of two sets.
     * 
     * @param a First set
     * @param b Second set
     * @return The size of the union of the two sets
     */
    public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        return cardinality(union(a, b));
    }
}