package cydeo.tests.day3_CSSSelector_xpath;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GetAttribute_cssSelector {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("https://login1.nextbasecrm.com");

        // Verify log in writes "Log In"

        WebElement LogInButton = driver.findElement(By.cssSelector("input[type='submit']"));   //--> located the button
        String expected = "Log In";
        String actual =LogInButton.getAttribute("value");

        if (actual.equals(expected)) {
            System.out.println("Log in button verification test PASSED");
        } else {
            System.out.println("Log in button verification test FAILED");
        }
        driver.close();


    }
}
