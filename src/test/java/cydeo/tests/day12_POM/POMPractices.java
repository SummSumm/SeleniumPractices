package cydeo.tests.day12_POM;

import cydeo.Pages.LibraryLoginPage;
import cydeo.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setup () {
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();

    }

    @Test
    public void required_field_error_msg () {

        libraryLoginPage.signInButton.click();
        // reaching web elements through object

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.getDriver().close();



    }

    @Test
    public void invalid_email_format_error_message_test () {


        libraryLoginPage.inputUsername.sendKeys ("blablala.com");
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(LibraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        Driver.getDriver().close();
    }

    @Test
    public void library_negative_login_test () {


        libraryLoginPage.inputUsername.sendKeys("hellooooo@cupcup.com");

        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
    }

}
/*
TC #3: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password

NOTE: FOLLOW POM DESIGN PATTERN
 */