import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    // Method to load the deck from a file
    public void loadDeckFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String value = parts[0];
                    String suit = parts[1];
                    cards.add(new Card(value, suit));
                } else {
                    System.err.println("Invalid card entry: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the deck file: " + e.getMessage());
        }
    }

    // Method to get all cards
    public List<Card> getCards() {
        return cards;
    }
}