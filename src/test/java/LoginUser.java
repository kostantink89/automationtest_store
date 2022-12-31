import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.home.HomePage;
import pageObjects.account.MyAccountPage;

public class LoginUser extends BasePage {


    @Test
    public void loginUserTest() {

        HomePage home = new HomePage(driver);
        home.getLoginRegister()
                .login("spparowj90", "sparri1")
                .clickOnLoginButton();

        MyAccountPage myAccount = new MyAccountPage(driver);
        Assert.assertEquals(myAccount.getActualAccountText(), "MY ACCOUNT");


    }
}
