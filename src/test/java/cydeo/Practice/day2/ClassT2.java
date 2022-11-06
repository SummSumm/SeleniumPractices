package cydeo.Practice.day2;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassT2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://practice.cydeo.com");

        driver.findElement(By.linkText("A/B Testing")).click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Test PASSED");
        } else {
            System.out.println("Title Test FAILED");
        }

        driver.navigate().back();

        String expectedTitle2= "Practice";
        String actualTitle2 =  driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Title Test PASSED");
        } else {
            System.out.println("Title Test FAILED");
        }


driver.close();



    }
}
/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
 */