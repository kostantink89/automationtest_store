package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutConfirmation {

    private WebDriver driver;
    private WebElement element = null;

    public CheckOutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    private By confirmOrder = By.id("checkout_btn");

    private By totalAmount = By.xpath("//span[@class='bold totalamout']");

    public WebElement getConfirmOrderButton() {
        element = driver.findElement(confirmOrder);
        element.click();
        return element;
    }

    public String getTotalAmountText() {
        return driver.findElement(totalAmount).getText();
    }

}
