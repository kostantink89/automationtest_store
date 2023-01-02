package pageObjects.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.checkout.CheckOutConfirmation;

public class AccountLogin {

    private WebDriver driver;

    WebElement element;


    public AccountLogin(WebDriver driver) {
        this.driver = driver;
    }

    private By accountLoginText = By.xpath("//span[@class='maintext']");
    private By newCustomerText = By.xpath("//h2[text()='I am a new customer.']");

    private By continueButton = By.xpath("//button[@type='submit'][@title='Continue']");

    private By loginName = By.id("loginFrm_loginname");
    private By password = By.id("loginFrm_password");

    private By loginButton = By.xpath("//button[@type='submit'][@title='Login']");

    private By guestCheckOut = By.id("accountFrm_accountguest");

    private By TShirts = By.cssSelector("li:nth-of-type(2) > a > img");


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

    public CheckOutConfirmation clickOnLoginButton() {
        WebElement element = driver.findElement(loginButton);
        element.click();
        return new CheckOutConfirmation(driver);
    }

    public WebElement getGuestCheckOutButton() {
        element = driver.findElement(guestCheckOut);
        element.click();
        return element;
    }

    public WebElement clickOnContinueButton() {
        element = driver.findElement(continueButton);
        element.click();
        return element;
    }


}
