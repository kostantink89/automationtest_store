package pageObjects.tshirts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DesignerMenProduct {

    private WebDriver driver;
    private WebElement element;


    public DesignerMenProduct(WebDriver driver) {
        this.driver = driver;
    }

    private By colour = By.id("option350");

    private By size = By.id("option351");

    private By quantity = By.id("product_quantity");

    private By addToCartButton = By.xpath("//a[@class='cart']");


    public void getShirtColour(String value) {
        Select selectColour = new Select(driver.findElement(colour));
        selectColour.selectByValue(value);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(colour));


    }

    public void getShirtSize(String enterSize) {
        Select selectSize = new Select(driver.findElement(size));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(size));
        selectSize.selectByVisibleText(enterSize);


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
