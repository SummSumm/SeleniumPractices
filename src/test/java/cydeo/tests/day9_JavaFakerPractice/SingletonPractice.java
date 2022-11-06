package cydeo.tests.day9_JavaFakerPractice;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 2)
    public void singleton_test() {
        String str1 = singleton.getWord();
        System.out.println("str1 = " + str1);

        String str2 = singleton.getWord();
        System.out.println("str2 = " + str2);

        String str3 = singleton.getWord();
        System.out.println("str3 = " + str3);
    }

    @Test(priority = 1)
    public void singleton_test2 () {
        String str4 = singleton.getWord();
        System.out.println("str4 = " + str4);
    }
}
