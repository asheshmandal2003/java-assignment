package file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Q9 {
    public void readPropertiesFile() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
