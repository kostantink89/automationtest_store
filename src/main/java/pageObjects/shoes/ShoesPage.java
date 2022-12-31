package pageObjects.shoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoesPage {

    private WebDriver driver;

    public ShoesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By highWedge = By.xpath("//a[@class='prdocutname'][contains(@title,'High Wedge')]");
    private By highHeel = By.xpath("//a[@class='prdocutname'][contains(@title,'high heel')]");

    private By peepToes = By.xpath("//a[@class='prdocutname'][contains(@title,'Peep')]");

    private By rubyShoo = By.xpath("//a[@class='prdocutname'][contains(@title,'Ruby')]");

    public WebElement getHighWedge() {
        return driver.findElement(highWedge);
    }

    public WebElement getHighHeel() {
        return driver.findElement(highHeel);
    }

    public WebElement getPeepToes() {
        return driver.findElement(peepToes);

    }

    public WebElement getRubyShoo() {
        return driver.findElement(rubyShoo);
    }
}
