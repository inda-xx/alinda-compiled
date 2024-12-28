import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackGame {
    private Deck deck;
    private Player player;
    private Player dealer;

    public BlackjackGame() {
        List<Card> cards = loadCardsFromFile("cards.txt");
        this.deck = new Deck(cards);
        this.player = new Player();
        this.dealer = new Player();
    }

    private List<Card> loadCardsFromFile(String fileName) {
        List<Card> cards = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String name = parts[0];
                    String suit = parts[1];
                    int value = Integer.parseInt(parts[2]);
                    cards.add(new Card(name, suit, value));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading card data: " + e.getMessage());
        }
        return cards;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean playerTurn = true;

        // Initial dealing
        player.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());

        // Player's turn
        while (playerTurn && player.getScore() < 21) {
            System.out.println(player);
            System.out.println("Do you want to hit or stand? (hit/stand)");
            String choice = scanner.nextLine();
            if ("hit".equalsIgnoreCase(choice)) {
                player.addCard(deck.drawCard());
            } else {
                playerTurn = false;
            }
        }

        // Dealer's turn
        while (dealer.getScore() < 17) {
            dealer.addCard(deck.drawCard());
        }

        // Displaying final hands
        System.out.println("Final hands:");
        System.out.println("Player: " + player);
        System.out.println("Dealer: " + dealer);

        // Determine the winner
        if (player.getScore() > 21) {
            System.out.println("Player busts! Dealer wins.");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Player wins!");
        } else if (player.getScore() < dealer.getScore()) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("Push! It's a tie.");
        }
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.playGame();
    }
}