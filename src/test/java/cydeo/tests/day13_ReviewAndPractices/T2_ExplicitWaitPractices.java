package cydeo.tests.day13_ReviewAndPractices;

import cydeo.Pages.ExplicitWait1;
import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_ExplicitWaitPractices {
    ExplicitWait1 explicitWait1;

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls ");
        explicitWait1 = new ExplicitWait1();
    }

    @Test
    public void ExplicitWait1() {
        explicitWait1.removeButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
       wait.until(ExpectedConditions.invisibilityOf(explicitWait1.loadingSign));

        try {
            Assert.assertTrue(!explicitWait1.checkbox.isDisplayed());
            Assert.assertFalse(explicitWait1.checkbox.isDisplayed());
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }


        Assert.assertTrue(explicitWait1.goneMessage.isDisplayed());
        Driver.getDriver().close();
    }

    @Test
    public void EnableButton() {
        System.out.println(explicitWait1.inputBox.isEnabled());
        System.out.println(explicitWait1.enableButton.isEnabled());

        explicitWait1.enableButton.click();

        BrowserUtil.waitForInvisibilityOf((explicitWait1.loadingSign));
        System.out.println(explicitWait1.inputBox.isEnabled());
    }
}

/*
TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.
 */