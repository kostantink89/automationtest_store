package pageObjects.tshirts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TShirtsProductPage {

    private WebDriver driver;
    WebElement element = null;

    public TShirtsProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By jerseyCotton = By.xpath("//a[@class='prdocutname'][contains(@title,'Jersey Cotton')]");

    private By designerMenCasual = By.xpath("//a[@class='prdocutname'][contains(@title,'Designer Men')]");

    private By casualThreeFour = By.xpath("//a[@class='prdocutname'][contains(@title,'Casual 3/4')]");


    public WebElement getJerseyCotton() {
        element = driver.findElement(jerseyCotton);
        element.click();
        return element;
    }

    public DesignerMenProduct getDesignerMenCasual() {
        element = driver.findElement(designerMenCasual);
        element.click();
        return new DesignerMenProduct(driver);
    }

    public WebElement getCasualThreeFour() {
        element = driver.findElement(casualThreeFour);
        element.click();
        return element;
    }


}
