package code.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com/");

        WebElement gmailButton=driver.findElement(By.linkText("Gmail"));//here we store element in "WebElement".
        System.out.println("gmailButton.getText() = " + gmailButton.getText());
        System.out.println("gmailButton href attribute value = " + gmailButton.getAttribute("href"));
    }
}
