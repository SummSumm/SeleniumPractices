package cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to Google
        driver.get("https://www.google.com");

        //3. Write "apple" in search box
        //4. Press Enter
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        //5.verify Title (Expected: Starts with "apple")
        String expected = "apple";
        String actualT = driver.getTitle();

        if (actualT.startsWith(expected)) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
        driver.close();

    }
}
