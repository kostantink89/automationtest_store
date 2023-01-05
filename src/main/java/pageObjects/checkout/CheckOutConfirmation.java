package pageObjects.checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.time.Duration;

public class CheckOutConfirmation {


    private WebDriver driver;

    public CheckOutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    private By confirmOrder = By.id("checkout_btn");

    private By totalAmount = By.xpath("//span[@class='bold totalamout']");

    public void clickOnConfirmOrder() {
        driver.findElement(confirmOrder);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrder)).click();
    }

    public String getTotalAmountText() {
        return driver.findElement(totalAmount).getText();
    }


}
