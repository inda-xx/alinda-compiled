import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;

    public Game() {
        deck = Deck.getInstance();
        player = new Player();
        dealer = new Dealer();
    }

    public void play() {

        System.out.println("Welcome to Blackjack!");
        dealInitialCards();
        System.out.println("Dealer's first card: " + dealer.getHand().get(0));
        playerTurn();
        dealerTurn();
        determineOutcome();
        
    }

    private void dealInitialCards() {
        player.receiveCard(deck.dealCard());
        player.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
        dealer.receiveCard(deck.dealCard());
    }

    private void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.println("Your hand: " + player.getHand() + " (Total: " + player.calculateTotal() + ")");
            System.out.print("Do you want to hit or stand? ");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("hit")) {
                player.receiveCard(deck.dealCard());
                if (player.calculateTotal() > 21) {
                    System.out.println("Bust! Your total is over 21.");
                    break;
                }
            } else if (input.equalsIgnoreCase("stand")) {
                break;
            } else {
                System.out.println("Invalid input! Please enter 'hit' or 'stand'.");
            }
        } scanner.close();
    }

    private void dealerTurn() {
        System.out.println("Dealer's hand: " + dealer.getHand() + " (Total: " + dealer.calculateTotal() + ")");
        while (dealer.shouldHit()) {
            dealer.receiveCard(deck.dealCard());
            System.out.println("Dealer hits.");
            System.out.println("Dealer's hand: " + dealer.getHand() + " (Total: " + dealer.calculateTotal() + ")");
        }
        
        if (dealer.calculateTotal() > 21) {
            System.out.println("Dealer busts!");
        }
    }

    private void determineOutcome() {
        int playerTotal = player.calculateTotal();
        int dealerTotal = dealer.calculateTotal();
        
        if (playerTotal > 21) {
            System.out.println("You lose!");
        } else if (dealerTotal > 21 || playerTotal > dealerTotal) {
            System.out.println("You win!");
        } else if (playerTotal == dealerTotal) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("You lose!");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}