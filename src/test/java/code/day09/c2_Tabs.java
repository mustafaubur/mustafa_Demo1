package code.day09;

import code.Base.TestBase00;
import code.utilities.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase00 {
    @Test
    public void TC1_TabHandle(){
        //navigate to url https://renas-practice.herokuapp.com/home
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on element
        driver.findElement(By.id("selenium-Elements")).click();
        BrowserUtil.wait(4);
        driver.findElement(By.id("WindowsII")).click();
        //this is store
       String currentWindow= String.valueOf(driver.getWindowHandles());
        System.out.println("current window= "+ currentWindow);
        System.out.println("current title: "+ driver.getTitle());
        WebElement openbutton=driver.findElement(By.id("open-tab"));
        openbutton.click();
        System.out.println("title: "+ driver.getTitle());
        Set<String> alltabs=driver.getWindowHandles();//wil store all tabs
        for (String tab:alltabs
             ) { driver.switchTo().window(tab);
            BrowserUtil.wait(1);
            System.out.println(driver.getTitle());

        }
    }
}
