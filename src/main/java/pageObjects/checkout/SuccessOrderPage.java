package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.home.HomePage;

import java.time.Duration;

public class SuccessOrderPage {

    private WebDriver driver;


    public SuccessOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By successText = By.xpath("//span[text()=' Your Order Has Been Processed!']");


    public String getActualSuccessText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String actualText = (wait.until(ExpectedConditions.presenceOfElementLocated(successText)).getText());
        return actualText;

    }


}
