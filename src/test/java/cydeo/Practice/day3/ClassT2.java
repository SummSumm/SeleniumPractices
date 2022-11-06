package cydeo.Practice.day3;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassT2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com/");

        String actualText = driver.findElement(By.cssSelector("label.login-item-checkbox-label")).getText();
        String expectedText = "Remember me on this computer";

        if (actualText.equals(expectedText)) {
            System.out.println("text verification PASSED");
        } else {
            System.out.println("text verification FAILED");
        }


        String actualForgotText = driver.findElement(By.cssSelector("a.login-link-forgot-pass")).getText();
        String expectedForgotText = "Forgot your password?";

        if (actualForgotText.equals(expectedForgotText)) {
            System.out.println("forgot text verification PASSED");
        } else {
            System.out.println("forgot text verification FAILED: Caps problem");
        }

        WebElement actualForgot = driver.findElement(By.cssSelector("a.login-link-forgot-pass"));
        String actualForgotAttribute = actualForgot.getAttribute("href");
        String expectedForgotAttribute = "/?forgot_password=yes";

        if (actualForgotAttribute.contains(expectedForgotAttribute)) {
            System.out.println("forgot attribute verification PASSED");
        } else {
            System.out.println("forgot attribute verification FAILED");
        }
        driver.close();
    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
elements
 */