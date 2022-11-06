package cydeo.tests.day9_JavaFakerPractice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    @Test

    public void Test1 () {
      //  create obj to reach methods
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());

        System.out.println(faker.numerify("###-###-##9#"));
        System.out.println(faker.letterify("??????????"));
        System.out.println(faker.bothify("06-???-###")); // plaka gibi
        System.out.println(faker.finance().creditCard());

        System.out.println((faker.chuckNorris().fact()).replaceAll("Chuck Norris", "Muhtar"));

    }
}
