package cydeo.tests.day11_JSExecutorPractice;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_ScrollJSE {

    @Test
    public void scrollJSE () {
        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement cydeoText = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtil.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoText);

        BrowserUtil.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoText, homeLink);

        Driver.getDriver().close();
    }
}
/*
TC #7: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only

JavaScript method to use : arguments[0].scrollIntoView(true)

Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */