public class LevelLoader {
    private char[][] grid;

    // Method to load the level from a text file
    public void loadLevel(String filename) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            int rows = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (grid == null) {
                    grid = new char[3][line.length()];
                }
                grid[rows] = line.toCharArray();
                rows++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Getter for the grid
    public char[][] getGrid() {
        return grid;
    }

    // Main method for testing
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();
        levelLoader.loadLevel("level1.txt");
        char[][] grid = levelLoader.getGrid();
        
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}