package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.ConfigReader;
import util.Constants;

import java.io.IOException;


public class BasicNavigationTestCase extends Base{
    @Test(priority = 0)
    private void navigateToHomePage() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"),ConfigReader.getProperty("basicpassword"),ConfigReader
        .getProperty("organization"));
    }

    @Test(priority = 1)
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
