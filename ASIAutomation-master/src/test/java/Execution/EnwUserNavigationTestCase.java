package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.Constants;

public class EnwUserNavigationTestCase extends Base{
    @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        //UserMenuNavigation usermenu = new UserMenuNavigation(getDriver());
        //usermenu.UserMenu();
    }
    @Test(priority =1)
    private void EnwuseronHomePage() throws InterruptedException {

        BasicNavigation Basicuser = new BasicNavigation(getDriver());

        Basicuser.AskHR();
        Basicuser.Favorite();
        Basicuser.Print();

        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.postingTitle);
        posting.validateSearchedPosting(Constants.postingTitle);


    }
}
