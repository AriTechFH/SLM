import org.example.Board;
import org.example.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void positiveIsCellEmpty() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void negativeIsCellEmpty() {
        Board board = new Board();
        // Assuming the cell is empty, let's mark it and check if it's empty again.
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
    }
        @Test
        void positiveGetMarker() {
            Player player = new Player('X');
            assertEquals('X', player.getMarker());
        }

        @Test
        void negativeGetMarker() {
            Player player = new Player('X');
            // Assuming the marker is initialized correctly, let's test a different marker.
            assertEquals('O', player.getMarker());
        }

}

