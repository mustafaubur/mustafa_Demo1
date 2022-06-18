package code.Base;

import code.utilities.BrowserUtil;
import code.utilities.WebDriverUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class TestBase00 {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtilities.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtil.wait(3);
       // driver.close();
    }
}
