package cydeo.tests.day5_TestNG_Dropdowns;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementExcp {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        deleteButton.click();

       // System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        // if we try now, it will give stale element bc it doesn't exit

        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element caught");
            System.out.println("verifies that DELETE button doesn't exist");
            System.out.println("deleteButton.isDisplayed() = false");
        }


        driver.close();
    }
}
/*
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

 */