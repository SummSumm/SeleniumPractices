package cydeo.tests.day6_alerts_iframes_windows;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC6 {
WebDriver driver;
    @BeforeMethod
            public void setup () {
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void T6 () throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        Select dropdownMenu = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dropdownMenu.selectByVisibleText("1923");
        Thread.sleep(2000);

        Select dropdownMenu2 = new Select (driver.findElement(By.xpath("//select[@id='month']")));
        dropdownMenu2.selectByVisibleText("December");
        Thread.sleep(2000);

        Select dropdownMenu3 = new Select (driver.findElement(By.xpath("//select[@id='day']")));
        dropdownMenu3.selectByVisibleText("5");
        Thread.sleep(2000);


        String expectedYear = "1923";
        String actualYear = dropdownMenu.getFirstSelectedOption().getText();

        String expectedMonth = "December";
        String actualMonth = dropdownMenu2.getFirstSelectedOption().getText();

        String expectedDay = "5";
        String actualDay = dropdownMenu3.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);


    }
        @AfterMethod
                public void closeDriver () {
            driver.close();
        }


}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 5th, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number
 */