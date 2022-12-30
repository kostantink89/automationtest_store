package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By myAccount = By.xpath("//span[@class='maintext']");

    private By displayedName = By.xpath("//span[@class='subtext']");


    public String getMyAccountText() {
        return driver.findElement(myAccount).getText();
    }

    public String getDisplayedName() {
        return driver.findElement(displayedName).getText();
    }
}
