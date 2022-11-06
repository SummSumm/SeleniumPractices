package cydeo.tests.day9_JavaFakerPractice;

public class singleton {

    private singleton () {}

    private static String word;

    public static String getWord() {

        if (word==null) {
            System.out.println("First time call. Assigning value now");
            word = "Vegan";
        } else
            System.out.println("word already has value");

        return word;
    }
}
