public class Dealer extends Player {
    
    public boolean shouldHit() {
        return calculateTotal() < 17;
    }
}