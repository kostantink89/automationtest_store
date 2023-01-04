package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.home.HomePage;

public class SuccessOrderPage {

    private WebDriver driver;
    private WebElement element;


    public SuccessOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By successText = By.xpath("//span[@class='maintext']");


    public WebElement getSuccess() {
        WebElement element = driver.findElement(successText);
        return element;
    }

    public String getSuccessText() {
        return getSuccess().getText();
    }

}
