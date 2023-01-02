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

        //Navigating to home page
        HomePage home = new HomePage(driver);
        home.getApparel().click();

        //Navigating to apparel and accessories page
        ApparelAccessoriesPage apparel = new ApparelAccessoriesPage(driver);
        apparel.getShoes().click();


        //Selecting and navigating to shoes page
        ShoesPage shoes = new ShoesPage(driver);
        //Selecting high wedge shoes
        shoes.getHighWedge().click();

        HighWedgeDetails highWedge = new HighWedgeDetails(driver);
        highWedge.getFourthSize().click();
        highWedge.selectShoeColour("red");
        highWedge.setItemQuantity("2");
        highWedge.clickOnAddToCardButton();

        //Navigating to shopping cart page
        ShoppingCart cart = new ShoppingCart(driver);
        cart.clickOnContinueShoppingButton();
        //Returning back to page with high wedge product
        //Navigating to T-Shirts page
        home.moveToElementApparel();
        home.getTShirt().click();

        TShirtsProductPage tshirts = new TShirtsProductPage(driver);
        tshirts.getDesignerMenCasual();

        DesignerMenProduct designer = new DesignerMenProduct(driver);
        designer.getShirtColour("775");
        designer.getShirtSize("Medium");
        designer.getShirtQuantity("3");
        designer.clickOnAddToCartButton();
        cart.clickOnCartCheckOutButton();

        AccountLogin loginUser = new AccountLogin(driver);

        loginUser.login("spparowj90", "sparri1");
        loginUser.clickOnLoginButton();

        CheckOutConfirmation confirmation = new CheckOutConfirmation(driver);
        Assert.assertEquals(confirmation.getTotalAmountText(), "$150.00");
        confirmation.getConfirmOrderButton();

        SuccessOrderPage successPage = new SuccessOrderPage(driver);
        Assert.assertEquals(successPage.getSuccessText(), "YOUR ORDER HAS BEEN PROCESSED!");


    }

}
