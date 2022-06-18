package src.test.java.code.day10;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c1_properties_practice {// this is like advanced utilities
    @Test
    public void TC1_System_Properties(){
        System.out.println(System.getProperty("os.name"));
    }
    @Test
    public void configurationProperties() throws FileNotFoundException {
        // to be able to make our Code understand properties file, you need to connect the file.
        Properties properties=new Properties();
        // this is a path for configuration properties
        String pathforPropertiesFile="configuration.properties";
        // the compiler to open the file
        FileInputStream fileinputstream= new FileInputStream(pathforPropertiesFile);
        try {
            properties.load(fileinputstream);
            //file need to bbbe load in automation framework
        } catch ( IOException e){
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
    }

}
