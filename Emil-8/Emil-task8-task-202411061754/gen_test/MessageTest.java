package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MessageTest {

    private User sender;
    private User recipient;
    private Message message;

    @Before
    public void setUp() {
        sender = new User("Alice", "Alice'sPublicKey");
        recipient = new User("Bob", "Bob'sPublicKey");
        message = new Message(sender, recipient, "Hello, Bob!");
    }

    @Test
    public void testMessageIsInitiallyUnencrypted() {
        assertFalse(message.isEncrypted);
    }

    @Test
    public void testEncryptMessage() {
        message.encrypt();
        assertTrue(message.isEncrypted);
        assertNotEquals("Hello, Bob!", message.content);
    }

    @Test
    public void testDecryptMessage() {
        message.encrypt();
        message.decrypt();
        assertFalse(message.isEncrypted);
        assertEquals("Hello, Bob!", message.content);
    }

    @Test
    public void testEncryptsOnlyOnce() {
        message.encrypt();
        String firstEncryption = message.content;
        message.encrypt();
        assertEquals(firstEncryption, message.content);
    }

    @Test
    public void testDecryptsOnlyOnce() {
        message.encrypt();
        message.decrypt();
        String contentAfterDecryption = message.content;
        message.decrypt();
        assertEquals(contentAfterDecryption, message.content);
    }

    @Test
    public void testSendMessageEncodesMessage() {
        message.sendMessage();
        assertTrue(message.isEncrypted);
        assertNotEquals("Hello, Bob!", message.content);
    }

    @Test
    public void testToStringMethod() {
        String expected = "Message{sender=User{username='Alice', publicKey='Alice'sPublicKey'}, recipient=User{username='Bob', publicKey='Bob'sPublicKey'}, content='Hello, Bob!', isEncrypted=false}";
        assertEquals(expected, message.toString());
        
        message.sendMessage();
        assertTrue(message.toString().contains("isEncrypted=true"));
    }

    @Test
    public void testSendMessage() {
        message.sendMessage();
        // In a real-world app, we might check a file or service to ensure it was sent.
        // For now, just ensure it's encrypted when sent
        assertTrue(message.isEncrypted);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

