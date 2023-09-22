import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assertions.assertEquals(6,calculator.add(4,2));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(2, calculator.subtract(4,2));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(8, calculator.multiply(4,2));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2, calculator.divide(4,2));
    }
}
