import base.BasePage;
import org.openqa.selenium.support.ui.Select;
import pageObjects.AccountLogin;
import pageObjects.CreateAccount;
import pageObjects.HomePage;

public class RegisterNewUser extends BasePage {


    public void endToEndRegisterUserTest() {
        HomePage home = new HomePage(driver);
        home.getLoginOrRegister().click();

        AccountLogin loginPage = new AccountLogin(driver);
        loginPage.getContinueButton().click();

        CreateAccount account = new CreateAccount(driver);
        account.setFirstName("Andrew");
        account.setLastName("Bolton");
        account.setEmail("bolton@yahoo.ca");
        account.setTelephone("234-1010-5681");
        account.setCompany("LLC Mojo");
        account.setAddress("100 Abba Way");
        account.setCity("Gas City");
        Select country = new Select(account.setCountry());
        country.selectByValue("United States");
        account.setRegion("Indiana");
        account.setZipCode("47906");




    }
}
