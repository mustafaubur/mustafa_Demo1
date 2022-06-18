package src.test.java.code.day08;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c3_iFrame {
    //1- Open a chrome browser
//2- Go to:http://the-internet.herokuapp.com/iframe



    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/iframe");

    }
    @Test
    public void TC_frame() throws InterruptedException {
        //3- Switching by id or name attribute value.
        //there are 3 ways to switch: id/name, index, webelement
        driver.switchTo().frame("mce_0_ifr");
       WebElement box= driver.findElement(By.id("tinymce"));
       box.clear();//firs we need to .clear() then we will sendkey("");
       box.sendKeys("helloooo");

       //in order to return main html use this wethod
       driver.switchTo().defaultContent();
       //in order to return privius frame use driver.switchto().parentFrame
       // http://the-internet.herokuapp.com/iframe
        Thread.sleep(2000);
        driver.close();

    }




}
