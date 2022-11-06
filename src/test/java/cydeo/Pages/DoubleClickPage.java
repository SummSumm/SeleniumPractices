package cydeo.Pages;

import cydeo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickPage {

    //CONSTRUCTOR
    public DoubleClickPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "demo")
    public WebElement textToDoubleClick;





}