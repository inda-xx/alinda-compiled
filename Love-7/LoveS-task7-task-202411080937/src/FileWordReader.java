import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileReader;


public class FileWordReader {
    private ArrayList<String> words = new ArrayList<>();

public FileWordReader(String fileName) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] wordsArray = line.split("\\s+");
            words.addAll(Arrays.asList(wordsArray));
        }
    } catch (IOException e) {
        System.out.println("FEL UPPSTOD!" + e.getMessage());
    }
}

public ArrayList<String> getWords() {
    return words;
}

}