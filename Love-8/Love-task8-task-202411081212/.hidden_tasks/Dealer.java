public class Dealer extends Player {

    public Dealer() {
        super("Dealer");
    }

    public boolean shouldHit() {
        return calculateScore() < 17;
    }
}