package cydeo.tests.day1_selenium_intr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");
        System.out.println(driver.getTitle());

        if (driver.getTitle().equalsIgnoreCase("Yahoo")) {
            System.out.println("Verified");
        } else
            System.err.println("NOT verified");

    }
}
