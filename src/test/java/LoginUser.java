import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountLogin;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

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
