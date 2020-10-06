package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.Constants;

public class BasicNavigationTestCase extends Base{
    @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver());
    }

    @Test(priority = 1)
    private void Searchandvalidatebuttons() throws InterruptedException {

        BasicNavigation Basicuser = new BasicNavigation(getDriver());
        Basicuser.AskHR();
        Basicuser.Favorite();
        Basicuser.Print();

        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);
        posting.validateSearchedPosting(Constants.Searchtermforbasicuser);

    }

}
