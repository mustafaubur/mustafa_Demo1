package code.day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class TNG_Example {
    @BeforeClass
    public void setupClass(){System.out.println(" before class is running");}
    @AfterClass

    public void setupafterclass(){System.out.println(" after class is running ");}
    @BeforeMethod
    public void setup(){System.out.println(" before method is running");}

    @AfterMethod
    public void closing(){System.out.println(" after method is running");}


    @Test(priority = 3)
    public void Tstc1(){
        System.out.println(" test 1 is run");
    }
    @Test(priority = 1)
    public void Tstc3(){
        System.out.println("test3 is running");

        String actualState="newyork";
        String expectedState="ontario";
        Assert.assertEquals(actualState,expectedState);

    }
    @Test(priority = 2)
    public void test2(){
        System.out.println(" test2 is running ");
        String name1="oscar";
        String name2="oscar";
        Assert.assertEquals(name1,name2);
    }
}
