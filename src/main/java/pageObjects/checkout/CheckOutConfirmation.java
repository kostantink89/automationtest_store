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

    private By checkOutButton = By.id("checkout_btn");

    public WebElement getCheckOutButton() {
        element = driver.findElement(checkOutButton);
        element.click();
        return element;
    }

}
