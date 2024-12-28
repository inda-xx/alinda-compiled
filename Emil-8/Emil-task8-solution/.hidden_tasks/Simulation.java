import java.util.List;

public class Simulation {
    private List<CelestialBody> bodies;
    private final double G = 6.67430e-11; // Gravitational constant

    public Simulation(List<CelestialBody> bodies) {
        this.bodies = bodies;
    }

    public void calculateGravitationalForces(double timeStep) {
        int n = bodies.size();
        for (int i = 0; i < n; i++) {
            double[] netForce = new double[3]; // {fx, fy, fz}
            CelestialBody bodyA = bodies.get(i);
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    CelestialBody bodyB = bodies.get(j);
                    double[] force = computeForce(bodyA, bodyB);
                    netForce[0] += force[0];
                    netForce[1] += force[1];
                    netForce[2] += force[2];
                }
            }
            updateVelocityAndPosition(bodyA, netForce, timeStep);
        }
    }

    private double[] computeForce(CelestialBody a, CelestialBody b) {
        double[] posA = a.getPosition();
        double[] posB = b.getPosition();
        double dx = posB[0] - posA[0];
        double dy = posB[1] - posA[1];
        double dz = posB[2] - posA[2];
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        double forceMagnitude = G * a.getMass() * b.getMass() / (distance * distance);
        return new double[]{forceMagnitude * dx / distance, forceMagnitude * dy / distance, forceMagnitude * dz / distance};
    }

    private void updateVelocityAndPosition(CelestialBody body, double[] netForce, double timeStep) {
        double[] velocity = body.getVelocity();
        double mass = body.getMass();
        // Update velocity: v = u + (F/m)*t
        velocity[0] += (netForce[0] / mass) * timeStep;
        velocity[1] += (netForce[1] / mass) * timeStep;
        velocity[2] += (netForce[2] / mass) * timeStep;
        body.setVelocity(velocity);

        double[] position = body.getPosition();
        // Update position: s = s + v*t
        position[0] += velocity[0] * timeStep;
        position[1] += velocity[1] * timeStep;
        position[2] += velocity[2] * timeStep;
        body.setPosition(position);
    }

    public void simulate(double totalTime, double timeStep) {
        int steps = (int) (totalTime / timeStep);
        for (int i = 0; i < steps; i++) {
            calculateGravitationalForces(timeStep);
            printSimulationState(i * timeStep);
        }
    }

    private void printSimulationState(double currentTime) {
        System.out.println("Time: " + currentTime);
        for (CelestialBody body : bodies) {
            double[] position = body.getPosition();
            System.out.printf("Position: (%.2f, %.2f, %.2f)%n", position[0], position[1], position[2]);
        }
        System.out.println();
    }
}