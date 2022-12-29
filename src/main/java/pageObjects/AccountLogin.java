package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogin {

    private WebDriver driver;


    public AccountLogin(WebDriver driver) {
        this.driver = driver;
    }

    By accountLoginText = By.xpath("//span[@class='maintext']");
    By newCustomerText = By.xpath("//h2[text()='I am a new customer.']");

    By continueButton = By.xpath("//button[@type='submit'][@title='Continue']");

    By loginName = By.id("loginFrm_loginname");
    By password = By.id("loginFrm_password");

    By loginButton = By.xpath("//button[@type='submit'][@title='Login']");




}
