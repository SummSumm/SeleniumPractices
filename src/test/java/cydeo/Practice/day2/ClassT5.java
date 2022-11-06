package cydeo.Practice.day2;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassT5 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://practice.cydeo.com/registration_form");

        String expectedHeader = "Registration form";
        String actualHeader = driver.findElement(By.tagName("h2")).getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Verification PASSED");
        } else {
            System.out.println("Header Verification FAILED");
        }

        driver.close();

    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to:
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first nam
 */