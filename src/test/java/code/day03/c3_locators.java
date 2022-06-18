package code.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.get("http://www.amazon.com");
        //find search box with id locator
        //id is always unique
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sneakers");

//to find xpath locator
//[@attribute='submit']
// tagname// shoud be single qoutation
        driver.findElement(By.xpath("//input[@attribute='submit']")).click();








    }

}
