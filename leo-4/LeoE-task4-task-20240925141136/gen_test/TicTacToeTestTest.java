package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class TicTacToeTest {

    private TicTacToe game;

    @Before
    public void setUp() {
        game = new TicTacToe();
    }

    @Test
    public void testInitialBoardIsEmpty() {
        char[][] expectedBoard = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(expectedBoard[i][j], game.board[i][j]);
            }
        }
    }
    
    @Test
    public void testInitialCurrentPlayerIsX() {
        assertEquals('X', game.currentPlayer);
    }

    @Test
    public void testIsValidMoveValidPositions() {
        assertTrue(game.isValidMove(0, 0));
        assertTrue(game.isValidMove(1, 1));
        assertTrue(game.isValidMove(2, 2));
    }

    @Test
    public void testIsValidMoveInvalidPositions() {
        assertFalse(game.isValidMove(-1, 0));
        assertFalse(game.isValidMove(0, -1));
        assertFalse(game.isValidMove(3, 0));
        assertFalse(game.isValidMove(0, 3));
    }

    @Test
    public void testIsValidMoveOccupiedSpace() {
        game.makeMove(0, 0);
        assertFalse(game.isValidMove(0, 0));
    }

    @Test
    public void testMakeMoveValid() {
        assertTrue(game.makeMove(0, 0));
        assertEquals('X', game.board[0][0]);
    }

    @Test
    public void testMakeMoveInvalid() {
        game.makeMove(0, 0);
        assertFalse(game.makeMove(0, 0));
    }

    @Test
    public void testCheckWinnerRow() {
        game.makeMove(0, 0);
        game.makeMove(1, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(0, 2);
        assertTrue(game.checkWinner());
    }

    @Test
    public void testCheckWinnerColumn() {
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 0);
        game.makeMove(1, 1);
        game.makeMove(2, 0);
        assertTrue(game.checkWinner());
    }

    @Test
    public void testCheckWinnerDiagonal() {
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(1, 0);
        game.makeMove(2, 2);
        assertTrue(game.checkWinner());
    }

    @Test
    public void testNoWinner() {
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(1, 1);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        assertFalse(game.checkWinner());
    }

    @Test
    public void testChangePlayer() {
        assertEquals('X', game.currentPlayer);
        game.changePlayer();
        assertEquals('O', game.currentPlayer);
        game.changePlayer();
        assertEquals('X', game.currentPlayer);
    }

    @Test
    public void testIsBoardFull() {
        assertFalse(game.isBoardFull());
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        game.makeMove(1, 0);
        game.makeMove(1, 1);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 1);
        game.makeMove(2, 2);
        assertTrue(game.isBoardFull());
    }

    @Test
    public void testDrawCondition() {
        game.makeMove(0, 0);
        game.makeMove(0, 1);
        game.makeMove(0, 2);
        game.makeMove(1, 0);
        game.makeMove(1, 1);
        game.makeMove(1, 2);
        game.makeMove(2, 0);
        game.makeMove(2, 1);
        game.makeMove(2, 2); // Board is full, no winner
        assertFalse(game.checkWinner());
        assertTrue(game.isBoardFull());
    }
}