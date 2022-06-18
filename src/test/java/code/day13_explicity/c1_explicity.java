package code.day13_explicity;

import code.Base.TestBase2;
import code.utilities.DriverUtil;
import org.testng.annotations.Test;

public class c1_explicity extends TestBase2 {

//go tto http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
    //click on timer
    //verify "WebDriver" text present

    @Test
    public void TC1(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
    }
}
