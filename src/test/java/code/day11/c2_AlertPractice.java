package code.day11;

import code.Base.TestBase2;
import code.utilities.DriverUtil;
import org.testng.annotations.Test;

public class c2_AlertPractice extends TestBase2 {
    /*
         Go to "http://the-internet.herokuapp.com/"
         click JavaScript Alerts
         Click for Js Prompt
         Enter "hello word" text
         Click okay
         Validate your text appearing on the page
         */
    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/");

    }

}
