package cydeo.tests.day3_CSSSelector_xpath;

import cydeo.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RememberMe {
    public static void main(String[] args) throws InterruptedException {
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

//3- Verify “remember me” label text is as expected:
//Expected: Remember me on this computer
        WebElement remember = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRemember = "Remember me on this computer";
        String actualRemember = remember.getText();

        if (actualRemember.equals(expectedRemember)) {
            System.out.println("Remember Me message verification PASSED");
        } else {
            System.out.println("Remember Me message verification FAILED");
        }
        Thread.sleep(2000);
//4- Verify “forgot password” link text is as expected:
//Expected: Forgot your password?
        WebElement forgot = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgot = "Forgot your password?";
        String actualForgot = forgot.getText();

        if (actualForgot.equalsIgnoreCase(expectedForgot)) { // Actual olan full CAPS; equalla olursa FAIL ediyor
            System.out.println("Forgot Password message verification PASSED");
        } else {
            System.out.println("Forgot Password message verification FAILED");
        }
        Thread.sleep(2000);

//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHrefAttributeValue = forgot.getAttribute("href");


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