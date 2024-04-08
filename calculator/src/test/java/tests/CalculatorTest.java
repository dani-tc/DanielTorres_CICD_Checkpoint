package tests;
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(3, 3), 6);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(7, 3), 4);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(9, 3), 27);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(9, 3), 3);
    }
}