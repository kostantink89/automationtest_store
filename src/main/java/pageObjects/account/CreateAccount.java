package pageObjects.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public CreateAccount setFirstName(String enterFirstName) {
        driver.findElement(firstName).sendKeys(enterFirstName);
        return this;
    }

    public CreateAccount setLastName(String enterLastName) {
        driver.findElement(lastName).sendKeys(enterLastName);
        return this;
    }

    public CreateAccount setEmail(String enterEmail) {
        driver.findElement(email).sendKeys(enterEmail);
        return this;
    }

    public CreateAccount setTelephone(String setNumber) {
        driver.findElement(telephone).sendKeys(setNumber);
        return this;
    }

    public CreateAccount setCompany(String enterCompany) {
        driver.findElement(company).sendKeys(enterCompany);
        return this;
    }

    public CreateAccount setAddress(String enterAddress) {
        driver.findElement(address).sendKeys(enterAddress);
        return this;
    }

    public CreateAccount setCity(String enterCity) {
        driver.findElement(city).sendKeys(enterCity);
        return this;
    }

    public CreateAccount setRegion(String state) {
        Select var = new Select(driver.findElement(region));
        var.selectByVisibleText(state);
        return this;
    }

    public CreateAccount setZipCode(String enterZipCode) {
        driver.findElement(zipCode).sendKeys(enterZipCode);
        return this;
    }

    public CreateAccount setCountry(String enterCountry) {
        Select selectCountry = new Select(driver.findElement(country));
        selectCountry.selectByVisibleText(enterCountry);
        return this;
    }

    public CreateAccount enterLoginName(String enterLoginName) {
        driver.findElement(loginName).sendKeys(enterLoginName);
        return this;
    }

    public CreateAccount setPassword(String enterPassword) {
        driver.findElement(password).sendKeys(enterPassword);
        return this;
    }


    public CreateAccount setConfirmedPassword(String enterConfirmPassword) {
        driver.findElement(confirmPassword).sendKeys(enterConfirmPassword);
        return this;

    }

    public CreateAccount setSubscribeYes() {
        driver.findElement(subscribeYesButton).click();
        return this;
    }

    public CreateAccount setSubscribeNo() {
        driver.findElement(subscribeNoButton).click();
        return this;
    }

    public CreateAccount clickOnAgreeCheckBox() {
        driver.findElement(agreeCheckBox).click();
        return this;
    }

    public SuccessRegisterPage getContinueButton() {
        driver.findElement(continueButton).click();
        return new SuccessRegisterPage(driver);
    }


}
