import base.BasePage;

import org.testng.Assert;
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
        Assert.assertEquals(confirmation.getTotalAmountText(), "$150.00");
        confirmation.clickOnConfirmOrder();


        SuccessOrderPage success = new SuccessOrderPage(driver);
        Assert.assertEquals(success.getSuccessText(), "YOUR ORDER HAS BEEN PROCESSED!");


    }

}
