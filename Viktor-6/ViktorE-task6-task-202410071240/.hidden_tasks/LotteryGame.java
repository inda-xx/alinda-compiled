import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class LotteryGame {
    protected int lowerBound;
    protected int upperBound;
    protected int numbersCount;

    public LotteryGame(int lowerBound, int upperBound, int numbersCount) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.numbersCount = numbersCount;
    }

    public ArrayList<Integer> generateTicket() {
        Random random = new Random();
        ArrayList<Integer> ticket = new ArrayList<>();
        
        while (ticket.size() < numbersCount) {
            int number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            if (!ticket.contains(number)) {
                ticket.add(number);
            }
        }
        
        return ticket;
    }
}