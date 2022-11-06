package cydeo.tests.day5_TestNG_Dropdowns;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_DropdownMethods {
WebDriver driver;

        @BeforeMethod
        public void setup (){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void close (){
            driver.close();
        }

        @Test

        public void SeleniumTest() {

            driver.get("https://practice.cydeo.com/dropdown");

            Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

            WebElement defaultOption = simpleDropdown.getFirstSelectedOption();
            String defaultOptionText = defaultOption.getText();
            String expecteddefaultOptionText = "Please select an option";

            Assert.assertEquals(defaultOptionText, expecteddefaultOptionText);


            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            String expectedStateText = "Select a State";
            String actualStateText= stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(expectedStateText, actualStateText);






    }


}
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State
 */