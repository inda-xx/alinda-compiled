import java.util.List;
import java.util.ArrayList;

public class MatrixModificationExample {

    /**
     * Doubles the even numbers in a matrix represented as a list of ArrayList<Integer>.
     *
     * @param matrix the matrix represented as a list of ArrayList of Integers
     */
    public void doubleEvens(List<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            ListIterator<Integer> iterator = row.listIterator();
            while (iterator.hasNext()) {
                int value = iterator.next();
                iterator.set(value % 2 == 0 ? value * 2 : value);
            }
        }
    }

    public static void main(String[] args) {
        List<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(java.util.Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(java.util.Arrays.asList(7, 8, 9)));

        MatrixModificationExample example = new MatrixModificationExample();
        example.doubleEvens(matrix);

        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}