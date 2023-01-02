package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.home.HomePage;

public class SuccessOrderPage {

    public SuccessOrderPage success;

    private WebDriver driver;
    private WebElement element;


    public SuccessOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By successText = By.xpath("//span[@class='maintext']");


    public WebElement getSuccess() {
        element = driver.findElement(successText);
        return element;
    }

    public String getSuccessText() {
        return getSuccess().getText();
    }

    public HomePage getSecondAssertion() {
        Assert.assertEquals(success.getSuccessText(), "YOUR ORDER HAS BEEN PROCESSED!");
        return new HomePage(driver);

    }
}
