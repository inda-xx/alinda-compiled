import java.util.List;
import java.util.ArrayList;

public class ModifyCollection {
    public void removeDuplicates(ArrayList<Integer> ticket) {
        if (ticket == null || ticket.size() <= 1) return;

        Iterator<Integer> iterator = ticket.iterator();
        ArrayList<Integer> seenNumbers = new ArrayList<>();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (!seenNumbers.contains(number)) {
                seenNumbers.add(number);
            } else {
                iterator.remove();
            }
        }
    }
}