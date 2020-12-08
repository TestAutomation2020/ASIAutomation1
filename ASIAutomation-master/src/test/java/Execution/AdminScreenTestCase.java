package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.ConfigReader;
import util.Constants;

import java.io.IOException;


public class AdminScreenTestCase extends Base {

    @Test(priority = 0)
    private void login() throws InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1,enabled = false)
    private void regionLocale() throws InterruptedException, IOException {
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAdmin();
        RegionLocale regionLocale = new RegionLocale(getDriver());
        regionLocale.navigateToRegionLocale();
        regionLocale.filterApplied();
        regionLocale.deleteUSRegionLocale();
        regionLocale.addRegionLocale();
        regionLocale.verifiedAppliedFilter();
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        regionLocale.verifiedLocaleSelection();
        basePage.navigateDefaultTab();
        regionLocale.updateRegionLocale();
        regionLocale.verifiedUpdatedRegionLocale();
        regionLocale.deleteRegionLocale();
    }

    @Test(priority = 2,enabled = false)
    private void federatedSearch() throws IOException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAdmin();
        FederatedSearch federatedSearch = new FederatedSearch(getDriver());
        federatedSearch.navigateToFederatedSearch();
        federatedSearch.addFederatedSearch();
        federatedSearch.verifiedAddedFederatedSearch();
        federatedSearch.updateFederatedSearch();
        federatedSearch.verifiedUpdatedFederatedSearch();
        federatedSearch.federatedSearchGroupProperty();
        federatedSearch.federatedSearchLocaleProperty();
        federatedSearch.deleteFederatedSearch();
    }

    @Test(priority = 3)
    private void basicUserSearchPosting() throws Exception {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(getDriver());
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
        posting.addMessagePosting();
        posting.validatePostingAdded();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        //basePage.signOutUser();
        posting.giveGroupAccess();
        posting.addLinkPosting();
        posting.validatePostingAdded();
        posting.filterPosting(Constants.LINKPOSTINGTITLE);
        posting.giveGroupAccess();
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"),ConfigReader.getProperty("basicpassword"),ConfigReader
                .getProperty("organization"));
        posting.searchPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.searchPosting(Constants.LINKPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.LINKPOSTINGTITLE);
    }

    @Test(priority = 4)
    private void viewPostingUsingViewLink() throws Exception {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(getDriver());
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.viewPosting();
        basePage.navigateAnotherOpenedTab();
        posting.validateViewMessagePosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.LINKPOSTINGTITLE);
        posting.viewPosting();
        basePage.navigateAnotherOpenedTab();
        posting.validateViewLinkPosting();
        basePage.navigateDefaultTab();
    }

    @Test(priority = 5)
    private void postingOpenUsingAlias() throws IOException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.openPostingUsingAliasName();
        posting.validateViewMessagePosting();
    }


}
