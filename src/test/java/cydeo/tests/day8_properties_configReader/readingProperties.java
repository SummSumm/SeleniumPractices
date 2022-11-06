package cydeo.tests.day8_properties_configReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingProperties {

    @Test
    public void reading_from_properties_task () throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("configuration.properties");
        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.get(env) = " + properties.get("env"));

    }
}
