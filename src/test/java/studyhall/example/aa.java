package src.test.java.studyhall.example;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class aa {
    WebDriver driver;
    @Test
    public void TC1(){
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.swtestacademy.com/category/test-automation/");
        driver.findElement(By.xpath("//*[@id=\"menu-item-844\"]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-7674\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-item-7674\"]")).click();
        driver.findElement(By.linkText("<a href=\"https://www.swtestacademy.com/category/test-automation/ui-automation/selenium/\">Selenium</a>\n")).click();
    }
}
