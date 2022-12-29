package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

    private WebDriver driver;

    public CreateAccount(WebDriver driver) {
        this.driver = driver;
    }


    private By firstName = By.id("AccountFrm_firstname");
    private By lastName = By.id("AccountFrm_lastname");
    private By email = By.id("AccountFrm_email");

    private By telephone = By.xpath("//input[@name='telephone']");

    private By company = By.xpath("//input[@name='company']");

    private By address = By.xpath("//input[@name='address_1']");

    private By city = By.xpath("//input[@name='city']");

    private By region = By.xpath("//select[@name='zone_id']");

    private By zipCode = By.xpath("//input[@name='postcode']");

    private By country = By.xpath("//select[@name='country_id']");

    private By loginName = By.xpath("//input[@name='loginname']");

    private By password = By.id("AccountFrm_password");

    private By confirmPassword = By.id("AccountFrm_confirm");

    private By subscribeYesButton = By.id("AccountFrm_newsletter1");

    private By subscribeNoButton = By.id("AccountFrm_newsletter0");

    private By agreeCheckBox = By.xpath("//input[@name='agree']");

    private By continueButton = By.xpath("//button[@title='Continue']");

    public void setFirstName(String value) {
        driver.findElement(firstName).sendKeys(value);
    }

    public void setLastName(String value) {
        driver.findElement(lastName).sendKeys(value);
    }

    public void setEmail(String text) {
        driver.findElement(email).sendKeys(text);
    }

    public void setTelephone(String phone) {
        driver.findElement(telephone).sendKeys(phone);
    }

    public void setCompany(String enterCompany) {
        driver.findElement(company).sendKeys(enterCompany);
    }

    public void setAddress(String enterAddress) {
        driver.findElement(address).sendKeys(enterAddress);
    }

    public void setCity(String enterCity) {
        driver.findElement(city).sendKeys(enterCity);
    }

    public void setRegion(String country) {
        Select var = new Select(driver.findElement(region));
        var.selectByValue(country);
    }

    public void setZipCode(String enterZipCode) {
        driver.findElement(zipCode).sendKeys(enterZipCode);
    }

    public WebElement setCountry() {
        return driver.findElement(country);
    }

    public void enterLoginName(String enterLoginName) {
        driver.findElement(loginName).sendKeys(enterLoginName);
    }

    public void setPassword(String enterPassword) {
        driver.findElement(password).sendKeys(enterPassword);
    }

<<<<<<< HEAD
=======
    public void setConfirmedPassword(String enterConfirmPassword) {
        driver.findElement(password).sendKeys(enterConfirmPassword);
    }

    public void setSubscribeYes() {
        driver.findElement(subscribeYesButton).click();
    }

    public void setSubscribeNo() {
        driver.findElement(subscribeNoButton).click();
    }

    public void clickOnAgreeCheckBox() {
        driver.findElement(agreeCheckBox).click();
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }


>>>>>>> createAccount
}
