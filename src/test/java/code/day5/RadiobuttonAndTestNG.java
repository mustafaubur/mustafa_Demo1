package code.day5;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadiobuttonAndTestNG {
    public static void main(String[] args) {

        WebDriver driver=WebDriverUtilities.getDriver("chrome");
        driver.get("http://courses.letskodeit.com/practice");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector(input[id='bmwradio']))
        WebElement bmwradiobutton=driver.findElement(By.xpath("//input[@id='bmwradio']"));
        bmwradiobutton.click();
        boolean bmwradioselected=bmwradiobutton.isSelected();



         if (bmwradioselected){
             System.out.println("bmwradiobutton is selected = ");
         } else {
             System.out.println("not selected");
         }

          //Verify that Honda is not selected
        WebElement hondabutton=driver.findElement(By.xpath("//input[@id='hondaradio'] "));
        boolean hondaisselected=hondabutton.isSelected();
         if (hondaisselected){
             System.out.println("hondaisselected = " + hondaisselected);
         } else {
             System.out.println(" honda is not selected and verification is fast = ");
         }




    }
}
