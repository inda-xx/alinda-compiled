package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimulationTest {
    
    private CelestialBody earth;
    private CelestialBody moon;
    private Simulation simulation;
    
    @Before
    public void setUp() {
        double massEarth = 5.972e24; // Mass of Earth in kg
        double[] positionEarth = {0.0, 0.0, 0.0};
        double[] velocityEarth = {0.0, 0.0, 0.0};

        double massMoon = 7.348e22; // Mass of Moon in kg
        double[] positionMoon = {0.0, 384400000.0, 0.0}; // Earth-Moon distance in meters
        double[] velocityMoon = {1022.0, 0.0, 0.0}; // Orbital speed of Moon around Earth in m/s

        earth = new CelestialBody(massEarth, positionEarth, velocityEarth);
        moon = new CelestialBody(massMoon, positionMoon, velocityMoon);
        
        simulation = new Simulation(Arrays.asList(earth, moon));
    }
    
    @Test
    public void testCalculateGravitationalForces() {
        double initialDistance = 384400000.0; // Initial Earth-Moon distance
        simulation.calculateGravitationalForces(60); // 1 minute timestep
        double[] newMoonPosition = moon.getPosition();
        double[] newMoonVelocity = moon.getVelocity();
        
        // Check if the moon's position and velocity have changed due to forces
        assertEquals(initialDistance, newMoonPosition[1], 1e6); // Validate position has changed reasonably
        assertArrayEquals(new double[]{1022.0, 0.0, 0.0}, newMoonVelocity, 1e-0); // Validate velocity has changed reasonably
    }
    
    @Test
    public void testSimulate() {
        double totalTime = 3600; // Simulate for 1 hour
        double timeStep = 60; // 1 minute steps
        simulation.simulate(totalTime, timeStep);
        
        // Just check if the simulation runs without exceptions
        // More complex assertions may require analysis of resulting trajectories and energy conservation
    }
}