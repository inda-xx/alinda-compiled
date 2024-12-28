import java.util.List;
import java.util.ArrayList;

public class SixFortyNineGame extends LotteryGame {
    public SixFortyNineGame() {
        super(1, 49, 6);
    }

    @Override
    public ArrayList<Integer> generateTicket() {
        // Uses the base class method
        return super.generateTicket();
    }
}