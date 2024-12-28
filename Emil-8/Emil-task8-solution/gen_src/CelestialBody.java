import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
                String[] parts = line.split(",");
                double mass = Double.parseDouble(parts[0]);
                double[] position = {Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), Double.parseDouble(parts[3])};
                double[] velocity = {Double.parseDouble(parts[4]), Double.parseDouble(parts[5]), Double.parseDouble(parts[6])};
                celestialBodies.add(new CelestialBody(mass, position, velocity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return celestialBodies;
    }
}
