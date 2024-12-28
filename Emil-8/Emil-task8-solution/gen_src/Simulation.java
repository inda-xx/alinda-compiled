import java.util.List;

public class Simulation {
    private List<CelestialBody> bodies;
    private final double G = 6.67430e-11;

    public Simulation(List<CelestialBody> bodies) {
        this.bodies = bodies;
    }

    public void calculateGravitationalForces(double timeStep) {
        for (CelestialBody body : bodies) {
            double[] netForce = {0, 0, 0};
            for (CelestialBody otherBody : bodies) {
                if (body != otherBody) {
                    double[] force = computeForce(body, otherBody);
                    netForce[0] += force[0];
                    netForce[1] += force[1];
                    netForce[2] += force[2];
                }
            }
            updateVelocityAndPosition(body, netForce, timeStep);
        }
    }

    private double[] computeForce(CelestialBody a, CelestialBody b) {
        double[] posA = a.getPosition();
        double[] posB = b.getPosition();
        double dx = posB[0] - posA[0];
        double dy = posB[1] - posA[1];
        double dz = posB[2] - posA[2];
        double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
        double forceMagnitude = (G * a.getMass() * b.getMass()) / (distance * distance);
        return new double[]{
            forceMagnitude * dx / distance,
            forceMagnitude * dy / distance,
            forceMagnitude * dz / distance
        };
    }

    private void updateVelocityAndPosition(CelestialBody body, double[] netForce, double timeStep) {
        double[] velocity = body.getVelocity();
        double[] position = body.getPosition();
        double mass = body.getMass();

        // Update velocity: v = v + (F / m) * dt
        velocity[0] += (netForce[0] / mass) * timeStep;
        velocity[1] += (netForce[1] / mass) * timeStep;
        velocity[2] += (netForce[2] / mass) * timeStep;
        body.setVelocity(velocity);

        // Update position: x = x + v * dt
        position[0] += velocity[0] * timeStep;
        position[1] += velocity[1] * timeStep;
        position[2] += velocity[2] * timeStep;
        body.setPosition(position);
    }

    public void simulate(double totalTime, double timeStep) {
        double currentTime = 0;
        while (currentTime < totalTime) {
            calculateGravitationalForces(timeStep);
            printSimulationState(currentTime);
            currentTime += timeStep;
        }
    }

    private void printSimulationState(double currentTime) {
        System.out.println("Time: " + currentTime);
        for (CelestialBody body : bodies) {
            double[] position = body.getPosition();
            System.out.printf("Body at position (%.2f, %.2f, %.2f)\n", position[0], position[1], position[2]);
        }
    }
}