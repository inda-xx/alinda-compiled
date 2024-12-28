public class GameGrid {
    private char[][] grid;
    private int playerRow;
    private int playerCol;
    private GameScoringSystem scoringSystem;

    public GameGrid(char[][] grid) {
        this.grid = grid;
        this.scoringSystem = new GameScoringSystem();
        findPlayer();
    }

    // Find player position on the grid
    private void findPlayer() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'P') {
                    playerRow = i;
                    playerCol = j;
                    return;
                }
            }
        }
    }

    // Player movement method
    public void movePlayer(char direction) {
        int newRow = playerRow;
        int newCol = playerCol;

        switch (direction) {
            case 'W': newRow--; break; // Move up
            case 'A': newCol--; break; // Move left
            case 'S': newRow++; break; // Move down
            case 'D': newCol++; break; // Move right
            default: throw new IllegalArgumentException("Invalid direction: " + direction);
        }

        // Check boundaries and enemy collision
        if (isValidMove(newRow, newCol)) {
            if (grid[newRow][newCol] == 'E') { // Assume 'E' is a generic enemy
                // Update scoring if an enemy is defeated
                scoringSystem.defeatEnemy("Zombie"); // Example way to identify Zombies
            }
            // Move player
            grid[playerRow][playerCol] = '.';
            grid[newRow][newCol] = 'P';
            playerRow = newRow;
            playerCol = newCol;
        }
    }

    // Check if move is valid
    private boolean isValidMove(int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] != 'E';
    }

    public static void main(String[] args) {
        char[][] initialGrid = {
            {'.', '.', '.', 'P', '.', '.', '.', '.'},
            {'.', 'E', '.', '.', 'E', '.', '.', '.'},
            {'.', '.', '.', 'E', '.', '.', '.', '.'}
        };

        GameGrid gameGrid = new GameGrid(initialGrid);

        gameGrid.movePlayer('S'); // Try moving down
        gameGrid.movePlayer('A'); // Try moving left
        gameGrid.movePlayer('W'); // Try moving up

        // Output the new grid state
        for (char[] row : gameGrid.grid) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        
        // Display total score after interactions
        System.out.println("Total Score: " + gameGrid.scoringSystem.getTotalScore());
    }
}