package cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to Cydeo Reg Form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify Header Text
        // Expected: Registration form
        WebElement headerText = driver.findElement(By.tagName("h2"));
        String actualH = headerText.getText();
        String expectedH = "Registration form";

        if (actualH.equals(expectedH)) {
            System.out.println("Header Test PASSED");
        } else {
            System.out.println("Header Test FAILED");
        }

        //4. Locate First Name  input box
        WebElement firstN = driver.findElement(By.name("firstname"));

        //5. Verify placeholder says "first name"

        String expectedPH = "first name";
        String actualPH = firstN.getAttribute("placeholder");

        if (actualPH.equals(expectedPH)) {
            System.out.println("Placeholder Test PASSED");
        } else {
            System.out.println("Placeholder Test FAILED");
        }

        driver.close();
    }
}
