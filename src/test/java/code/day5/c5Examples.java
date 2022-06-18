package code.day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class c5Examples {
    @BeforeClass
    public void setupClass(){System.out.println(" before class is running");}
    @AfterClass

    public void setupafterclass(){System.out.println(" after class is running ");}
    @BeforeMethod
    public void setup(){System.out.println(" before method is running");}

    @AfterMethod
    public void closing(){System.out.println(" after method is running");}

     @Test(priority = 3,dependsOnMethods = "tc3")
    public void tc1(){
         System.out.println(" test1 is running ");
     }

     @Test(priority = 1)
    public void tc3(){
         System.out.println(" tset3 is running");
         String exxpectedcar="tesla";
         String actualcar="honda";
         Assert.assertEquals(exxpectedcar,actualcar);
         System.out.println(" assertion for cars is passed,");
     }
     @Test(priority = 2)
    public void tc2(){
         System.out.println(" test2 is running");
         String country1="usa";
         String country2="usa";
         Assert.assertEquals(country1,country2);


     }
     @Ignore
     @Test
    public void tc4(){

     }

}
