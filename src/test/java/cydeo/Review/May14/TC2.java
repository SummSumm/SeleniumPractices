package cydeo.Review.May14;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {
    WebDriver driver;

    @Test
    public void verifyBoxes () {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test" + Keys.ENTER);

       WebElement name= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl05_OrderSelector']"));
       name.click();

       driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']")).click();

       try {

           System.out.println("name.isDisplayed() = " + name.isDisplayed());
       } catch (StaleElementReferenceException e) {
           System.out.println("works fine");
       }


    }

    @BeforeMethod
    public void start () {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void logout () {
        driver.close();
    }

}
/*
Test Case 2
1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2.    Login with-----Username: Tester, password: test
3.    Select one of the checkbox and delete one person
4.    Then verify that deleted item is no longer exists
 */