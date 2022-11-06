package cydeo.tests.day5_TestNG_Dropdowns;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
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

            driver.get("https://www.google.com");
            Assert.assertEquals(driver.getTitle(), "Google", "Title doesn't match expected");

        }
}
