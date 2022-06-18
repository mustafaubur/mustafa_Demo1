package code.day08;

import code.utilities.BrowserUtil;
import code.utilities.WebDriverUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c2_Alerts {

    //click on elements
    //locate the alert button to click it
    //click button
    //handle alert
    WebDriver driver;
    @BeforeMethod

    public void setup(){
        //1- Open a chrome browser
        //2- Go to:https://renas-practice.herokuapp.com/home
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");

    }
    @Test
    public void TC1_AlertPracticce(){
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();
       WebElement alertbutton= driver.findElement(By.id("alert-demo"));
       alertbutton.click();
        //handle this alert
// first switch to alert then handle it
        Alert alert=driver.switchTo().alert();
        BrowserUtil.wait(2);
        alert.accept();
        alertbutton.click();
        BrowserUtil.wait(4);
        alert.dismiss();

    }
}
