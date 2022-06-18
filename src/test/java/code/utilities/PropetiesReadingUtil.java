package src.test.java.code.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropetiesReadingUtil {
    private static Properties properties=new Properties();
    //encaapsulationmethod data hiding
    static {
        //will execute before everything
        //get the path and store in a string
        String pathForPropertiesFile="configuration.properties";
        //open the file use fileinputstream method
        try {
            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
      // we need to load the file to properties object by using load method
            properties.load(fileInputStream);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Properties file not found");
        }
    }
    public static String getProperties(String keyword){//its like get method from java
        return properties.getProperty(keyword);
    }
}
