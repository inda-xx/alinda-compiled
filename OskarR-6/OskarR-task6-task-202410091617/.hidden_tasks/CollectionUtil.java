import java.util.List;
import java.util.ArrayList;

public class CollectionUtil {

    /**
     * Filters the list to remove all values below the specific threshold.
     * Uses an Iterator to avoid ConcurrentModificationException during removal.
     * 
     * @param list The list from which to remove elements.
     * @param threshold Elements less than this value will be removed.
     */
    public static void filterBelowThreshold(ArrayList<Integer> list, int threshold) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < threshold) {
                iterator.remove();
            }
        }
    }
}