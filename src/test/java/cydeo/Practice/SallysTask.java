package cydeo.Practice;

import cydeo.Utilities.ConfigurationReader;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SallysTask {


    @AfterMethod
    public void close() {
        Driver.getDriver().close();
    }

    @Test
    public void sallysTest() {
        Driver.getDriver().get("https://www.amazon.com/");
        WebElement searchBar = Driver.getDriver().findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        searchBar.sendKeys(ConfigurationReader.getProperty("searchValue"));

        List <WebElement> options = Driver.getDriver().findElements(By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
        Assert.assertTrue(options.size()==10);





      /*  options.removeIf(p-> p.getText().contains("selenium"));

        System.out.println("options.size() = " + options.size());




      /*  ArrayList <String>listt = new ArrayList<>();
        for (WebElement each : options) {
            listt.add(each.getAttribute("aria-label"));
               }
        System.out.println(listt);

      /*  WebElement each = driver.getDriver().findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[1]/div/div"));
       String text = each.getText();
        System.out.println(text.contains("searchValue"));
*/
    }
}
/*

Here follow the steps:
1-Open the browser
2-Navigate to https://www.amazon.com/
            seleniumSearch.add(element);
        }
3-Write "selenium" in the search box
4-Verify that you see 10 suggesstions as dropdown
5-Verify that all 10 suggesstions contain your search term
Optional:
6-Verify the same steps with the search term "java" (here you need to make your code dynamic)
Optional 2:
Follow the same steps for each of the browser types with same steps. Here, you will make your code more dynamic.
You will do the same test for each of the browser types but you will use the same code only.
 */