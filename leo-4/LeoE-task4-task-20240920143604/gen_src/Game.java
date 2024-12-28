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
        // TODO: Implement constructor.
    }

    private void initializeGrid() {
        // TODO: Implement method to initialize the grid.
    }

    private void placePlayer() {
        // TODO: Implement method to place the player on the grid.
    }

    private void placePoints(int count) {
        // TODO: Implement method to place points on the grid.
    }

    private void placeEnemies(int count) {
        // TODO: Implement method to place enemies on the grid.
    }

    private void placeRandomly(char item) {
        // TODO: Implement method to place an item randomly on the grid.
    }

    public void movePlayer(char direction) {
        // TODO: Implement method to move the player based on the direction.
    }

    private boolean isValidMove(int x, int y) {
        // TODO: Implement method to check if a move is valid.
        return false;
    }

    public int calculateScore() {
        // TODO: Implement method to return the current score.
        return 0;
    }

    public int calculateScore(int bonus) {
        // TODO: Implement method to update and return the score with a bonus.
        return 0;
    }

    public void displayGrid() {
        // TODO: Implement method to display the current state of the grid.
    }

    public static void main(String[] args) {
        // TODO: Implement the main method to run the game.
    }
}