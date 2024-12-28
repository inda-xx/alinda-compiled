import java.util.List;
import java.util.ArrayList;

public class CollectionUtilTest {
    
    public static void main(String[] args) {
        testFilterBelowThreshold();
    }

    private static void testFilterBelowThreshold() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 10, 3));
        System.out.println("Original List: " + list);

        CollectionUtil.filterBelowThreshold(list, 5);
        System.out.println("Filtered List (>= 5): " + list);
    }
}