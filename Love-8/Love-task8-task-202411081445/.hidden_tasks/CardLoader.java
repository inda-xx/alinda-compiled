import java.util.List;
import java.util.ArrayList;

public class CardLoader {

    public List<Card> loadCardsFromFile(String filePath) {
        List<Card> deck = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" of ");
                if (parts.length == 2) {
                    Card card = new Card(parts[0], parts[1]);
                    deck.add(card);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Proper exception handling required
        }
        return deck;
    }
}