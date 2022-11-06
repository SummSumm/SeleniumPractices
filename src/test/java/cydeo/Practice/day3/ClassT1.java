package cydeo.Practice.day3;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ClassT1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");

        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys("incorrect");
        driver.findElement(By.cssSelector("input[name='USER_PASSWORD']")).sendKeys("incorrect" + Keys.ENTER);

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.cssSelector("div.errortext")).getText();

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification PASSED");
        } else {
            System.out.println("Error message verification FAILED");
        }
        driver.close();
    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web
elements
 */