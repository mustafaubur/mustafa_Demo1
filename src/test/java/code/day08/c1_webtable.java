package src.test.java.code.day08;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import src.test.java.code.utilities.SmartBearUtils;

import java.util.concurrent.TimeUnit;

public class c1_webtable {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3.Login
        SmartBearUtils.loginForSmartBear(driver);
    }
    @AfterMethod
    public void closing(){
        //BrowserUtil.
    }
   @Test
    public void TC1(){
      // WebElement markStret=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[6]"));
       WebElement markStret=driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
       System.out.println("mark stretname: "+ markStret.getText());

       String actualstret=markStret.getText();
       String expectedstret="9,Maple Valley";

       Assert.assertEquals(actualstret,expectedstret,"has failed");



   }

}