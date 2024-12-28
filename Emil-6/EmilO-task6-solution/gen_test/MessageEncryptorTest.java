package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MessageEncryptorTest {

    @Test
    public void encryptMessageShiftsCharactersCorrectly() {
        String input = "abcXYZ";
        int key = 3;
        String expectedOutput = "def[\\]^";

        assertEquals(expectedOutput, MessageEncryptor.encryptMessage(input, key));
    }

    @Test
    public void encryptMessageHandlesEmptyString() {
        String input = "";
        int key = 5;

        assertEquals("", MessageEncryptor.encryptMessage(input, key));
    }

    @Test
    public void encryptMessageHandlesNegativeKey() {
        String input = "defABC";
        int key = -3;
        String expectedOutput = "abc>?@";

        assertEquals(expectedOutput, MessageEncryptor.encryptMessage(input, key));
    }

    @Test(expected = NullPointerException.class)
    public void encryptMessageThrowsExceptionOnNullMessage() {
        MessageEncryptor.encryptMessage(null, 3);
    }
}