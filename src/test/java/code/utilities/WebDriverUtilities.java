package code.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtilities {
    public static void main(String[] args) {
        //create  a util that takes browser type and create connection between browser and selenium
        getDriver("");

    }
    public static WebDriver getDriver(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            //chrome browser needs to be set up
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("browser is not exist!!!");
            System.out.println("browser = " + browser);
            return null;
        }

    }




}
