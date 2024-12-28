import java.util.Scanner;

public class Game {
    int playerX, playerY;
    boolean gameOver = false;
    int score = 0;
    
    // Method to move the player based on user input
    public void movePlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Use W/A/S/D to move. Type 'exit' to end the game.");
        
        while (!gameOver) {
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "w": playerY--; break; // Move up
                case "s": playerY++; break; // Move down
                case "a": playerX--; break; // Move left
                case "d": playerX++; break; // Move right
                case "exit": gameOver = true; break; // End game
                default: System.out.println("Invalid input. Use W/A/S/D to move.");
            }

            // Example condition to end the game
            if (playerX < 0 || playerY < 0) {
                System.out.println("Game over! Exiting game.");
                gameOver = true;
            }

            System.out.println("Player position: (" + playerX + ", " + playerY + ")");
        }

        scanner.close();
    }

    // Method to calculate score over time
    public void calculateScore() {
        for (int time = 0; time < 100; time++) {
            score += 10; // Basic score increment
            
            // Example of bonus score condition
            if (time % 10 == 0) {
                score += 50;
            }
        }
        
        System.out.println("Final Score: " + score);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.movePlayer();
        game.calculateScore();
    }
}