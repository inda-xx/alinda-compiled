import java.util.List;
import java.util.ArrayList;

public class CelestialBody {
    private double mass;
    private double[] position; // {x, y, z}
    private double[] velocity; // {vx, vy, vz}

    public CelestialBody(double mass, double[] position, double[] velocity) {
        this.mass = mass;
        this.position = position;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public void setVelocity(double[] velocity) {
        this.velocity = velocity;
    }

    public static List<CelestialBody> loadCelestialBodiesFromFile(String filename) {
        List<CelestialBody> celestialBodies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",");
                    double mass = Double.parseDouble(data[0]);
                    double[] position = {Double.parseDouble(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3])};
                    double[] velocity = {Double.parseDouble(data[4]), Double.parseDouble(data[5]), Double.parseDouble(data[6])};
                    celestialBodies.add(new CelestialBody(mass, position, velocity));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading or parsing data: " + e.getMessage());
        }
        return celestialBodies;
    }
}