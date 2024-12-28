package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class ClockTest {

    private Clock clock;

    @Before
    public void setUp() {
        clock = new Clock();
    }

    @Test
    public void defaultConstructorSetsCorrectInitialTime() {
        assertEquals(12, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void parameterizedConstructorSetsCorrectTime() {
        clock = new Clock(8, 37, 5);
        assertEquals(8, clock.getHours());
        assertEquals(37, clock.getMinutes());
        assertEquals(5, clock.getSeconds());
    }

    @Test
    public void parameterizedConstructorWithInvalidHoursKeepsDefaults() {
        clock = new Clock(0, 45, 10);
        assertEquals(12, clock.getHours());
        assertEquals(45, clock.getMinutes());
        assertEquals(10, clock.getSeconds());
    }

    @Test
    public void parameterizedConstructorWithInvalidMinutesKeepsDefaults() {
        clock = new Clock(5, 60, 25);
        assertEquals(5, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(25, clock.getSeconds());
    }

    @Test
    public void parameterizedConstructorWithInvalidSecondsKeepsDefaults() {
        clock = new Clock(5, 45, 60);
        assertEquals(5, clock.getHours());
        assertEquals(45, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void setHoursWithinRangeUpdatesCorrectly() {
        clock.setHours(3);
        assertEquals(3, clock.getHours());
    }

    @Test
    public void setHoursBelowRangeKeepsCurrentValue() {
        clock.setHours(3);
        clock.setHours(0);
        assertEquals(3, clock.getHours());
    }

    @Test
    public void setHoursAboveRangeKeepsCurrentValue() {
        clock.setHours(3);
        clock.setHours(13);
        assertEquals(3, clock.getHours());
    }

    @Test
    public void setMinutesWithinRangeUpdatesCorrectly() {
        clock.setMinutes(45);
        assertEquals(45, clock.getMinutes());
    }

    @Test
    public void setMinutesBelowRangeKeepsCurrentValue() {
        clock.setMinutes(45);
        clock.setMinutes(-1);
        assertEquals(45, clock.getMinutes());
    }

    @Test
    public void setMinutesAboveRangeKeepsCurrentValue() {
        clock.setMinutes(45);
        clock.setMinutes(60);
        assertEquals(45, clock.getMinutes());
    }

    @Test
    public void setSecondsWithinRangeUpdatesCorrectly() {
        clock.setSeconds(30);
        assertEquals(30, clock.getSeconds());
    }

    @Test
    public void setSecondsBelowRangeKeepsCurrentValue() {
        clock.setSeconds(30);
        clock.setSeconds(-1);
        assertEquals(30, clock.getSeconds());
    }

    @Test
    public void setSecondsAboveRangeKeepsCurrentValue() {
        clock.setSeconds(30);
        clock.setSeconds(60);
        assertEquals(30, clock.getSeconds());
    }

    @Test
    public void toStringProvidesCorrectFormat() {
        assertEquals("12:00:00", clock.toString());
        clock = new Clock(8, 5, 3);
        assertEquals("08:05:03", clock.toString());
    }

    @Test
    public void tickIncrementsSeconds() {
        clock.tick();
        assertEquals(1, clock.getSeconds());
        assertEquals(0, clock.getMinutes());
        assertEquals(12, clock.getHours());
    }

    @Test
    public void tickWrapsAroundSeconds() {
        clock = new Clock(12, 59, 59);
        clock.tick();
        assertEquals(1, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void tickMultipleSeconds() {
        clock = new Clock(10, 59, 55);
        clock.tick(5);
        assertEquals(11, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(0, clock.getSeconds());
    }

    @Test
    public void tickMultipleSecondsCrossingNoon() {
        clock = new Clock(12, 59, 59);
        clock.tick(3);
        assertEquals(1, clock.getHours());
        assertEquals(0, clock.getMinutes());
        assertEquals(2, clock.getSeconds());
    }
}


// FetchingWeatherDataTest.java
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

