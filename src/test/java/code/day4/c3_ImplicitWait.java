package code.day4;

import code.utilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class c3_ImplicitWait {

    public static void main(String[] args) {
     WebDriver driver=WebDriverUtilities.getDriver("chrome");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");








    }




}
