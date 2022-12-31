package pageObjects.shoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HighWedgeDetails {

    private WebDriver driver;

    public HighWedgeDetails(WebDriver driver) {
        this.driver = driver;
    }

    private By thirdSize = By.id("#option344747");
    private By fourthSize = By.id("#option344748");

    private By fifthSize = By.id("#option344749");

    private By sixthSize = By.id("#option344750");
    private By getShoeColour = By.id("#option345");

    private By quantity = By.id("#product_quantity");

    private By AddToCartButton = By.xpath("//a[@class='cart']");

    public WebElement getThirdSize() {
        return driver.findElement(thirdSize);
    }

    public WebElement getFourthSize() {
        return driver.findElement(fourthSize);
    }

    public WebElement getFifthSize() {
        return driver.findElement(fifthSize);
    }

    public WebElement getSixthSize() {
        return driver.findElement(sixthSize);
    }


    public void selectShoeColour(String setColour) {
        Select select = new Select(driver.findElement(getShoeColour));
        select.selectByVisibleText(setColour);

    }

    public void setItemQuantity(String enterValue) {
        driver.findElement(quantity).sendKeys(enterValue);
    }

    public void clickOnAddToCardButton() {
        driver.findElement(AddToCartButton).click();
    }


}



