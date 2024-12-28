import java.util.Scanner;
import java.util.Random;

class Game {
    private static final int GRID_SIZE = 5;
    private static final char PLAYER = 'P';
    private static final char EMPTY = '.';
    private static final char ENEMY = 'E';
    private static final char POINT = 'X';

    private int playerX;
    private int playerY;
    private int score;
    private char[][] grid;
    private Random random;

    public Game() {
        grid = new char[GRID_SIZE][GRID_SIZE];
        random = new Random();
        initializeGrid();
    }

    // Initialize the game grid with empty cells and place player, points, and enemies
    private void initializeGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }
        placePlayer();
        placePoints(3);
        placeEnemies(2);
    }

    private void placePlayer() {
        playerX = GRID_SIZE / 2;
        playerY = GRID_SIZE / 2;
        grid[playerX][playerY] = PLAYER;
    }

    private void placePoints(int count) {
        for (int i = 0; i < count; i++) {
            placeRandomly(POINT);
        }
    }

    private void placeEnemies(int count) {
        for (int i = 0; i < count; i++) {
            placeRandomly(ENEMY);
        }
    }

    private void placeRandomly(char item) {
        int x, y;
        do {
            x = random.nextInt(GRID_SIZE);
            y = random.nextInt(GRID_SIZE);
        } while (grid[x][y] != EMPTY);
        grid[x][y] = item;
    }

    public void movePlayer(char direction) {
        int newX = playerX;
        int newY = playerY;

        switch (direction) {
            case 'W':
                newX--;
                break;
            case 'A':
                newY--;
                break;
            case 'S':
                newX++;
                break;
            case 'D':
                newY++;
                break;
        }

        if (isValidMove(newX, newY)) {
            grid[playerX][playerY] = EMPTY;
            playerX = newX;
            playerY = newY;

            if (grid[newX][newY] == POINT) {
                score = calculateScore(10);
            } else if (grid[newX][newY] == ENEMY) {
                score = calculateScore(-10);
            }

            grid[playerX][playerY] = PLAYER;
        }
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < GRID_SIZE && y >= 0 && y < GRID_SIZE;
    }

    public int calculateScore() {
        return score;
    }

    public int calculateScore(int bonus) {
        score += bonus;
        return score;
    }

    public void displayGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            game.displayGrid();
            System.out.println("Enter move (W/A/S/D) or Q to quit:");
            char command = scanner.nextLine().toUpperCase().charAt(0);

            if (command == 'Q') {
                System.out.println("Game Over. Final Score: " + game.calculateScore());
                break;
            }

            game.movePlayer(command);
        }

        scanner.close();
    }
}