package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.Constants;

import java.io.IOException;

public class EnwUserNavigationTestCase extends Base {
   @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

   /* @Test(priority = 1)
    private void EnwuseronHomePage() throws InterruptedException, IOException {

        BasicNavigation Basicuser = new BasicNavigation(getDriver());

        Basicuser.AskHR();
        Basicuser.Favorite();
        Basicuser.Print();

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);

        EActions eActions = new EActions(getDriver());
        eActions.validateSearchedPosting(Constants.Searchtermforbasicuser);
        eActions.HomeLink();

    }

    @Test(priority = 2)
    private void Addmobileuser() throws InterruptedException, IOException {
        MobileProfile Mobileuser = new MobileProfile(getDriver());
        Mobileuser.createmobileprofile(Constants.MobileUser, Constants.mobilepin, Constants.mobileEmail);
        Mobileuser.searchnewmobileprofile(Constants.MobileUser);

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);

        EActions eActions = new EActions(getDriver());
        eActions.validateSearchedPosting(Constants.Searchtermforbasicuser);

    }*/
    @Test(priority = 3)
    private void navigateToBasicuser() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver());
    }

    @Test(priority = 4)
    private void Searchandvalidatebuttons() throws InterruptedException, IOException {

        BasicNavigation Basicuser = new BasicNavigation(getDriver());
        Basicuser.AskHR();
        Basicuser.Favorite();

        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.Searchtermforbasicuser);

        EActions eActions=new EActions(getDriver());
        eActions.validateSearchedPosting(Constants.Searchtermforbasicuser);

    }

}
