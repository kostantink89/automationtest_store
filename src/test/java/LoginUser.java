import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountLogin;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

public class LoginUser extends BasePage {


    @Test
    public void loginUserTest() throws InterruptedException {

        Thread.sleep(1500);
        HomePage home = new HomePage(driver);
        home.getLoginOrRegister().click();
        Thread.sleep(1500);

        AccountLogin account = new AccountLogin(driver);
        Thread.sleep(1500);
        account.enterLoginName("bolton11");
        Thread.sleep(1500);
        account.enterPassword("boltibolti11");
        account.getLoginButton().click();

        Thread.sleep(1500);
        MyAccountPage myAccount = new MyAccountPage(driver);
        Thread.sleep(1500);
        Assert.assertEquals(myAccount.getMyAccountText(), "MY ACCOUNT");
        Thread.sleep(1500);




    }
}
