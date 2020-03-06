package features.TestViaGui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalculatorHomePage{
    private final WebDriver webDriver;

    @FindBy(how= How.ID, using="addition_number1")
    public static WebElement additionInputNumber1;

    @FindBy(how=How.ID, using="addition_number2")
    public static WebElement additionInputNumber2;

    @FindBy(how= How.ID, using="multiplication_number1")
    public static WebElement multiplicationNumber1;

    @FindBy(how=How.ID, using="multiplication_number2")
    public static WebElement multiplicationNumber2;

    @FindBy(how=How.ID, using="addition_button")
    public static WebElement additionButton;

    @FindBy(how=How.ID, using="multiplication_button")
    public static WebElement multiplicationButton;

    @FindBy(how=How.ID, using="addition_result")
    public static WebElement additionResult;

    @FindBy(how=How.ID, using="multiplication_result")
    public static WebElement multiplicationResult;


    public CalculatorHomePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }


}
