import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    @Test
    public void testAdd() {
        int result = Calc.add(2, 3);  // Call the method you're testing
        assertEquals(5, result);  // Check if the result is 5
    }
}
