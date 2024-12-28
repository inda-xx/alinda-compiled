import java.util.Random;

public class AdvancedGameGrid {
    private char[][] grid;
    private int playerRow;
    private int playerCol;
    private GameScoringSystem scoringSystem;
    private Random random;

    public AdvancedGameGrid(char[][] grid) {
        this.grid = grid;
        this.scoringSystem = new GameScoringSystem();
        this.random = new Random();
        findPlayer();
    }

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

    public void movePlayer(char direction) {
        int newRow = playerRow;
        int newCol = playerCol;

        switch (direction) {
            case 'W': newRow--; break;
            case 'A': newCol--; break;
            case 'S': newRow++; break;
            case 'D': newCol++; break;
            default: throw new IllegalArgumentException("Invalid direction: " + direction);
        }

        if (isValidMove(newRow, newCol)) {
            if (grid[newRow][newCol] == 'E') {
                scoringSystem.defeatEnemy("Zombie");
            }
            grid[playerRow][playerCol] = '.';
            grid[newRow][newCol] = 'P';
            playerRow = newRow;
            playerCol = newCol;
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] != 'E';
    }

    public void moveEnemies() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'E') {
                    int[] direction = randomDirection();
                    int newRow = i + direction[0];
                    int newCol = j + direction[1];

                    if (isValidEnemyMove(newRow, newCol)) {
                        grid[i][j] = '.';
                        grid[newRow][newCol] = 'E';
                    }
                }
            }
        }
    }

    private int[] randomDirection() {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        return directions[random.nextInt(directions.length)];
    }

    private boolean isValidEnemyMove(int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == '.';
    }

    public void gameLoop() {
        // This is a simple loop, usually you'd have more complex logic and user interaction
        movePlayer('S');
        moveEnemies();
    }

    public static void main(String[] args) {
        char[][] initialGrid = {
            {'.', '.', '.', 'P', '.', '.', '.', '.'},
            {'.', 'E', '.', '.', 'E', '.', '.', '.'},
            {'.', '.', '.', 'E', '.', '.', '.', '.'}
        };

        AdvancedGameGrid advancedGameGrid = new AdvancedGameGrid(initialGrid);

        // Simulating a few turns of the game loop
        for (int i = 0; i < 5; i++) {
            advancedGameGrid.gameLoop();

            // Output the new grid state
            for (char[] row : advancedGameGrid.grid) {
                for (char c : row) {
                    System.out.print(c);
                }
                System.out.println();
            }
            System.out.println("Total Score: " + advancedGameGrid.scoringSystem.getTotalScore());
            System.out.println("------");
        }
    }
}