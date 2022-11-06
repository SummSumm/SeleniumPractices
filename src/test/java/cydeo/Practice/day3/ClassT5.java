package cydeo.Practice.day3;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ClassT5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        driver.findElement(By.cssSelector("input[name='USER_LOGIN']")).sendKeys("asdf" + Keys.ENTER);

        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = driver.findElement(By.cssSelector("div.errortext")).getText();

        Thread.sleep(2000);

        if (actualErrorLabel.equals(expectedErrorLabel)) {
            System.out.println("Error label test PASSED");
        } else {
            System.err.println("Error label test FAILED");
        }
        driver.close();
    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
 */