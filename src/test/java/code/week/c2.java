package code.week;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class c2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchbox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchbox.sendKeys("iphone");
        searchbox.submit();
        List<WebElement> alllinks=driver.findElements(By.tagName("a"));
       int linkwithText=0;
       int linkWithouttet=0;
        for (WebElement each:alllinks
             ) {
            String elementToText= each.getText();
            System.out.println("element to text"+elementToText);
            if (elementToText.isEmpty()){
               linkWithouttet++;
            }else {
                linkwithText++;
            }
            System.out.println("without text " + linkwithText);
            System.out.println("with text "+ linkWithouttet);
            System.out.println("all links "+ alllinks);
        }



    }
}
