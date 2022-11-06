package cydeo.Review.May17;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void test7() {
        driver.get("http://automationexercise.com");
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Home page not displayed");

        WebElement testCases = driver.findElement(By.xpath("//button[.='Test Cases'] [1]"));
        testCases.click();

        String expectedLink = "https://automationexercise.com/test_cases";
        String actualLink = driver.getCurrentUrl();

        Assert.assertEquals(actualLink, expectedLink, "Link wrong");
    }

    @AfterMethod
    public void closing () {
        driver.close();
    }
}


/*
Test Case 7: Verify Test Cases Page
https://www.automationexercise.com/test_cases

1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Test Cases' button
5. Verify user is navigated to test cases page successfully
 */