package code.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class c5_findElements {
//open chrome browser
    //go to apple
    //click phone
    //print out the texts of all
public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.apple.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Thread.sleep(4000);

     driver.findElement(By.xpath("//a[@href='/iphone/'][1]")).click();


    List <WebElement> alllinks=driver.findElements(By.tagName("a"));
    int LinkwithText=0;
    int LinkWithoutText=0;
    for (WebElement eachLink:alllinks) {
        String elementtoText=eachLink.getText();
        System.out.println(elementtoText);

        if (elementtoText.isEmpty()) {
            LinkWithoutText ++;

        }else {
            LinkwithText++;
        }

    }

    System.out.println("link with text= "+LinkwithText);
    System.out.println("link without text= "+ LinkWithoutText);
    System.out.println("all links= "+ alllinks.size());


}

}
