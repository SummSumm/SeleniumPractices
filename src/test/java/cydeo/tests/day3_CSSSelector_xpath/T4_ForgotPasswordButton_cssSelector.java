package cydeo.tests.day3_CSSSelector_xpath;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_ForgotPasswordButton_cssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        // Verify reset password is as expected:    Reset password

        WebElement ResetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedPWBmessage= "Reset password";
        String actualPWBmessage = ResetPasswordButton.getText();

        if (actualPWBmessage.equals(expectedPWBmessage)) {
            System.out.println("Password button message verification test PASSED");
        } else {
            System.out.println("Password button message verification test FAILED");
        }

        driver.close();
    }
}
