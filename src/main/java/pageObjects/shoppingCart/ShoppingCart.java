package pageObjects.shoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    private By cartUpdate = By.id("#cart_update");
    private By cartCheckOut = By.id("#cart_checkout1");

    private By continueShoppingButton = By.xpath("//i[@class='fa fa-arrow-right']");


    public void clickOnCartUpdateButton() {
        driver.findElement(cartUpdate).click();
    }

    public void clickOnCartCheckOutButton() {
        driver.findElement(cartCheckOut).click();
    }

    public void clickOnContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }
}
