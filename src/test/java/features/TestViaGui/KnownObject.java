package features.TestViaGui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class KnownObject {
    WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("http://localhost:8080/index.html");
            PageFactory.initElements(driver, CalculatorHomePage.class);
            System.out.println("Start Chrome driver browser");
        }
        return driver;
    }
}
