package cydeo.tests.day8_properties_configReader;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_OrderVerification {
    WebDriver driver;

    @BeforeMethod

    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void OrderNameVerify()

    {
//multiple table : First locate webtable
        WebElement BobsCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
      //  System.out.println("BobsCell = " + BobsCell.getText());

        String Expected  = "Bob Martin";
        String Actual = BobsCell.getText();

        Assert.assertEquals(Expected, Actual);
        WebElement BobsOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String actualDate = BobsOrderDate.getText();
        String expectedDate = "12/31/2021";

        Assert.assertEquals(actualDate, expectedDate);

    }

    @AfterMethod
    public void close () {
        driver.close();
    }
}

/*
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected
Expected: 12/31/202
 */