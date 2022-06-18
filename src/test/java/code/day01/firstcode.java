package src.test.java.code.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstcode {
    public static void main(String[] args) {
        System.out.println("hello world");
        WebDriverManager.chromedriver().setup();
        //created a driver instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        /*LF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
        SLF4J: Defaulting to no-operation (NOP) logger implementation
        SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
        Starting ChromeDriver 100.0.4896.60 (6a5d10861ce8de5fce22564658033b43cb7de047-refs/branch-heads/4896@{#875}) on port 50811
        Only local connections are allowed.
                Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
        ChromeDriver was started successfully.
        May 06, 2022 6:41:01 PM org.openqa.selenium.remote.ProtocolHandshake createSession
        INFO: Detected dialect: W3C
        May 06, 2022 6:41:01 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
        INFO: Found exact CDP implementation for version 100
*/


    }
}
