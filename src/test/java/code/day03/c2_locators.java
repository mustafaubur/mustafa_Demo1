package code.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");


        //click to gmail on the top right
        //to find with Linktext locator
       // driver.findElement(By.linkText("Gmail")).click();

        //driver.findElement(By.partialLinkText("Gm"));
        driver.findElement(By.className("gb_d")).click();



    }
}
