import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
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
        double addedValue = calculator.divide(3, 2);
        assertEquals(1.5, addedValue, 0.01);
    }
}
