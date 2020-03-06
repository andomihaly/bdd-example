package hu.idom.calculatorUnitTest;

import hu.idom.calculator.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void additionTest(){
        assertEquals(2,calculator.add(1,1));
    }

    @Test(expected = ArithmeticException .class)
    public void additionResultOverSetOfValuesTest(){
        calculator.add(Integer.MAX_VALUE,1);
    }

    @Test
    public void multiplyTest(){
        assertEquals(21,calculator.multiply(7,3));
    }

    @Test(expected = ArithmeticException .class)
    public void multiplicationResultOverSetOfValuesTest(){
        calculator.multiply(Integer.MAX_VALUE,2);
    }
}
