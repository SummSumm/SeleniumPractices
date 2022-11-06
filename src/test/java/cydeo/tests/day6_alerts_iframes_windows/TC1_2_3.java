package cydeo.tests.day6_alerts_iframes_windows;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_2_3 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void T123 () {
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement JSAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JSAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(), "Result Text is NOT displayed");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text and expected text NOT matching");

        //----------------------------------------------------------------------------------------------
       /* driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement JSPrompt= driver.findElement(By.xpath("//button[@onclick=,'jsPrompt()']"));
        JSPrompt.click();

        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Hello");

        WebElement promptMsg = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText2 = "You entered: Hello";
        String actualText2 = promptMsg.getText();

        Assert.assertEquals(actualText2, expectedText2, "Actual and expected texts do NOT match");

*/

    }

    @AfterMethod
    public void close () {
        driver.close();
    }


}
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
 */