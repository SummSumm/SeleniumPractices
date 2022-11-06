package cydeo.Review.May14;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC1 {
    WebDriver driver;

    @Test
    public void verifyBoxes () {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test" + Keys.ENTER);

        WebElement checkAllButton  = driver.findElement(By.linkText("Check All"));
        checkAllButton.click();

        //USING TEST NG FOR VERIFICATION
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each:checkBoxes) {
            Assert.assertTrue(each.isSelected());
        }

        WebElement uncheckAllButton  = driver.findElement(By.linkText("Uncheck All"));
        uncheckAllButton.click();

        checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each:checkBoxes) {
            Assert.assertFalse(each.isSelected());
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
Test Case 1 :  Verify CheckBox, CheckAll and UncheckAll Buttons
1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
2.    Login with-----Username: Tester, password: test

3.    Click on check all button verify all the checkboxes are checked
4.    Click on uncheck all button verify that all the checkboxes are unchecked

 */