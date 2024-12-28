package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApiTokenTest {

    @Test
    public void constructorSetsValuesCorrectly() {
        ApiToken apiToken = new ApiToken("dataId", "tokenValue");

        assertEquals("dataId", apiToken.getDataId());
        assertEquals("tokenValue", apiToken.getTokenValue());
    }

    @Test(expected = NullPointerException.class)
    public void constructorThrowsExceptionWithNullDataId() {
        new ApiToken(null, "tokenValue");
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

