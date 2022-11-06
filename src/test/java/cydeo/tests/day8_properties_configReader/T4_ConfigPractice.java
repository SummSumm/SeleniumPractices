package cydeo.tests.day8_properties_configReader;

import cydeo.Utilities.ConfigurationReader;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T4_ConfigPractice {

/*
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
*/

    @AfterMethod
    public void close() {
        Driver.getDriver().close();
    }

    @Test
    public void google_search_test () {
        Driver.getDriver().get("https://www.google.com");
        WebElement searchbox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchbox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
