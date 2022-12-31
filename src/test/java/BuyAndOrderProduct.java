import base.BasePage;

import org.testng.annotations.Test;
import pageObjects.apparel.ApparelAccessoriesPage;
import pageObjects.home.HomePage;
import pageObjects.shoes.ShoesPage;

public class BuyAndOrderProduct extends BasePage {


    @Test
    public void firstEndToEnd() {

        HomePage home = new HomePage(driver);
        home.getApparel().click();
        ApparelAccessoriesPage apparel = new ApparelAccessoriesPage(driver);
        apparel.getShoes().click();
        ShoesPage shoes = new ShoesPage(driver);
        shoes.getHighWedge().click();



    }

}
