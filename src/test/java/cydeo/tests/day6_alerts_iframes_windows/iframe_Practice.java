package cydeo.tests.day6_alerts_iframes_windows;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframe_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void T123() {
        driver.get("https://practice.cydeo.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement YourContentText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(YourContentText.isDisplayed());


        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//h3"));

        Assert.assertTrue((driver.findElement(By.xpath("//h3")).isDisplayed()));

    }

    @AfterMethod
    public void close() {
        driver.close();
    }


}
/*
TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */