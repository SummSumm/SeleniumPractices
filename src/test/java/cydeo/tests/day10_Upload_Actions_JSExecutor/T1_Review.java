package cydeo.tests.day10_Upload_Actions_JSExecutor;

import com.github.javafaker.Faker;
import cydeo.Utilities.ConfigurationReader;
import cydeo.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Review {

    @Test
    public void Day10T1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Faker faker = new Faker();
        Driver.getDriver().findElement(By.xpath("//input [@name='firstname']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input [@name='lastname']")).sendKeys(faker.name().lastName());

        String fakeUserName = faker.name().firstName();
        Driver.getDriver().findElement(By.xpath("//input [@name='username']")).sendKeys(fakeUserName);

        while (fakeUserName.length()<7) {
        Driver.getDriver().findElement(By.xpath("//input [@name='username']")).sendKeys(fakeUserName);
        break;}

        Driver.getDriver().findElement(By.xpath("//input [@name='email']")).sendKeys(faker.internet().emailAddress());
        Driver.getDriver().findElement(By.xpath("//input [@name='password']")).sendKeys(faker.internet().password());
        Driver.getDriver().findElement(By.xpath("//input [@name='phone']")).sendKeys(faker.numerify("571-###-####"));

        int index = faker.number().numberBetween(1, 3);
        Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[" + index +"]/label/input")).click();
        Driver.getDriver().findElement(By.xpath("//input [@name='birthday']")).sendKeys("12/12/2003");

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select [@name='department']")));
        select.selectByIndex(faker.number().numberBetween(1, 9));


        Select select2 = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select2.selectByIndex(faker.number().numberBetween(1, 9));

       Driver.getDriver().findElement(By.xpath("//input [@value='java']")).click();

        Driver.getDriver().findElement(By.xpath("//button [@id='wooden_spoon']")).click();

        Driver.getDriver().close();
    }

}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.


Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */