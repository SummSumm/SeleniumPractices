package cydeo.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTableUtility {

    public static String returnOrderDate (WebDriver driver, String customerName) {
        String DateLocator = "//table[@id='ctl00_MainContent_orderGrid']//td[.='" + customerName +"']/following-sibling::td[3]";

        String date = driver.findElement(By.xpath(DateLocator)).getText();

        return date;
    }

    public static void orderVerify (WebDriver driver, String customerName, String expectedOrderDate) {

        String actualDate = returnOrderDate(driver, customerName);
        Assert.assertEquals(actualDate, expectedOrderDate);
    }
}
/*
Method #2 info:
• Name: orderVerify ()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String costumerName
• Arg3: String expectedOrderDate
This method should accept above mentioned arguments and internally assert
expectedOrderDate matching actualOrderDate

Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.

 */