package code.day5;

import org.testng.annotations.*;

public class TNG_practice {
    @BeforeClass
    public void setupClass(){System.out.println(" before class is running");}
    @AfterClass

    public void setupafterclass(){System.out.println(" after class is running ");}
    @BeforeMethod
    public void setup(){System.out.println(" before method is running");}

    @AfterMethod
    public void closing(){System.out.println(" after method is running");}

    @Test
    public void test1(){
        System.out.println(" test 1 is running");}
    @Test
    public void test2(){
        System.out.println(" test2 is running");
    }

    @Test
    public void test3(){
        System.out.println(" test3 is running");
    }
}
