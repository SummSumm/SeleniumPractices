package cydeo.tests.day1_selenium_intr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //setting up web driver
        WebDriverManager.chromedriver().setup();

        //create instance of web driver Chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
}
