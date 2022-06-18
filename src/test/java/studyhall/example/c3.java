package src.test.java.studyhall.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3 {
    public static void main(String[] args) {
        //find the all the links on page
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        int links=driver.findElements(By.tagName("a")).size();
        System.out.println("links = " + links);
    }
}
