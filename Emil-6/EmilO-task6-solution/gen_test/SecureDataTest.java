package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SecureDataTest {

    @Test
    public void constructorSetsDataIdCorrectly() {
        SecureData secureData = new SecureData("dataId");
        assertEquals("dataId", secureData.getDataId());
    }

    @Test
    public void constructorSetsCreationTimeCorrectly() {
        long beforeCreation = System.currentTimeMillis();
        SecureData secureData = new SecureData("dataId");
        long afterCreation = System.currentTimeMillis();

        assertTrue(secureData.getCreatedAt() >= beforeCreation);
        assertTrue(secureData.getCreatedAt() <= afterCreation);
    }

    @Test(expected = NullPointerException.class)
    public void constructorThrowsExceptionWithNullDataId() {
        new SecureData(null);
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

