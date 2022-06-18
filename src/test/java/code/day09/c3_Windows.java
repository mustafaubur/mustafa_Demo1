package code.day09;

import code.Base.TestBase00;
import code.utilities.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase00 {
    @Test
    public void TC1_multiwindows(){
       driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
//click on windows
        BrowserUtil.wait(4);
        driver.findElement(By.id("WindowsII")).click();

//this will store current and only one window
        String currentWindow= driver.getWindowHandle();

        System.out.println("current window= "+currentWindow);
        System.out.println("current title= "+driver.getTitle());
        WebElement openbutton=driver.findElement(By.id("open-window"));
        openbutton.click();
        
        Set<String> allwindows=driver.getWindowHandles();
        List<String> windowList=new ArrayList<>();
        for (String newwindow:allwindows
             ) {
            windowList.add(newwindow);
            driver.switchTo().window(newwindow);
            System.out.println("current title is"+ driver.getTitle());
            
        }
      driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
    }

}
