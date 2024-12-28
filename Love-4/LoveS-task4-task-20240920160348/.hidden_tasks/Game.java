import java.util.Scanner;

public class Game {
    private static final int GRID_SIZE = 5;
    private char[][] grid;
    private int playerX, playerY;
    private int enemyX, enemyY;
    private int score;

    public Game() {
        grid = new char[GRID_SIZE][GRID_SIZE];
        playerX = 0;
        playerY = 0;
        enemyX = GRID_SIZE - 1;
        enemyY = GRID_SIZE - 1;
        score = 0;
    }

    public void displayGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (i == playerX && j == playerY) {
                    System.out.print('P');
                } else if (i == enemyX && j == enemyY) {
                    System.out.print('E');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public void movePlayer(char direction) {
        int newX = playerX;
        int newY = playerY;
        
        switch (direction) {
            case 'W': newX--; break;
            case 'A': newY--; break;
            case 'S': newX++; break;
            case 'D': newY++; break;
            default: System.out.println("Invalid move! Use W, A, S, D to move."); return;
        }
        
        if (isValidPosition(newX, newY)) {
            playerX = newX;
            playerY = newY;
            handleActions();
        } else {
            System.out.println("Move not allowed, out of bounds.");
        }
    }

    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < GRID_SIZE && y >= 0 && y < GRID_SIZE;
    }

    private boolean isAtSpecialPosition() {
        return playerX == 0 && playerY == GRID_SIZE - 1; // Some special position
    }
    
    private void handleActions() {
        if (isAtSpecialPosition()) {
            score += 10;
            System.out.println("You've scored! Current score: " + score);
        }
        if (playerX == enemyX && playerY == enemyY) {
            handleEnemyCollision();
        }
    }

    private void handleEnemyCollision() {
        System.out.println("You've encountered an enemy! Score penalized.");
        score -= 5;
        System.out.println("Current score: " + score);
    }

    public void movePlayerByOffset(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;
        if (isValidPosition(newX, newY)) {
            playerX = newX;
            playerY = newY;
        }
    }

    public void teleportPlayer(int x, int y) {
        if (isValidPosition(x, y)) {
            playerX = x;
            playerY = y;
        }
    }

    public void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean isPlaying = true;

        while (isPlaying) {
            displayGrid();
            System.out.println("Enter move (W/A/S/D to move, Q to quit): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Q")) {
                isPlaying = false;
            } else if (input.length() == 1) {
                movePlayer(input.charAt(0));
            } else {
                System.out.println("Invalid input. Please enter a single character.");
            }
        }
        scanner.close();
        System.out.println("Game Ended. Final score: " + score);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.gameLoop();
    }
}