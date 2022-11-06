package cydeo.tests.day1_selenium_intr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1. Set the browser driver up
        WebDriverManager.chromedriver().setup();

        //2. Create instance of the Selenium WebDriver
        // This one opens an empty Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3. Go to a website
        driver.get("https://www.tesla.com");

        // slow things down with Thread (3 seconds)
        Thread.sleep(3000);

        // to go back
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.close();

    }
}
