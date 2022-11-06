package cydeo.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtil {

    public static void sleep (int seconds) {
        seconds*=1000;

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }

    public static void switchWindowVerify (WebDriver driver, String expectedInURL, String expectedInTitle) {
        // should already have multiple windows
        Set <String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);

            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }
        }

        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    //a method that accepts a string expected and asserts if true

    public static void VerifyTitle (WebDriver driver, String expectedTitle) {


        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

   // Creating a utility method for ExplicitWait, so we don't have to repeat the lines
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


}
