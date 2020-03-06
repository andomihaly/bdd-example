package features.addition;

import features.TestViaGui.CalculateSumOfTwoNumbersActionPageObject;
import features.TestViaGui.CalculatorHomePage;
import features.TestViaGui.KnownObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class StepDefinitions {
    private KnownObject helper;

    @Before("@additionHook")
    public void setUp() {
        helper = new KnownObject();
    }
    @Given("open calculator")
    public void open_calculator() {
        helper.getDriver();
    }

    @When("add {int} and {int}")
    public void addTwoNumbers(Integer number1, Integer number2) {
        CalculateSumOfTwoNumbersActionPageObject.execute(helper.getDriver(),number1,number2);
    }

    @Then("the addition result is {int}")
    public void the_addition_result_is(Integer expectedResult) {
        Assert.assertEquals(CalculatorHomePage.additionResult.getText(), expectedResult.toString());
    }

    @After("@additionHook")
    public void teardown(){
        helper.getDriver().quit();
    }
}
