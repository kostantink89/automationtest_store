package pageObjects.tshirts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtsProductPage {

    private WebDriver driver;

    public TShirtsProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By jerseyCotton = By.xpath("//a[@class='prdocutname'][contains(@title,'Jersey Cotton')]");

    private By designerMenCasual = By.xpath("//a[@class='prdocutname'][contains(@title,'Designer Men')]");

    private By casualThreeFour = By.xpath("//a[@class='prdocutname'][contains(@title,'Casual 3/4')]");



}
