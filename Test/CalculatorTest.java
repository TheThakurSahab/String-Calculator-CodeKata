import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroIfStringIsEmpty(){
        assertEquals(0, Calculator.Add(""));
    }
    @Test
    public void shouldReturnNumberIfStringHaveNumber(){
        assertEquals(5,Calculator.Add("5"));
    }
    @Test
    public void shouldReturnSumIfStringHaveTwoNumberDelimitedByComma(){
        assertEquals(8, Calculator.Add("5,3"));
    }
}