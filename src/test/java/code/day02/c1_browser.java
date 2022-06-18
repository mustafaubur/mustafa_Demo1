package code.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_browser {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();// to maximize browser page

        System.out.println("Title is  = " + driver.getTitle());// to get title
        // to get URL
        System.out.println("current URL= "+ driver.getCurrentUrl());



        driver.get("https://www.tesla.com/");
        // driver closed pages
        Thread.sleep(3000);
        driver.close();


    }


}
