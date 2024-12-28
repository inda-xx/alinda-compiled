package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUserCreation() {
        User user = new User("Alice", "Alice'sPublicKey");
        assertEquals("Alice", user.getUsername());
        assertEquals("Alice'sPublicKey", user.getPublicKey());
    }

    @Test
    public void testUserToString() {
        User user = new User("Alice", "Alice'sPublicKey");
        String expected = "User{username='Alice', publicKey='Alice'sPublicKey'}";
        assertEquals(expected, user.toString());
    }
}

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;
import java.io.*;

