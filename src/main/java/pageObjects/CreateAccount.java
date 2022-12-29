package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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





}
