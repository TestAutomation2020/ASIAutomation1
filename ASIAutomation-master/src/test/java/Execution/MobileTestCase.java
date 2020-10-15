package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.MobileProfile;
import pages.Posting;
import util.Constants;

import java.io.IOException;

public class MobileTestCase extends Base{
    @Test(priority = 0)
    private void navigateToAddMobileProfile() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());

    }

    @Test(priority = 1)
    private void Addmobileuser() throws InterruptedException, IOException {
        MobileProfile Mobileuser = new MobileProfile(getDriver());
     //   Mobileuser.createmobileprofile(Constants.MobileUser,Constants.mobilepin,Constants.mobileEmail);
        Mobileuser.searchnewmobileprofile(Constants.MobileUser);

       /*Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);
        posting.validateSearchedPosting(Constants.Searchtermforbasicuser);*/
    }


}
