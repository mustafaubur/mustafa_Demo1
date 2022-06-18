package src.test.java.code.day08;

import code.utilities.WebDriverUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import src.test.java.code.utilities.SmartBearUtils;

import java.util.concurrent.TimeUnit;

public class c4_smartbearNegativeTesting {
    //1- Open a chrome browser
//2- Go to://1- Open a chrome browser
////2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
////3- enter incorrect username
////4- enter wrong password
////5- click login button
////6- verify error message displayed :Invalid Login or Password.
////Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
////this method should cover step3,4,5
//3- enter incorrect username
//4- enter wrong password
//5- click login button
//6- verify error message displayed :Invalid Login or Password.
//Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
//this method should cover step3,4,5

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @Test(dataProvider = "testData")
    public void TC1(String userID, String passwordID){
        SmartBearUtils.NegativeloginForSmartBear(driver,userID,passwordID );

    }
    @DataProvider(name="testData")
    public static Object[][] wrongUserCredentials(){

        return new Object[][]{

                {"Ali","CAN7"},
                {"bora", "bora.2"},
                {"eyup", "eyup.54"},
                {"Eda", "eda.43"},
                {"Tester", "test"}   };
    }
}
