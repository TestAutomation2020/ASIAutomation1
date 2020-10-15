package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.Constants;

import java.io.IOException;

public class EnwUserNavigationTestCase extends Base{
    @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }
    @Test(priority =1)
    private void EnwuseronHomePage() throws InterruptedException, IOException {

        BasicNavigation Basicuser = new BasicNavigation(getDriver());

       Basicuser.AskHR();
       Basicuser.Favorite();
       Basicuser.Print();

        UserMenuNavigation usermenu = new UserMenuNavigation(getDriver());
        usermenu.UserMenu(getDriver());

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);

        EActions eActions=new EActions(getDriver());
        eActions.validateSearchedPosting(Constants.Searchtermforbasicuser);



    }
}
