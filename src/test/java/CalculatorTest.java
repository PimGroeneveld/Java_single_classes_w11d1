import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10, 2);
    }

    @Test
    public void canAdd(){
//        Calculator newCalcultor = new Calculator(2, 10);
        // below variables get overwritten by @before calculator
        int addedValue = calculator.add(10, 2);
        assertEquals(12, addedValue);
    }

    @Test
    public void canSubtract(){
        int addedValue = calculator.subtract(10, 2);
        assertEquals(8, addedValue);
    }

    @Test
    public void canMultiply(){
        int addedValue = calculator.multiply(10, 2);
        assertEquals(20, addedValue);
    }

    @Test
    public void canDivide(){
        int addedValue = calculator.divide(10, 2);
        assertEquals(5, addedValue);
    }
}
