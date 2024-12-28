public class DeckTest {

    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Initial shuffle:");
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            System.out.println("Drawn card: " + deck.drawCard());
        }
    }
}