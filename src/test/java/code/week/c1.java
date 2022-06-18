package code.week;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class c1 {

    @Test
    public void tc2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.etsy.com/");
        WebElement searchbox=driver.findElement(By.id(" global-enhancements-search-query"));
        searchbox.sendKeys("earrings");


    }

}
