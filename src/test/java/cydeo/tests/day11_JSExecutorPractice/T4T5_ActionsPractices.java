package cydeo.tests.day11_JSExecutorPractice;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4T5_ActionsPractices {
    @Test
    public void T4() {
        Driver.getDriver().get("https://practice.cydeo.com/ ");

        Actions actions = new Actions(Driver.getDriver());

        WebElement link = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(link).perform();

        BrowserUtil.sleep(2);

        //WebElement home = Driver.getDriver().findElement(By.linkText("Home"));
        //actions.moveToElement(home).perform();

        //OR
        // js.executeScript("window.scrollBy(0,750)"); --> you'll need a JavaScriptExecute object for this

        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();

        BrowserUtil.sleep(2);

        Driver.getDriver().close();


    }
}
/*
TC #4: Scroll practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/
3- Scroll down to “Powered by CYDEO”
4- Scroll using Actions class “moveTo(element)” method


TC #5: Scroll practice 2
1- Continue from where the Task 4 is left in the same test.
2- Scroll back up to “Home” link using PageUP button

 */