package pageObjects.apparel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApparelAccessoriesPage {

    private WebDriver driver;


    public ApparelAccessoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By shoes = By.cssSelector("li:nth-of-type(1) > a > img");

    private By TShirts = By.cssSelector("li:nth-of-type(2) > a > img");

    public WebElement getShoes() {
        return driver.findElement(shoes);
    }

    public WebElement getTShirts() {
        return driver.findElement(TShirts);
    }


}
