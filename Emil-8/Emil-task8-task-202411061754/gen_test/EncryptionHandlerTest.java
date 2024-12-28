package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptionHandlerTest {
    
    @Test
    public void testEncryptAndDecrypt() {
        EncryptionHandler handler = EncryptionHandler.getInstance();
        String data = "Hello, World!";
        String encrypted = handler.encrypt(data);
        assertNotEquals(data, encrypted);
        String decrypted = handler.decrypt(encrypted);
        assertEquals(data, decrypted);
    }

    @Test
    public void testSingletonPattern() {
        EncryptionHandler instance1 = EncryptionHandler.getInstance();
        EncryptionHandler instance2 = EncryptionHandler.getInstance();
        
        assertSame(instance1, instance2);
    }
}