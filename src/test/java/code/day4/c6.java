package code.day4;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class c6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/radio.html");




        WebElement checkbox1=driver.findElement(By.id("'vfb-6-0'"));
        checkbox1.click();
        if (checkbox1.isSelected()){
            System.out.println("is selected");
        }else {
            System.out.println("not slected");
        }
        Thread.sleep(4000);
        driver.quit();

    }
}
