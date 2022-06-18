package code.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazontitleVerification {

    //Task - 2
//Open Chrome Chrome_my
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.google.com
//Verify title contains : Smile


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
driver.manage().window();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com");
        String titlecontaainssmile="Smile";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(titlecontaainssmile)){
            System.out.println("amazon title contain is passed, smile");
        }else {
            System.out.println("not passed,failed ");
        }
        System.out.println("Actiual title is "+ actualTitle);
         driver.close();

    }
}
