package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.Login;
import pages.Posting;
import util.Constants;

import java.io.IOException;

public class PostingTestCase extends Base {

    @Test(priority = 0)
    private void navigateToPostingMenu() throws InterruptedException {
        try {
            Login login = new Login();
            login.LaunchApplication(getDriver());
            login.Loginpage(getDriver());

            BasePage basePage = new BasePage(getDriver());
            basePage.navigateToKbAdmin();
            Posting posting = new Posting(getDriver());
            posting.navigateToPostingMenu();
            posting.validatePostingScreen();
        } catch (Exception e) {
            throw e;
        }
    }

    @Test(priority = 1, dependsOnMethods = "navigateToPostingMenu")
    private void filePostingAddSearchUpdateDelete() throws Exception {
        try {
            Posting posting = new Posting(getDriver());
            posting.addFilePosting();
            posting.validatePostingAdded();
            BasePage basePage = new BasePage(getDriver());
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
        } catch (Exception e) {
            throw e;
        }
    }

    @Test(priority = 2, dependsOnMethods = "navigateToPostingMenu")
    private void messagePostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        try {
            Posting posting = new Posting(getDriver());
            posting.addMessagePosting();
            posting.validatePostingAdded();
            BasePage basePage = new BasePage(getDriver());
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
        } catch (Exception e) {
            throw e;
        }

    }

    @Test(priority = 3, dependsOnMethods = "navigateToPostingMenu")
    private void linkPostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        try {
            Posting posting = new Posting(getDriver());
            posting.addLinkPosting();
            posting.validatePostingAdded();
            BasePage basePage = new BasePage(getDriver());
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
        } catch (Exception e) {
            throw e;
        }
    }


}
