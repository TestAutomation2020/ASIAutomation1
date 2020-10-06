package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.Posting;

public class MobileTestCase extends Base{
    @Test(priority = 0)
    private void navigateToAddMobileProfile() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1)
    private void navigateToMobileUser() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

}
