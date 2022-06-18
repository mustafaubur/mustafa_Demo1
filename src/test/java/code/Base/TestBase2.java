package code.Base;

import code.utilities.BrowserUtil;
import code.utilities.DriverUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {
    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closing(){
        BrowserUtil.wait(5);
        //DriverUtil.closedriver();
    }
}
