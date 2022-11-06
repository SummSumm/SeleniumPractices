package cydeo.Practice.day2;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeworkT2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTitle = "Log in to ZeroBank";
        String actualTitle = driver.findElement(By.tagName("h3")).getText();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Header verification PASSED");
        } else {
            System.out.println("Header verification FAILED");
        }

        driver.close();




    }
}

/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */