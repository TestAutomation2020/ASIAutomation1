package Execution;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.Posting;
import util.Constants;

import java.io.IOException;


public class PostingTestCase extends Base {

    @Test(priority = 0)
    private void navigateToPostingMenu() throws InterruptedException, IOException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());

        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(getDriver());
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
    }

    @Test(priority = 1, dependsOnMethods = "navigateToPostingMenu")
    private void filePostingAddSearchUpdateDelete() throws Exception {
        Posting posting = new Posting(getDriver());
        posting.addFilePosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.TITLE);
        posting.validateSearchedPosting(Constants.TITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.TITLE);
        posting.updatePosting();
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.UpdateTitle);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.UpdateTitle);
        basePage.navigateDefaultTab();
        posting.deletePosting();
    }

    @Test(priority = 2, dependsOnMethods = "navigateToPostingMenu")
    private void messagePostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        Posting posting = new Posting(getDriver());
        posting.addMessagePosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.TITLE);
        posting.validateSearchedPosting(Constants.TITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.TITLE);
        posting.updatePosting();
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.UpdateTitle);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.UpdateTitle);
        basePage.navigateDefaultTab();
        posting.deletePosting();

    }

    @Test(priority = 3, dependsOnMethods = "navigateToPostingMenu")
    private void linkPostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        Posting posting = new Posting(getDriver());
        posting.addLinkPosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.TITLE);
        posting.validateSearchedPosting(Constants.TITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.TITLE);
        posting.updatePosting();
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.UpdateTitle);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.UpdateTitle);
        basePage.navigateDefaultTab();
        posting.deletePosting();
    }


}
