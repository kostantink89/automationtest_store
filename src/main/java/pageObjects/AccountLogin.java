package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {

    private WebDriver driver;


    public AccountLogin(WebDriver driver) {
        this.driver = driver;
    }

    private By accountLoginText = By.xpath("//span[@class='maintext']");
    private By newCustomerText = By.xpath("//h2[text()='I am a new customer.']");

    private By continueButton = By.xpath("//button[@type='submit'][@title='Continue']");

    private By loginName = By.id("loginFrm_loginname");
    private By password = By.id("loginFrm_password");

    private By loginButton = By.xpath("//button[@type='submit'][@title='Login']");

    public WebElement getAccountLoginText() {
        return driver.findElement(accountLoginText);

    }

    public WebElement newCustomerText() {
        return driver.findElement(newCustomerText);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }

    public void setLoginName(String text) {
        driver.findElement(loginName).sendKeys(text);
    }

    public void setPassword(String text) {
        driver.findElement(password).sendKeys(text);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }


}
