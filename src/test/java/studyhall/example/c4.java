package src.test.java.studyhall.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("#email")).sendKeys("David");
       // driver.findElement(By.cssSelector("input#email")).sendKeys("David");
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("mustafa");
      //  driver.findElement(By.cssSelector(".inputtext")).sendKeys("mustafa");


    }
}
