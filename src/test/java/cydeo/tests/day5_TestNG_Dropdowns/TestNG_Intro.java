package cydeo.tests.day5_TestNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {


    @BeforeMethod
    public void setupMethod (){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void  TearDownMethod (){
        System.out.println("after method is running");
        System.out.println("----------------------------");
    }

    @Test
    public void Test1 () {
        System.out.println("Test1 is running");
        Assert.assertEquals("actual", "actual");
    }

    @Test
    public void Test2 (){
        System.out.println("Test 2 is running");

        Assert.assertTrue(5==7);
    }
}
