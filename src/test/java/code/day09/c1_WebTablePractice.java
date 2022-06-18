package src.test.java.code.day09;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.test.java.code.utilities.SmartBearUtils;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void TC1_streetver1(){
        SmartBearUtils.loginForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Order");
    }
    @Test(dataProvider = "TestDataForStreetName")
    public void TC2_streetver2(){
        SmartBearUtils.loginForSmartBear(driver);
        String streetName;
       // SmartBearUtils.verifyStreet(driver,streetName);

    }
    @DataProvider(name= "TestDataForStreetName")
    public static Object [][] test(){
        return new Object[][]{
                {"17, Park Aveneu"},
                {"vhgvbkbkkkbb"},
        };
    }



}
