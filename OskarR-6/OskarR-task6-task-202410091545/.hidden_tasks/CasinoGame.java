import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class CasinoGame {

    private static final String[] FORTUNES = {
        "Win Big", "Better luck next time", "Try again",
        "You hit the jackpot", "Unlucky", "You're on a winning streak"
    };

    /**
     * Generates a list of random fortunes.
     * @param n number of fortunes to generate
     * @return a list of randomly generated fortunes
     */
    public static ArrayList<String> generateFortunes(int n) {
        Random random = new Random();
        ArrayList<String> fortunes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(FORTUNES.length);
            fortunes.add(FORTUNES[index]);
        }
        return fortunes;
    }

    /**
     * Shuffles the list of fortunes, ensuring the original list is not modified.
     * @param fortunes the original list of fortunes
     * @return a shuffled deep copy of the list of fortunes
     */
    public static ArrayList<String> shuffleFortunes(ArrayList<String> fortunes) {
        ArrayList<String> copiedList = new ArrayList<>(fortunes);
        Collections.shuffle(copiedList);
        return copiedList;
    }
}