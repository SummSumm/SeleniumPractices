package cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMUtility {
    public static void crm_login (WebDriver driver) {
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();
    }

    public static void crm_login (WebDriver driver, String userName, String Password) {
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        inputUsername.sendKeys(userName);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(Password);

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();
    }
}
