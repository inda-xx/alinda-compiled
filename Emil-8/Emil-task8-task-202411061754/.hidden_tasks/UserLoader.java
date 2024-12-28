import java.util.List;
import java.util.ArrayList;

public class UserLoader {
    public List<User> loadUsersFromFile(String filePath) {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    users.add(new User(data[0], data[1]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from users file: " + e.getMessage());
        }
        return users;
    }
}