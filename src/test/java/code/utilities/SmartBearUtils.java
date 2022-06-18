package src.test.java.code.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearUtils {

    public static void loginForSmartBear(WebDriver driver){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }
    public static void NegativeloginForSmartBear(WebDriver driver,String userID,String passwordID){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        //invalid user id
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        //invalid password id
        password.sendKeys(passwordID);
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }

    public static void verifyStreet(WebDriver driver, String streetName){
       //  //table[@id='ctl00_MainContent_orderGrid']//tr= parent to child method
        //table[@id='ctl00_MainContent_orderGrid']=====all table
        ////table[@id='ctl00_MainContent_orderGrid']//tr[4]===locate 4.th row
        ////table[@id='ctl00_MainContent_orderGrid']//tr//td[6]==locate all steet
        List<WebElement> streetList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]))"));
        for (WebElement eachStret:streetList){
            if (eachStret.getText().equals(streetName)){
                Assert.assertTrue(eachStret.getText().equals(streetName));
                return;
            }
        }
        Assert.fail("street name : "+streetName + "is not present on table");
    }
    @Test
    public void TC1_streetver1(){

    }
    @Test
    public void TC2_streetver2(){


    }








}
