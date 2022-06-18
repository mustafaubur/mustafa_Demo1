package code.day4;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class c4_checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/radio.html");


        List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
        int checkboxisselected=0;
        int checkboxisNotselected=0;


        for (WebElement each:allcheckbox){
            System.out.println(each);
            if (each.isSelected()){
                checkboxisselected++;

            }else {
                checkboxisNotselected++;
            }

        }  System.out.println("is not selected: "+checkboxisNotselected);
        System.out.println("selected: "+checkboxisselected);


    }
}
