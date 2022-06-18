package code.day11;

import code.Base.TestBase2;
import code.utilities.BrowserUtil;
import code.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import src.test.java.code.utilities.PropetiesReadingUtil;


public class c1_driverUtilPractice extends TestBase2 {


    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropetiesReadingUtil.getProperties("google"));
        WebElement searchbox= DriverUtil.getDriver().findElement(By.name("q"));
        String searchItem=PropetiesReadingUtil.getProperties("google_search_data");
        searchbox.sendKeys(searchItem + Keys.ENTER);
        BrowserUtil.wait(5);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));

    }

}
