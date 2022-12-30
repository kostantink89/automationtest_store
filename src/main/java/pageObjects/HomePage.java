package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    private By home = By.xpath("//a[contains(@class,'active menu_home')]");
    private By apparel = By.linkText("APPAREL & ACCESSORIES");

    private By tShirts = By.xpath("//li[2]//div[1]//ul[1]//li[2]//a[1]");
    private By makeup = By.linkText("MAKEUP");

    private By skincare = By.linkText("FRAGRANCE");

    private By men = By.linkText("MEN");
    private By hairCare = By.linkText("HAIRCARE");

    private By books = By.linkText("BOOKS");

    private By currency = By.xpath("//a/span[contains(text(),' US Dollar')]");

    private By searchKeywords = By.xpath("//div[@class='btn-group search-bar']");

    private By facebookIcon = By.xpath("//div[@class='header_block']/div/a[@title='Facebook']");

    private By twitterIcon = By.xpath("//div[@class='header_block']/div/a[@title='Twitter']");

    private By linkedinIcon = By.xpath("//div[@class='header_block']/div/a[@title='Linkedin']");

    private By loginOrRegister = By.xpath("//li/a[text()='Login or register']");


    public WebElement getHome() {
        return driver.findElement(home);
    }

    public WebElement getApparel() {
        return driver.findElement(apparel);
    }

    public WebElement getMakeup() {
        return driver.findElement(makeup);
    }

    public WebElement getSkinCare() {
        return driver.findElement(skincare);
    }

    public WebElement getMen() {
        return driver.findElement(men);
    }

    public WebElement getHairCare() {
        return driver.findElement(hairCare);
    }

    public WebElement getBooks() {
        return driver.findElement(books);
    }

    public WebElement getCurrency() {
        return driver.findElement(currency);
    }

    public WebElement getSearchByKeywords() {
        return driver.findElement(searchKeywords);
    }

    public WebElement getFacebookIcon() {
        return driver.findElement(facebookIcon);
    }

    public WebElement getTwitterIcon() {
        return driver.findElement(twitterIcon);
    }

    public WebElement getLinkedinIcon() {
        return driver.findElement(linkedinIcon);

    }

    public WebElement getLoginOrRegister() {
        return driver.findElement(loginOrRegister);
    }

    public WebElement getTShirt() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement tshirt = wait.until(ExpectedConditions.visibilityOfElementLocated(tShirts));
        return tshirt;

    }
}

    