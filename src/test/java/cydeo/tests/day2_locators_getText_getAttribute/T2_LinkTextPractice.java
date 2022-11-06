package cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
        abTesting.click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
        Thread.sleep(3000);
driver.navigate().back();

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
    }
}
