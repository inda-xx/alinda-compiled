package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserLoaderTest {

    private static final String VALID_USER_FILE = "valid_users.csv";
    
    @Before
    public void createUserFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(VALID_USER_FILE));
        writer.write("Alice,Alice'sPublicKey\nBob,Bob'sPublicKey");
        writer.close();
    }

    @Test
    public void testLoadUsersFromFile() {
        UserLoader userLoader = new UserLoader();
        List<User> users = userLoader.loadUsersFromFile(VALID_USER_FILE);

        assertEquals(2, users.size());
        assertEquals("Alice", users.get(0).getUsername());
        assertEquals("Bob", users.get(1).getUsername());
    }

    @Test
    public void testHandleInvalidFile() {
        UserLoader userLoader = new UserLoader();
        List<User> users = userLoader.loadUsersFromFile("non_existent_file.csv");
        assertTrue(users.isEmpty());
    }
}

import org.junit.Test;
import static org.junit.Assert.*;

