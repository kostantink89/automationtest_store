package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtItems {

    private WebDriver driver;

    public TShirtItems(WebDriver driver) {
        this.driver = driver;
    }

    private By designerMenCasual = By.xpath("//a[@class='prdocutname'][starts-with(@title,'Designer Men')]");

    private By casualSleeveTShirt = By.xpath("//a[@class='prdocutname'][starts-with(@title,'Casual 3/4')]");

    public WebElement getDesignerMenCasual() {
        return driver.findElement(designerMenCasual);

    }

    public WebElement getCasualSleeveTShirt() {
        return driver.findElement(casualSleeveTShirt);
    }


}
