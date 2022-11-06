package cydeo.tests.day7_UtilityClasses;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.CRMUtility;
import cydeo.tests.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM extends TestBase {




    @Test
    public void CRM_login_test() {
        driver.get("https://login1.nextbasecrm.com");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

        BrowserUtil.VerifyTitle(driver, "Portal");
    }
    public void CRM_login_test2() {
        driver.get("https://login1.nextbasecrm.com");

        CRMUtility.crm_login(driver);

        BrowserUtil.VerifyTitle(driver, "Portal");
    }
    public void CRM_login_test3() {
        driver.get("https://login1.nextbasecrm.com");

        CRMUtility.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser");

        BrowserUtil.VerifyTitle(driver, "Portal");
    }

}


