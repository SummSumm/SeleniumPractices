package cydeo.Practice.day3;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassT4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        String expectedRP = "Reset password";
        String actualRP = driver.findElement(By.tagName("button")).getText();

        if (actualRP.equals(expectedRP)) {
            System.out.println("Reset Password test PASSED");
        } else {
            System.out.println("Reset Password test FAILED");
        }

        driver.close();
    }
}
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password
 */