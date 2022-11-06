package cydeo.tests.day3_CSSSelector_xpath;

import cydeo.Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_LocatorsReview {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        //go to the address
        driver.get("https://login1.nextbasecrm.com");

        // enter incorrect username and incorrect password
        WebElement userName = driver.findElement(By.name("USER_LOGIN"));
        userName.sendKeys("incorrect");
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");


        //click login
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();
        Thread.sleep(3000);

        // verify error message: Incorrect login or password
WebElement errorMsg = driver.findElement(By.className("errortext"));
String expected = "Incorrect login or password";
String actual = errorMsg.getText();

if (actual.equals(expected)) {
    System.out.println("login verification PASSED");
} else {
    System.out.println("Login verification FAILED");
}
        driver.close();
    }
}
