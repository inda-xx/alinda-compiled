public class CopyMechanics {

    /**
     * Task 2.1: Explain Shallow vs Deep Copy
     * 
     * Shallow copy copies the reference to an object, while deep copy creates
     * a new instance of an object with its own unique data.
     */
    public void explainCopies() {
        System.out.println("Shallow copy duplicates object references, potentially causing shared data.");
        System.out.println("Deep copy fully replicates an object, avoiding shared data.");
    }

    /**
     * Task 2.2: Implications of Copy Concepts
     */
    public void implicationsOfCopies() {
        System.out.println("Shallow copy might cause data collision or corruption in games when objects share state.");
        System.out.println("It can affect games if copied entities unintentionally share behaviors and attributes.");
    }

    public static void main(String[] args) {
        CopyMechanics mechanics = new CopyMechanics();
        mechanics.explainCopies();
        mechanics.implicationsOfCopies();
    }
}