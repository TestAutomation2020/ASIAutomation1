package Execution;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import util.ConfigReader;
import util.Constants;

import java.io.IOException;

@Listeners(listener.TestStatistics.class)
public class EnwUserNavigationTestCase extends Base {
   @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1)
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

    }
    @Test(priority = 3)
    private void navigateToBasicuser() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"),ConfigReader.getProperty("basicpassword"),ConfigReader
                .getProperty("organization"));

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
    @Test(priority = 5,enabled = false)
    private void navigateToGroupMenu() throws InterruptedException, IOException {
        try {
            Login login = new Login(getDriver());
            login.LaunchApplication(getDriver());
            login.Loginpage(getDriver());

            GroupUpdateDelete group = new GroupUpdateDelete(getDriver());
            group.NavigateToGroup(getDriver());

        } catch (Exception e) {
            throw e;
        }
    }
    @Test(priority = 6, dependsOnMethods = "navigateToGroupMenu",enabled = false)
    private void UpdateDeleteGroup() throws InterruptedException, IOException {
        try {
            GroupUpdateDelete group = new GroupUpdateDelete(getDriver());
            group.GroupUpdate(getDriver());
            group.GroupDelete(getDriver());

        } catch (Exception e) {
            throw e;
        }
    }

}
