import java.util.ArrayList;
import java.util.Random; 
import java.util.Collections;


public class CasinoGame {

    

    public static ArrayList<String> generateFortunes(int n) {
        String[] fortunes = new String[10];
        fortunes[0] = "A beautiful, smart, and loving person will be coming into your life.";
        fortunes[1] = "A dubious friend may be an enemy in camouflage.";
        fortunes[2] = "A lifetime of happiness lies ahead of you.";
        fortunes[3] = "Believe it can be done.";
        fortunes[4] = "Disbelief destroys the magic.";
        fortunes[5] = "Don’t just think, act!";
        fortunes[6] = "Education is the ability to meet life’s situations.";
        fortunes[7] = "Have a beautiful day.";
        fortunes[8] = "Long life is in store for you.";
        fortunes[9] = "Now is a good time to buy stock.";

        ArrayList<String> generatedFortunes = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            generatedFortunes.add(fortunes[r.nextInt(10)]);
        }

        return generatedFortunes;
    }

    public static ArrayList<String> shuffleFortunes(ArrayList<String> fortunes) {
        ArrayList<String> shuffledList = new ArrayList<>();

        for (String fortune : fortunes) {
            shuffledList.add(fortune);
        }

        Collections.shuffle(shuffledList, new Random());
        
        return shuffledList;
    }

    public static void main (String[]arg) {
        ArrayList<String> fortunes = generateFortunes(5);
        ArrayList<String> shuffled = shuffleFortunes(fortunes);

        System.out.println("Normal:");
        for (String string : fortunes) {
            System.out.println(string);
        }
        
        System.out.println("Shuffled");
        for (String string : shuffled) {
            System.out.println(string);
        }
    }
}
