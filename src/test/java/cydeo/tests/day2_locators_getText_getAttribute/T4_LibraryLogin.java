package cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLogin {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. go to Cydeo Library
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. enter username: incorrect@email.com
        WebElement name = driver.findElement(By.className("form-control"));
        name.sendKeys("incorrect@email.com");
        //4. enter password: incorrectpassword
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");
        //5. click on sign in button
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        //6. Verify VISIALLY "Sorry, Wrong Email or Password" is displayed

driver.close();

    }
}
