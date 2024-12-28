import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "bodies.csv"; // This file should exist with appropriate data
        List<CelestialBody> bodies = CelestialBody.loadCelestialBodiesFromFile(filename);
        if (bodies.isEmpty()) {
            System.out.println("No celestial bodies were loaded.");
            return;
        }

        Simulation simulation = new Simulation(bodies);
        double totalTime = 10000; // Total time in simulation units
        double timeStep = 1; // Time step in simulation units
        simulation.simulate(totalTime, timeStep);
    }
}