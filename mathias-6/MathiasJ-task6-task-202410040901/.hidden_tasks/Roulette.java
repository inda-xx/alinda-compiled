public class Roulette extends Game {
    @Override
    public void start() {
        super.start();
        System.out.println("Spinning the Roulette wheel...");
    }

    @Override
    public void end() {
        super.end();
        System.out.println("Displaying Roulette results...");
    }
}