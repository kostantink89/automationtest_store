package pageObjects.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessRegisterPage {


    private WebDriver driver;

    public SuccessRegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    private By accountCreatedText = By.xpath("//span[@class='maintext']");

    private By successText = By.xpath("//section/p[text()='Congratulations! Your new account has been successfully created!']");

    public WebElement getActualAccountText() {
        return driver.findElement(accountCreatedText);
    }

    public String getAccountText() {
        return getActualAccountText().getText();
    }


}
