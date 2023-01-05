import base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.account.AccountLogin;
import pageObjects.apparel.ApparelAccessoriesPage;
import pageObjects.checkout.CheckOutConfirmation;
import pageObjects.checkout.SuccessOrderPage;
import pageObjects.home.HomePage;
import pageObjects.shoes.HighWedgeDetails;
import pageObjects.shoes.ShoesPage;
import pageObjects.shoppingCart.ShoppingCart;
import pageObjects.tshirts.DesignerMenProduct;
import pageObjects.tshirts.TShirtsProductPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;


@Listeners(base.Listeners.class)

public class BuyAndOrderProduct extends BasePage {

    @Test
    public void firstEndToEnd() throws InterruptedException {


        HomePage home = new HomePage(driver)
                .getApparel()
                .getShoes()
                .getHighWedge()
                .getFourthSize()
                .selectShoeColour("red")
                .setItemQuantity("2")
                .clickOnAddToCartButton()
                .clickOnContinueShoppingButton()
                .moveToTShirts()
                .getDesignerMenCasual()
                .getShirtColour("775")
                .getShirtSize("Medium")
                .getShirtQuantity("3")
                .clickOnAddToCartButton()
                .clickOnCartCheckOutButton()
                .login("spparowj90", "sparri1")
                .clickOnLoginButton();


        CheckOutConfirmation confirmation = new CheckOutConfirmation(driver);
        log.info("Assertion for total amount for 2 product");
        assertEquals(confirmation.getTotalAmountText(), "$150.00");
        confirmation.clickOnConfirmOrder();

        Thread.sleep(1500);
        SuccessOrderPage success = new SuccessOrderPage(driver);
        Thread.sleep(1500);
        System.out.println(success.getActualSuccessText());
        Thread.sleep(1500);
        log.info("Assertion for appropriate assertion text");
        log.error("Shouldn't be any errors");
        log.warn("Shouldn't be any warns");
        Assert.assertEquals(success.getActualSuccessText(), "YOUR ORDER HAS BEEN PROCESSED!");


    }

}
