package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    private By continueShoppingButton = By.xpath("//a[@class='btn btn-default mr10  mb10']");


    public void clickOnContinueShoppingButton() {
        driver.findElement(continueShoppingButton).click();
    }


}
