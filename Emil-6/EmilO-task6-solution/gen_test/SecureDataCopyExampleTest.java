package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SecureDataCopyExampleTest {

    @Test
    public void shallowCopyCreatesSameObjectReferences() {
        SecureDataCopyExample.Credentials[] original = {
            new SecureDataCopyExample.Credentials("user1", "pass1"),
            new SecureDataCopyExample.Credentials("user2", "pass2")
        };

        SecureDataCopyExample.Credentials[] copied = SecureDataCopyExample.shallowCopy(original);

        assertSame(original[0], copied[0]);
        assertSame(original[1], copied[1]);
    }

    @Test
    public void deepCopyCreatesDifferentObjectReferences() {
        SecureDataCopyExample.Credentials[] original = {
            new SecureDataCopyExample.Credentials("user1", "pass1"),
            new SecureDataCopyExample.Credentials("user2", "pass2")
        };

        SecureDataCopyExample.Credentials[] copied = SecureDataCopyExample.deepCopy(original);

        assertNotSame(original[0], copied[0]);
        assertNotSame(original[1], copied[1]);
    }

    @Test
    public void deepCopyCreatesIdenticalContents() {
        SecureDataCopyExample.Credentials[] original = {
            new SecureDataCopyExample.Credentials("user1", "pass1"),
            new SecureDataCopyExample.Credentials("user2", "pass2")
        };

        SecureDataCopyExample.Credentials[] copied = SecureDataCopyExample.deepCopy(original);

        assertEquals(original[0].username, copied[0].username);
        assertEquals(original[0].password, copied[0].password);
        assertEquals(original[1].username, copied[1].username);
        assertEquals(original[1].password, copied[1].password);
    }

    @Test(expected = NullPointerException.class)
    public void deepCopyThrowsExceptionForNullElement() {
        SecureDataCopyExample.Credentials[] original = new SecureDataCopyExample.Credentials[1];
        original[0] = null;

        SecureDataCopyExample.deepCopy(original);
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

