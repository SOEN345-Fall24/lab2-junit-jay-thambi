import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void testFunction_A_Positive() {
        Calc example = new Calc(5, 3);  
        int result = example.Function_A(10);  
        assertEquals(15, result);  
    }

    @Test
    public void testFunction_A_Negative() {
    	Calc example = new Calc(5, 3);  
        int result = example.Function_A(-10);  
        assertEquals(-15, result);  
    }

    @Test
    public void testFunction_B_LessThanSix() {
    	Calc example = new Calc(5, 3);  
        int result = example.Function_B(4);  
        assertEquals(7, result);  
    }

    @Test
    public void testFunction_B_GreaterThanSix() {
    	Calc example = new Calc(5, 3);  
        int result = example.Function_B(7); 
        assertEquals(4, result);  
    }
}
