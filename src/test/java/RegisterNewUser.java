import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.home.HomePage;
import pageObjects.account.SuccessRegisterPage;

public class RegisterNewUser extends BasePage {

    @Test(enabled = false)
    public void endToEndRegisterUserTest() {

        HomePage home = new HomePage(driver);

        home.getLoginRegister()
                .getContinueButton()
                .setFirstName("Jack")
                .setLastName("Sparrow")
                .setEmail("sparrow@google.com")
                .setTelephone("255-1089-4567")
                .setCompany("Sparrow Corp")
                .setAddress("5690 Carribbean Way")
                .setCity("Winnipeg")
                .setCountry("Canada")
                .setRegion("Manitoba")
                .setZipCode("R2M 0T8")
                .enterLoginName("spparowj90")
                .setPassword("sparri1")
                .setConfirmedPassword("sparri1")
                .setSubscribeNo()
                .clickOnAgreeCheckBox()
                .getContinueButton();

        SuccessRegisterPage success = new SuccessRegisterPage(driver);
        Assert.assertEquals(success.getAccountText(), "YOUR ACCOUNT HAS BEEN CREATED!");

    }
}
