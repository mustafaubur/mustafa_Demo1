package code.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelectorAndImplicitwait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("bug spray");
      //  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("cookie");

        //# is an id in css.
      driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("TV");




    }

}
