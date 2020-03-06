package features.TestViaGui;

import org.openqa.selenium.WebDriver;

public class CalculateSumOfTwoNumbersActionPageObject {
    public static void execute(WebDriver webDriver, int number1, int number2){
        CalculatorHomePage.additionInputNumber1.sendKeys(number1 + "");
        CalculatorHomePage.additionInputNumber2.sendKeys(number2 + "");
        CalculatorHomePage.additionButton.click();
    }

}
