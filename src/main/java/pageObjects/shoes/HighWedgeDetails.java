package pageObjects.shoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.shoppingCart.ShoppingCart;
import pageObjects.tshirts.TShirtsProductPage;

public class HighWedgeDetails {

    private WebDriver driver;

    public HighWedgeDetails(WebDriver driver) {
        this.driver = driver;
    }

    private By apparel = By.linkText("APPAREL & ACCESSORIES");

    private By tShirts = By.xpath("//li[2]//div[1]//ul[1]//li[2]//a[1]");

    private By thirdSize = By.id("option344747");
    private By fourthSize = By.id("option344748");

    private By fifthSize = By.id("option344749");

    private By sixthSize = By.id("option344750");
    private By getShoeColour = By.id("option345");

    private By quantity = By.id("product_quantity");

    private By AddToCartButton = By.xpath("//a[@class='cart']");

    public WebElement getThirdSize() {
        return driver.findElement(thirdSize);
    }

    public HighWedgeDetails getFourthSize() {
        driver.findElement(fourthSize).click();
        return this;
    }

    public WebElement getFifthSize() {
        return driver.findElement(fifthSize);
    }

    public WebElement getSixthSize() {
        return driver.findElement(sixthSize);
    }


    public HighWedgeDetails selectShoeColour(String setColour) {
        Select select = new Select(driver.findElement(getShoeColour));
        select.selectByVisibleText(setColour);
        return this;

    }

    public HighWedgeDetails setItemQuantity(String enterValue) {
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys(enterValue);
        return this;
    }

    public ShoppingCart clickOnAddToCartButton() {
        driver.findElement(AddToCartButton).click();
        return new ShoppingCart(driver);
    }

    public WebElement getTShirts() {
        return driver.findElement(tShirts);
    }

    public TShirtsProductPage moveToTShirts() {
        new Actions(driver).moveToElement(driver.findElement(apparel)).perform();
        getTShirts().click();
        return new TShirtsProductPage(driver);
    }


}



