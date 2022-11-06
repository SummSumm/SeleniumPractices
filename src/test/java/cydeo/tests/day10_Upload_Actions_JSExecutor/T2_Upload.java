package cydeo.tests.day10_Upload_Actions_JSExecutor;

import cydeo.Utilities.BrowserUtil;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload {
    @Test
    public void test2 () {
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        String path= "C:\\Users\\Sumeyye\\Desktop\\featured.png";

        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtil.sleep(2);
        fileUpload.sendKeys(path);

        Driver.getDriver().findElement(By.xpath("//input[@value='Upload']")).click();

        WebElement uploaded= Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(uploaded.isDisplayed());

        Driver.getDriver().close();


    }
}
/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page


 */