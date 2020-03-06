package features.multiplication;

import hu.idom.calculator.Calculator;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private Calculator calculator;
    private int multiplicationResult;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @When("multiply {int} and {int}")
    public void multiply_and(int number1, int number2) {
        multiplicationResult = calculator.multiply(number1, number2);
    }

    @Then("the result is {int}")
    public void the_result_is(int expectedResult) {
        assertEquals(multiplicationResult, expectedResult);
    }
}
