package cydeo.Practice.day3;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassT3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        String expectedLogInText = "Log In";
        WebElement logInbutt = driver.findElement(By.cssSelector("input.login-btn"));
        String logInbutton = logInbutt.getAttribute("value");

        if (logInbutton.equals(expectedLogInText)) {
            System.out.println("Log In Text test PASSED");
        } else {
            System.out.println("Log In Text test FAILED");
        }
        driver.close();
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
 */