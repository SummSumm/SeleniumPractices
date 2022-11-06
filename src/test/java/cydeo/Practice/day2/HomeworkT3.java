package cydeo.Practice.day2;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeworkT3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://google.com");
        driver.findElement(By.cssSelector("a.gb_1.gb_2.gb_9d.gb_9c")).click();

        Thread.sleep(2000);

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        String expectedBackTitle= "Google";
        String actualBackTitle = driver.getTitle();

        if (actualBackTitle.equals(expectedBackTitle)) {
            System.out.println("Main Page Title verification PASSED");
        } else {
            System.out.println("Main Page Title verification FAILED");
        }
        driver.close();
    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */