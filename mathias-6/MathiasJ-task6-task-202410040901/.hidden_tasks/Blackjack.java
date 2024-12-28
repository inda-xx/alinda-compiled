public class Blackjack extends Game {
    @Override
    public void start() {
        super.start();
        System.out.println("Dealing cards for Blackjack...");
    }

    @Override
    public void end() {
        super.end();
        System.out.println("Calculating results for Blackjack...");
    }
}