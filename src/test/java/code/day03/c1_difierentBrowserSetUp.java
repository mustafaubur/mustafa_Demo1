package code.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c1_difierentBrowserSetUp {
    public static void main(String[] args) {
        //firefox browser set up, i need to have firefox in my intelij
       // WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();
        //driver.get("http://www.google.com/");

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("http://www.google.com/");






























    }
}
