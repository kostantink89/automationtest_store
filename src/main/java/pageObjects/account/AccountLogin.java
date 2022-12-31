package pageObjects.account;

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

    public CreateAccount getContinueButton() {
        driver.findElement(continueButton).click();
        return new CreateAccount(driver);
    }

    public AccountLogin login(String enterYourLogin, String enterYourPassword) {
        driver.findElement(loginName).sendKeys(enterYourLogin);
        driver.findElement(password).sendKeys(enterYourPassword);
        return this;
    }

    public AccountLogin enterPassword(String setPassword) {
        driver.findElement(password).sendKeys(setPassword);
        return this;
    }

    public MyAccountPage clickOnLoginButton() {
        driver.findElement(loginButton).click();
        return new MyAccountPage(driver);
    }


}
