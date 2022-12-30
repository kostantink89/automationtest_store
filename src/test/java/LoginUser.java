import base.BasePage;
import org.testng.annotations.Test;
import pageObjects.AccountLogin;
import pageObjects.HomePage;

public class LoginUser extends BasePage {


    @Test
    public void loginUserTest() {

        HomePage home = new HomePage(driver);
        home.getLoginOrRegister().click();

        AccountLogin account = new AccountLogin(driver);
        account.enterLoginName("bolton11");
        account.enterPassword("boltibolti11");



    }
}
