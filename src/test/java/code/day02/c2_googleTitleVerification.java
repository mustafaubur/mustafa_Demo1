package code.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_googleTitleVerification {
    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();// make screen maximum
       Thread.sleep(2000);
        driver.get("https://www.google.com");

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification has passed");
        } else {
            System.out.println(" Google title verification failed ");

        }
        System.out.println("actualTitle = " + actualTitle);
        driver.close();





    }
}
