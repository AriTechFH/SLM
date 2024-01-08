
import org.example.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

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
