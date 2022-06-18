package src.test.java.studyhall.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_AmazonTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");






       WebElement searchBox=driver.findElement(By.name("search_query"));
       searchBox.sendKeys("T-shirt");
       WebElement searchButton=driver.findElement(By.name("submit_search"));
       searchButton.click();

       driver.findElement(By.name("search_query")).sendKeys("T-shirt"+ Keys.ENTER);

       String expectedTitle="Search - My Store";
       String actualtitle=driver.getTitle();

       if (expectedTitle.equals(actualtitle)){
           System.out.println(" expected: "+ expectedTitle +"  actual:"+ actualtitle);
           System.out.println(" passed= ");
       }else {
           System.out.println("failed = ");
           System.out.println(" expected: "+ expectedTitle +"  actual:"+ actualtitle);
       }





    }
}
