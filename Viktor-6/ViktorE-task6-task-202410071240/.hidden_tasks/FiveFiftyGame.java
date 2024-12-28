import java.util.List;
import java.util.ArrayList;

public class FiveFiftyGame extends LotteryGame {
    public FiveFiftyGame() {
        super(1, 50, 5);
    }

    @Override
    public ArrayList<Integer> generateTicket() {
        // Uses the base class method
        return super.generateTicket();
    }
}