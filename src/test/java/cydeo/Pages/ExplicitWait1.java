package cydeo.Pages;

import cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWait1 {

    public ExplicitWait1() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "form#checkbox-example > button")
    public WebElement removeButton;

    @FindBy (css = "div#loading")
    public WebElement loadingSign;

    @FindBy (css = "p#message")
    public WebElement goneMessage;

    @FindBy (linkText = " A checkbox")
    public WebElement checkbox;

    @FindBy (css = "button[onclick='swapInput()']")
    public WebElement enableButton;

    @FindBy (css = "input[type='text']")
    public WebElement inputBox;

}