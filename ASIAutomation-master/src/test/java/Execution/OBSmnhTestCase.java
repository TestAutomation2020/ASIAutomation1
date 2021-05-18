package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.OBSmnh;
import util.Constants;

import java.io.IOException;

public class OBSmnhTestCase extends Base {
    @Test(priority = 0)
    private void login() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1)
    private void OBSmoketest() throws InterruptedException, IOException {
        OBSmnh OBsmoke = new OBSmnh(getDriver());
        BasePage basePage = new BasePage(getDriver());
        OBsmoke.NavigationtoOnboarding();
       //OBsmoke.CreateuserinMNH();
       OBsmoke.DeleteUserinMNH(Constants.obnewhire);

    }
}
