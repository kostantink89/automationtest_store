import base.BasePage;

import org.testng.annotations.Test;
import pageObjects.apparel.ApparelAccessoriesPage;
import pageObjects.home.HomePage;
import pageObjects.shoes.HighWedgeDetails;
import pageObjects.shoes.ShoesPage;
import pageObjects.shoppingCart.ShoppingCart;

public class BuyAndOrderProduct extends BasePage {


    @Test
    public void firstEndToEnd() {

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
        home.getTShirts().click();







    }

}
