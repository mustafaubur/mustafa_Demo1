package code.Pages;

import code.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage {
    //2. @FindBy annotation to locate webElements.
    //    -> Using this FindBy annotation, help us to locate web elements.
    //3. Create methods related webelements
@FindBy(id="ctl00_MainContent_username")
    public WebElement usernameBox;

@FindBy(xpath="//input[@id='ctl00_MainContent_userpasword']")
    public WebElement passwordBox;

@FindBy(xpath="//input[@id='ctl00_MainContent_login_button']")
    public WebElement LoginBox;
@FindBy(id="ctl00_MainContent")
public WebElement statusmesage;

public void LoginSmartBear(String username, String password){
   // usernameBox.sendKeys("hfjewflwename");
    usernameBox.sendKeys(username);
    passwordBox.sendKeys(password);
    LoginBox.click();



}
public String getStatusMessage(){

    return statusmesage.getText();
}


}
