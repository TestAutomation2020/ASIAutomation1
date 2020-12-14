package Execution;

import org.apache.commons.lang3.StringUtils;
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

    @Test(priority = 1, enabled = false)
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

    @Test(priority = 2, enabled = false)
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
    private void addMessageLinkPostingVerifyAddGroupAccess() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(getDriver());
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
        posting.addMessagePosting();
        posting.validatePostingAdded();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateDefaultEnwisenGroupAccess();
        posting.giveGroupAccess();
        posting.addLinkPosting();
        posting.validatePostingAdded();
        posting.filterPosting(Constants.LINKPOSTINGTITLE);
        posting.validateDefaultEnwisenGroupAccess();
        posting.giveGroupAccess();
    }

    @Test(priority = 4)
    private void basicUserSearchPosting() throws Exception {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"), ConfigReader.getProperty("basicpassword"), ConfigReader
                .getProperty("organization"));
        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.searchPosting(Constants.LINKPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.LINKPOSTINGTITLE);
    }

    @Test(priority = 5)
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

    @Test(priority = 6)
    private void postingOpenUsingAlias() throws IOException {
        Posting posting = new Posting(getDriver());
        posting.openPostingUsingAliasName();
        posting.validateViewMessagePosting();
        BasePage basePage = new BasePage(getDriver());
        basePage.backButton();
    }

    @Test(priority = 7)
    private void validateExcludeFromSearchFunctionality() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.updateExcludeFromSearch();
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        posting.searchPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateExcludeFromSearchAndExpire();
        basePage.pageReload();
    }

    @Test(priority = 8)
    private void validateExpirePosting() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.filterPosting(Constants.LINKPOSTINGTITLE);
        posting.updateExpirationDate();
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"), ConfigReader.getProperty("basicpassword"), ConfigReader
                .getProperty("organization"));
        posting.searchPosting(Constants.LINKPOSTINGTITLE);
        posting.validateExcludeFromSearchAndExpire();
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        posting.searchPosting(Constants.LINKPOSTINGTITLE);
        posting.validateExcludeFromSearchAndExpire();

    }

    @Test(priority = 9)
    private void validationForMimeTypePostingWhileAdd() throws Exception {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.addFilePosting(ConfigReader.getProperty("mimetypepostingpath"));
        posting.validateMimePostingNotification();

    }

    @Test(priority = 10)
    private void validateMoreThan10MBFileWhileAdd() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.addMoreThan10MBFile(ConfigReader.getProperty("morethan10mbfilepostingpath"));
        posting.validateMoreThan10mbFilePostingNotification();
    }

    @Test(priority = 11)
    private void validateMoreThan10MBFileWhileUpdate() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter();
        posting.fileUploadWhileUpdate(ConfigReader.getProperty("morethan10mbfilepostingpath"));
        posting.validateMoreThan10mbFilePostingNotification();
        posting.fileUploadWhileUpdate(ConfigReader.getProperty("mimetypepostingpath"));
        posting.filePostingUpdate();
        posting.validateMimePostingNotification();
        basePage.pageReload();
    }

    @Test(priority = 12)
    private void validateLocationAdded() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToLocationMenu();
        posting.addLocation();
        posting.validatePostingAdded();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode"));
        posting.validateNewlyAddedLocation(ConfigReader.getProperty("locationname"), ConfigReader.getProperty("locationcode"), ConfigReader.getProperty("locationNote"));
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter();
        posting.validateAddedLocationOnPosting(ConfigReader.getProperty("locationname"));
        basePage.pageReload();
    }

    @Test(priority = 13)
    private void validateLocationUpdated() throws IOException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToLocationMenu();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode"));
        posting.updateLocation();
        posting.validatePostingUpdated();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode") + ConfigReader.getProperty("updatemessage"));
        posting.validateNewlyAddedLocation(ConfigReader.getProperty("locationname") + ConfigReader.getProperty("updatemessage"),
                ConfigReader.getProperty("locationcode") + ConfigReader.getProperty("updatemessage"),
                ConfigReader.getProperty("locationNote") + ConfigReader.getProperty("updatemessage"));
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter();
        posting.validateAddedLocationOnPosting(ConfigReader.getProperty("locationname") + ConfigReader.getProperty("updatemessage"));
        basePage.pageReload();
    }

    @Test(priority = 14)
    private void validateDeleteLocation() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToLocationMenu();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode") + ConfigReader.getProperty("updatemessage"));
        posting.deletePosting();
        posting.validatePostingDeleted();
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter();
        posting.validateDeleteLocationOnPosting(ConfigReader.getProperty("locationname") + ConfigReader.getProperty("updatemessage"));
        basePage.pageReload();
    }

    @Test(priority = 15)
    private void validatePostingAuditReport() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingAuditReportMenu();
        posting.appliedFilterInPostingAuditReport();
        posting.validatePostingAuditReportGrid();
    }

    @Test(priority = 16)
    private void validateAllPostingReport() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToAllPosting();
        posting.appliedFilterInAllPostingReport();
        posting.validateAllPostingReportGrid();
        basePage.pageReload();
    }
    @Test(priority = 16)
    private void validatePostingUsageReport() throws IOException, InterruptedException {
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingUsageMenu();
        posting.appliedFilterInPostingUsageReport();
        posting.validatePostingUsageReportGrid();
    }

    @Test(priority = 17)
    private void validatePostingImage() throws IOException, InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        BasePage basePage = new BasePage(getDriver());
        //basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingImage();
        posting.addedImagePosting();
        posting.validatePostingAdded();
        basePage.openDuplicateTab();
        basePage.navigateAnotherOpenedTab();
        posting.openAddedImagePosting();
        posting.validateOpenedImagePosting();

    }

}
