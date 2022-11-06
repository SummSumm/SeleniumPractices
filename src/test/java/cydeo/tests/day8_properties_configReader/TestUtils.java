package cydeo.tests.day8_properties_configReader;
import cydeo.Utilities.WebTableUtility;
import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestUtils {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @AfterMethod
    public void close () {
        driver.close();
    }

    @Test
    public void OrderVerificationTasks () {
        System.out.println("Order Date = " + WebTableUtility.returnOrderDate(driver, "John Doe"));
        WebTableUtility.orderVerify(driver, "John Doe", "01/08/2021");

    }
}
