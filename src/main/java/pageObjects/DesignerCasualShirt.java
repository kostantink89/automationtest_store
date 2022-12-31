package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DesignerCasualShirt {

    private WebDriver driver;

    public DesignerCasualShirt(WebDriver driver) {
        this.driver = driver;
    }

    private By colour = By.id("option350");
    private By size = By.id("option351");

    private By quantity = By.id("product_quantity");

    private By addToCart = By.xpath("//a[@class='cart']");


    public void setColour(String value) {
        Select select = new Select(driver.findElement(colour));
        select.selectByVisibleText(value);
    }

    public void setSize(String value) {
        Select select = new Select(driver.findElement(colour));
        select.selectByVisibleText(value);
    }

    public void setQuantity(String value) {
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys(value);
    }

    public void clickOnAddToCartButton() {
        driver.findElement(addToCart).click();
    }


}
