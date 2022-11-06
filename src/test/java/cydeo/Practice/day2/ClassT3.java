package cydeo.Practice.day2;

import cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ClassT3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("https://google.com");

       driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("apple" + Keys.ENTER);
       driver.getTitle();

       String expectedT = "apple";
       String actualT = driver.getTitle();

       if (actualT.startsWith(expectedT)) {
           System.out.println("Search Title verification PASSED");
       } else {
           System.out.println("Search Title verification FAILED");
       }

       driver.close();


    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button
5- Verify title:
Expected: Title should start with “apple” wor
 */
