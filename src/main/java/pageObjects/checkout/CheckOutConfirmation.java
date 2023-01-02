package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class CheckOutConfirmation {

    public CheckOutConfirmation confirmation;
    private WebDriver driver;
    private WebElement element = null;

    public CheckOutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    private By confirmOrder = By.id("checkout_btn");

    private By totalAmount = By.xpath("//span[@class='bold totalamout']");

    public SuccessOrderPage getConfirmOrderButton() {
        element = driver.findElement(confirmOrder);
        element.click();
        return new SuccessOrderPage(driver);
    }

    public String getTotalAmountText() {
        return driver.findElement(totalAmount).getText();
    }

    public CheckOutConfirmation getFirstAssertion() {
        Assert.assertEquals(confirmation.getTotalAmountText(), "$150.00");
        return this;
    }

}
