package code.day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
    @BeforeMethod
    public void setup(){
        System.out.println(" hello Selenium  before method");
    }
    @AfterMethod
    public void closing(){
        System.out.println(" after method is running");
    }
    @Test
    public void TstC_1(){
        System.out.println(" test--1 is running ");
    }
    @Test
    public void Tst_2(){
        System.out.println(" test--2 is running");
    }
}
