package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CredentialsTest {

    @Test
    public void constructorSetsValuesCorrectly() {
        Credentials credentials = new Credentials("dataId", "username", "password");
        assertEquals("username", credentials.getUsername());
        assertEquals("password", credentials.getPassword());
        assertEquals("dataId", credentials.getDataId());
    }

    @Test(expected = NullPointerException.class)
    public void constructorThrowsExceptionWithNullDataId() {
        new Credentials(null, "username", "password");
    }
}

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

