import base.BasePage;

import org.testng.annotations.Test;
import pageObjects.account.AccountLogin;
import pageObjects.apparel.ApparelAccessoriesPage;
import pageObjects.checkout.CheckOutConfirmation;
import pageObjects.home.HomePage;
import pageObjects.shoes.HighWedgeDetails;
import pageObjects.shoes.ShoesPage;
import pageObjects.shoppingCart.ShoppingCart;
import pageObjects.tshirts.DesignerMenProduct;
import pageObjects.tshirts.TShirtsProductPage;

public class BuyAndOrderProduct extends BasePage {


    @Test
    public void firstEndToEnd() throws InterruptedException {

        Thread.sleep(1500);

        //Navigating to home page
        HomePage home = new HomePage(driver);
        home.getApparel().click();

        Thread.sleep(1500);

        //Navigating to apparel and accessories page
        ApparelAccessoriesPage apparel = new ApparelAccessoriesPage(driver);
        apparel.getShoes().click();

        Thread.sleep(1500);

        //Selecting and navigating to shoes page
        ShoesPage shoes = new ShoesPage(driver);
        //Selecting high wedge shoes
        shoes.getHighWedge().click();
        Thread.sleep(1500);
        HighWedgeDetails highWedge = new HighWedgeDetails(driver);
        highWedge.getFourthSize().click();
        Thread.sleep(1500);
        highWedge.selectShoeColour("red");
        Thread.sleep(1500);
        highWedge.setItemQuantity("2");
        Thread.sleep(1500);
        highWedge.clickOnAddToCardButton();
        Thread.sleep(1500);
        //Navigating to shopping cart page
        ShoppingCart cart = new ShoppingCart(driver);
        Thread.sleep(1500);
        cart.clickOnContinueShoppingButton();
        //Returning back to page with high wedge product
        //Navigating to T-Shirts page
        home.moveToElementApparel();
        Thread.sleep(1500);
        home.getTShirt().click();
        Thread.sleep(1500);


        TShirtsProductPage tshirts = new TShirtsProductPage(driver);
        Thread.sleep(1500);
        tshirts.getDesignerMenCasual();
        Thread.sleep(1500);

        DesignerMenProduct designer = new DesignerMenProduct(driver);
        designer.getShirtColour("White");
        designer.getShirtSize("Medium");
        designer.getShirtQuantity("3");
        designer.clickOnAddToCartButton();

        cart.clickOnCartCheckOutButton();
        AccountLogin loginUser = new AccountLogin(driver);
        loginUser.login("spparowj90", "sparri1");
        loginUser

       CheckOutConfirmation confirmation = new CheckOutConfirmation(driver);



    }

}
