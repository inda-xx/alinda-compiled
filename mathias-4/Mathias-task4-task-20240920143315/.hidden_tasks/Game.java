import java.util.Scanner;
import java.util.Random;

public class Game {
    private boolean[][] grid = new boolean[5][5];
    private int playerX, playerY;
    private int score;
    
    public Game() {
        playerX = 0;
        playerY = 0;
        score = 0;
        populateGrid();
    }

    private void populateGrid() {
        // Randomly or specifically set positions for "Oasis" band members and Mario enemies
        grid[1][1] = true; // Example band member position
        grid[3][3] = true; // Example enemy position
    }

    public boolean movePlayer(String direction) {
        if (isValidMove(direction)) {
            switch(direction) {
                case "up": playerY--; break;
                case "down": playerY++; break;
                case "left": playerX--; break;
                case "right": playerX++; break;
                default: return false;
            }
            checkForBandMember();
            return true;
        }
        return false;
    }

    private boolean isValidMove(String direction) {
        switch(direction) {
            case "up": return playerY > 0;
            case "down": return playerY < grid.length - 1;
            case "left": return playerX > 0;
            case "right": return playerX < grid[0].length - 1;
            default: return false;
        }
    }

    private void checkForBandMember() {
        if (grid[playerX][playerY]) {
            interact(10); // Example for gaining points
            grid[playerX][playerY] = false; // Remove the band member once interacted
        }
    }

    public void interact(int points) {
        score += points;
        System.out.println("Gained " + points + " points! Current Score: " + score);
    }

    public void interact(String message) {
        System.out.println("Interaction: " + message);
    }

    public boolean victoryCondition() {
        // Define victory condition, e.g., reaching a score or a grid position
        return score >= 20;
    }

    public void playGame() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (!victoryCondition()) {
            System.out.println("Current position: (" + playerX + ", " + playerY + ")");
            System.out.print("Enter move (up, down, left, right): ");
            String move = scanner.nextLine();
            if (!movePlayer(move)) {
                System.out.println("Invalid move! Try again.");
            }
        }
        interact("Congratulations! You've won the game!");
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}