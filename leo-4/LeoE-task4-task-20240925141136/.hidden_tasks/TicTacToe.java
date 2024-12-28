public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X'; // setting the default player to 'X'
        initializeBoard();
    }

    // Initialize the board with spaces
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current board state
    public void printBoard() {
        System.out.println("Current board state:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    // Check if the move is valid
    public boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        return board[row][col] == ' ';
    }

    // Make a move for the current player
    public boolean makeMove(int row, int col) {
        if (!isValidMove(row, col)) {
            return false;
        }
        board[row][col] = currentPlayer;
        return true;
    }

    // Check for a winner
    public boolean checkWinner() {
        // Check rows, columns, and diagonals for a win
        return (checkRowWinner() || checkColumnWinner() || checkDiagonalWinner());
    }

    // Helper method to check rows for a winner
    private boolean checkRowWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check columns for a winner
    private boolean checkColumnWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check diagonals for a winner
    private boolean checkDiagonalWinner() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    // Toggle the current player
    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if the board is full
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Main method to run the game
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        boolean isGameFinished = false;

        while (!isGameFinished) {
            game.printBoard();
            int row, col;
            
            do {
                System.out.println("Player '" + game.currentPlayer + "', enter your move (row and column): ");
                
                // Dummy inputs for simplicity; replace with input handling in a real scenario
                row = 1; // Example input
                col = 1; // Example input

            } while (!game.makeMove(row, col));

            if (game.checkWinner()) {
                game.printBoard();
                System.out.println("Player '" + game.currentPlayer + "' wins!");
                isGameFinished = true;
            } else if (game.isBoardFull()) {
                game.printBoard();
                System.out.println("The game is a draw!");
                isGameFinished = true;
            } else {
                game.changePlayer();
            }
        }
    }
}