package pageObjects.tshirts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DesignerMenProduct {

    Select select;

    private WebDriver driver;

    private WebElement element = null;

    public DesignerMenProduct(WebDriver driver) {
        this.driver = driver;
    }

    private By colour = By.id("option350");

    private By size = By.id("option351");

    private By quantity = By.id("product_quantity");

    private By addToCartButton = By.xpath("//a[@class='cart']");


    public WebElement getShirtColour(String enterColor) {
        element = driver.findElement(colour);
        select = new Select(element);
        select.selectByVisibleText(enterColor);
        return element;
    }

    public WebElement getShirtSize(String enterSize) {
        element = driver.findElement(size);
        select = new Select(element);
        select.selectByVisibleText(enterSize);
        return element;
    }

    public WebElement getShirtQuantity(String enterQuantity) {
        element = driver.findElement(quantity);
        element.clear();
        element.sendKeys(enterQuantity);
        return element;

    }

    public WebElement clickOnAddToCartButton() {
        element = driver.findElement(addToCartButton);
        element.click();
        return element;
    }
}
