import org.example.Board;
import org.example.TicTacToe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void positiveHasWinner() {
        TicTacToe game = new TicTacToe();
        Board board = game.getBoard();

        // Simulate a winning scenario (horizontal)
        board.place(0, 0, 'X');
        board.place(0, 1, 'X');
        board.place(0, 2, 'X');

        assertTrue(board.hasWinner());
    }

    @Test
    void positiveHasWinnerDiagonal() {
        TicTacToe game = new TicTacToe();
        Board board = game.getBoard();

        // Simulate a winning scenario (diagonal)
        board.place(0, 0, 'O');
        board.place(1, 1, 'O');
        board.place(2, 2, 'O');

        assertTrue(board.hasWinner());
    }
    @Test
    void negativeHasWinner() {
        TicTacToe game = new TicTacToe();
        Board board = game.getBoard();

        // No winner scenario
        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(0, 2, 'X');

        assertFalse(board.hasWinner());
    }

    @Test
    void negativeHasWinnerIncompleteRow() {
        TicTacToe game = new TicTacToe();
        Board board = game.getBoard();

        // Incomplete row scenario
        board.place(1, 0, 'O');
        board.place(1, 1, 'X');

        assertFalse(board.hasWinner());
    }
}
