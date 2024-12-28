import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    public ArrayList<Integer> generateTicket() {
        Random random = new Random();
        ArrayList<Integer> ticket = new ArrayList<>();
        
        while (ticket.size() < 6) {
            int number = random.nextInt(49) + 1;
            if (!ticket.contains(number)) {
                ticket.add(number);
            }
        }
        
        return ticket;
    }
}