import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, Calculator.Add(""));
    }
    @Test
    public void shouldReturnNumberIfStringHaveNumber(){
        assertEquals(1,Calculator.Add("1"));
    }
}