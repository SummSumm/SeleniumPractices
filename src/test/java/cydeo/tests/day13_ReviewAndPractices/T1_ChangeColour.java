package cydeo.tests.day13_ReviewAndPractices;

import cydeo.Pages.DoubleClickPage;
import cydeo.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_ChangeColour {

    @Test
    public void T1_DoubleClick () {
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");   // buraya ID ya da name veriyoruz

        DoubleClickPage page = new DoubleClickPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(page.textToDoubleClick).perform();

        String styleText = page.textToDoubleClick.getAttribute("style");
        Assert.assertTrue(styleText.contains("red"));


    }
}
/*
TC #1: Double Click Test
1. Go to
https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch to iframe.
3. Double click on the text “Double-click me to change my text color.”
4. Assert: Text’s “style” attribute value contains “red”.

NOTE: FOLLOW POM
 */