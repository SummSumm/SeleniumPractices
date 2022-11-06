package cydeo.Practice;

import cydeo.Utilities.ConfigurationReader;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OscarTask {
    @Test
    public void OscarsTask () {
        Driver.getDriver().get("https://www.amazon.com");
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("oscarSearch") + Keys.ENTER);





    }
}
