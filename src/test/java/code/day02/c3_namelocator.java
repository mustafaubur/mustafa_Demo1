package code.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_namelocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
     //   driver.findElement(By.name("q"));
        //   WebElement searchbox=driver.findElement(By.name("q"));
        //        searchbox.sendKeys("orange");
        //
        //        Thread.sleep(1000);
        //        WebElement searchbottum=driver.findElement(By.name("btnK"));
        //        searchbox.click();



        String  expectedTitle="Orange";
        String actualTitle=driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }
        System.out.println("actual title is "+ actualTitle);


driver.close();









    }
}
