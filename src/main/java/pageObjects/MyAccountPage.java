package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By myAccount = By.xpath("//span[@class='maintext']");

    private By displayedName = By.xpath("//span[@class='subtext']");


    public WebElement getMyAccountText() {
        return driver.findElement(myAccount);
    }

    public String getActualAccountText() {
        String actualMessage = getMyAccountText().getText();
        return actualMessage;
    }

    public String getDisplayedName() {
        return driver.findElement(displayedName).getText();
    }
}
