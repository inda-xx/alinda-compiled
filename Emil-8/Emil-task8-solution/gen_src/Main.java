import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "src/bodies.csv";
        List<CelestialBody> bodies = CelestialBody.loadCelestialBodiesFromFile(filename);
        if (bodies.isEmpty()) {
            System.out.println("No celestial bodies were loaded.");
            return;
        }
        Simulation simulation = new Simulation(bodies);
        double totalTime = 100;
        double timeStep = 1;
        simulation.simulate(totalTime, timeStep);
    }
}