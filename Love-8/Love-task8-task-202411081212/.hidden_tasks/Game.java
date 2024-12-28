import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;
    private Scanner scanner;

    public Game() {
        deck = new Deck();
        player = new Player("Player");
        dealer = new Dealer();
        scanner = new Scanner(System.in);
    }

    public void play() {
        deck.loadDeckFromFile("cards.txt");
        System.out.println("Starting the Blackjack game!");

        dealInitialCards();
        playerTurn();
        dealerTurn();
        determineWinner();
    }

    private void dealInitialCards() {
        System.out.println("Dealing initial cards...");
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.getCards().remove(0));
            dealer.addCard(deck.getCards().remove(0));
        }
        displayHands(false);
    }

    private void playerTurn() {
        while (true) {
            displayHands(false);
            System.out.println("Your score: " + player.calculateScore());
            System.out.print("Do you want to hit or stand? (hit/stand): ");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("hit")) {
                player.addCard(deck.getCards().remove(0));
                if (player.calculateScore() > 21) {
                    System.out.println("Bust! Your score is over 21.");
                    break;
                }
            } else {
                break;
            }
        }
    }

    private void dealerTurn() {
        while (dealer.shouldHit()) {
            dealer.addCard(deck.getCards().remove(0));
        }
    }

    private void determineWinner() {
        displayHands(true);
        System.out.println("Your score: " + player.calculateScore());
        System.out.println("Dealer's score: " + dealer.calculateScore());

        if (player.calculateScore() > 21) {
            System.out.println("You busted! Dealer wins.");
        } else if (dealer.calculateScore() > 21) {
            System.out.println("Dealer busted! You win.");
        } else if (player.calculateScore() > dealer.calculateScore()) {
            System.out.println("You win!");
        } else if (dealer.calculateScore() > player.calculateScore()) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private void displayHands(boolean showDealerSecondCard) {
        System.out.println("\nYour hand:");
        for (Card card : player.getHand()) {
            System.out.println(card);
        }
        System.out.println("\nDealer's hand:");
        System.out.println(dealer.getHand().get(0));
        if (showDealerSecondCard) {
            for (int i = 1; i < dealer.getHand().size(); i++) {
                System.out.println(dealer.getHand().get(i));
            }
        } else {
            System.out.println("Hidden");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}