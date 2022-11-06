package cydeo.tests.day11_JSExecutorPractice;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_CircleDragNDrop {

    @Test
    public void dragNDrop (){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-policy-text"));
        acceptCookiesButton.click();

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtil.sleep(2);
        actions.dragAndDrop(smallCircle, bigCircle).perform();

        String expectedText = "You did great!";
        String actualText = bigCircle.getText();

        Assert.assertEquals(actualText, expectedText);

        Driver.getDriver().close();

    }
}
/*
TC #: Drag and drop
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!"
 */