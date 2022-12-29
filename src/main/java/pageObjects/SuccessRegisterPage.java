package pageObjects;

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

    public String getAccountText() {
        return driver.findElement(accountCreatedText).getText();
    }

    public String successText() {
        return driver.findElement(successText).getText();
    }
}
