import java.util.List;
import java.util.ArrayList;

public class FileWordReader {
    private ArrayList<String> words;

    public FileWordReader(String filename) {
        words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\s+")) { // Split by whitespace
                    words.add(word);
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to read from file: " + e.getMessage());
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }
}