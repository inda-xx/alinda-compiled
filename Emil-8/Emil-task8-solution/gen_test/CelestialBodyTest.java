package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CelestialBodyTest {
    
    private CelestialBody body;
    
    @Before
    public void setUp() {
        double mass = 5.972e24; // Mass of Earth in kg
        double[] position = {0.0, 0.0, 0.0};
        double[] velocity = {0.0, 0.0, 0.0};
        body = new CelestialBody(mass, position, velocity);
    }
    
    @Test
    public void testGetMass() {
        assertEquals(5.972e24, body.getMass(), 1e14);
    }

    @Test
    public void testGetAndSetPosition() {
        double[] newPosition = {1.0, 2.0, 3.0};
        body.setPosition(newPosition);
        assertArrayEquals(newPosition, body.getPosition(), 1e-10);
    }
    
    @Test
    public void testGetAndSetVelocity() {
        double[] newVelocity = {1.0, 2.0, 3.0};
        body.setVelocity(newVelocity);
        assertArrayEquals(newVelocity, body.getVelocity(), 1e-10);
    }
    
    @Test
    public void testLoadCelestialBodiesFromFile_Valid() {
        // Assuming a correct file "bodies.csv" exists in the working directory
        // The test assumes a specific data layout and should be adjusted according to the actual file.
        String filename = "valid_test_bodies.csv";
        List<CelestialBody> bodies = CelestialBody.loadCelestialBodiesFromFile(filename);
        assertEquals(2, bodies.size());
        
        CelestialBody earth = bodies.get(0);
        assertEquals(5.972e24, earth.getMass(), 1e14);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, earth.getPosition(), 1e-10);
        assertArrayEquals(new double[]{0.0, 0.0, 0.0}, earth.getVelocity(), 1e-10);
        
        CelestialBody moon = bodies.get(1);
        assertEquals(7.348e22, moon.getMass(), 1e19);
        assertArrayEquals(new double[]{0.0, 384400000.0, 0.0}, moon.getPosition(), 1e-10);
        assertArrayEquals(new double[]{1022.0, 0.0, 0.0}, moon.getVelocity(), 1e-10);
    }
    
    @Test
    public void testLoadCelestialBodiesFromFile_InvalidData() {
        String filename = "invalid_test_bodies.csv";
        List<CelestialBody> bodies = CelestialBody.loadCelestialBodiesFromFile(filename);
        assertTrue(bodies.isEmpty());
    }

    @Test
    public void testLoadCelestialBodiesFromFile_FileNotFound() {
        String filename = "nonexistent.csv";
        List<CelestialBody> bodies = CelestialBody.loadCelestialBodiesFromFile(filename);
        assertTrue(bodies.isEmpty());
    }
}

// SimulationTest.java
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Arrays;

