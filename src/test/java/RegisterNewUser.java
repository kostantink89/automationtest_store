import base.BasePage;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountLogin;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.SuccessRegisterPage;

public class RegisterNewUser extends BasePage {


    @Test
    public void endToEndRegisterUserTest() throws InterruptedException {

        Thread.sleep(1500);
        HomePage home = new HomePage(driver);
        Thread.sleep(1500);
        home.getLoginOrRegister().click();

        Thread.sleep(1500);
        AccountLogin loginPage = new AccountLogin(driver);
        Thread.sleep(1500);
        loginPage.getContinueButton().click();

        CreateAccount account = new CreateAccount(driver);
        Thread.sleep(1500);
        account.setFirstName("Andrew");
        Thread.sleep(1500);
        account.setLastName("Bolton");
        Thread.sleep(1500);
        account.setEmail("bolton@yahoo.ca");
        Thread.sleep(1500);
        account.setTelephone("234-1010-5681");
        Thread.sleep(1500);
        account.setCompany("LLC Mojo");
        Thread.sleep(1500);
        account.setAddress("100 Abba Way");
        Thread.sleep(1500);
        account.setCity("Gas City");
        Thread.sleep(1500);
        Select country = new Select(account.setCountry());
        Thread.sleep(1500);
        country.selectByVisibleText("United States");
        Thread.sleep(1500);
        account.setRegion("Indiana");
        Thread.sleep(1500);
        account.setZipCode("47906");
        Thread.sleep(1500);
        account.enterLoginName("bolton11");
        Thread.sleep(1500);
        account.setPassword("boltibolti11");
        Thread.sleep(1500);
        account.setConfirmedPassword("boltibolti11");
        Thread.sleep(1500);
        account.setSubscribeNo();
        Thread.sleep(1500);
        account.clickOnAgreeCheckBox();
        Thread.sleep(1500);
        account.getContinueButton().click();
        Thread.sleep(1500);

        SuccessRegisterPage success = new SuccessRegisterPage(driver);
        Thread.sleep(1500);
        String expectedMessage = "YOUR ACCOUNT HAS BEEN CREATED!";
        String actualMessage = success.getAccountText();
        Thread.sleep(1500);
        Assert.assertEquals(actualMessage, expectedMessage);


    }
}
