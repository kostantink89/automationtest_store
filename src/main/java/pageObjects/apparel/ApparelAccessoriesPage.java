package pageObjects.apparel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.shoes.ShoesPage;

public class ApparelAccessoriesPage {

    private WebDriver driver;


    public ApparelAccessoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By shoes = By.cssSelector("li:nth-of-type(1) > a > img");

    private By TShirts = By.cssSelector("li:nth-of-type(2) > a > img");

    public ShoesPage getShoes() {
        WebElement element = driver.findElement(shoes);
        element.click();
        return new ShoesPage(driver);

    }

    public WebElement getTShirts() {
        return driver.findElement(TShirts);
    }


}
