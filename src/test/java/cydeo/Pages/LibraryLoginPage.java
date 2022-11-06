package cydeo.Pages;

import cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

        //#1- initialize the driver instance and object of the class
        public LibraryLoginPage(){
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.
         */
            PageFactory.initElements(Driver.getDriver(), this);
        }


        //#2- use @FindBy annotation to locate web elements

        @FindBy(xpath = "//input[@id='inputEmail']")
        public WebElement inputUsername;

        @FindBy(id = "inputPassword")
        public WebElement inputPassword;

        @FindBy(xpath = "//button[.='Sign in']")
        public WebElement signInButton;

        @FindBy(xpath = "//div[.='This field is required.']/div")
        public WebElement fieldRequiredErrorMessage;

        @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
        public static WebElement enterValidEmailErrorMessage;

        @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
        public WebElement wrongEmailOrPasswordErrorMessage;
}
/*
TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.

NOTE: FOLLOW POM DESIGN PATTER
 */