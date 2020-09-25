package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.Posting;
import util.ConfigReader;
import util.Constants;

public class PostingTestCase extends Base{

    @Test(priority = 0)
    private void navigateToPostingMenu() throws InterruptedException {
        Login login = new Login();
        login.LaunchApplication(driver);
        login.Loginpage(driver);

        BasePage basePage = new BasePage(driver);
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(driver);
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
    }

    @Test(priority = 1)
    private void messagePostingAddSearchUpdateDelete() throws InterruptedException {
        Posting posting = new Posting(driver);
        posting.addMessagePosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(driver);
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.postingTitle);
        posting.validateSearchedPosting(Constants.postingTitle);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.postingTitle);
        posting.updatePosting();
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.UpdateTitle);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.UpdateTitle);
        basePage.navigateDefaultTab();
        posting.deletePosting();
    }


}
