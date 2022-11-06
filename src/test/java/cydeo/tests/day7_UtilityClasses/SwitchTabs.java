package cydeo.tests.day7_UtilityClasses;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SwitchTabs {

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    @Test
    public void TabSwitch () {
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");

        BrowserUtil.switchWindowVerify(driver, "etsy", "Etsy");
    }
}
