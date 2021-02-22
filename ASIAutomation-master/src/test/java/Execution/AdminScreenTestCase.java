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
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
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
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToSetUpHomePage();
        homePage.localeSelectionWidgetComparison();
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
    private void addMessageLinkFilePostingVerifyAddGroupAccess() throws Exception {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAdmin();
        Posting posting = new Posting(getDriver());
        posting.navigateToPostingMenu();
        posting.validatePostingScreen();
        posting.addFilePosting(ConfigReader.getProperty("documentpostingpath"), Constants.FILEPOSTINGTITLE);
        posting.validatePostingAdded();
        posting.filterPosting(Constants.FILEPOSTINGTITLE);
        posting.validateDefaultEnwisenGroupAccess();
        posting.giveGroupAccess();
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
    private void basicUserSearchPostingAndSearchTitleKeywordContent() throws Exception {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("basicuser"), ConfigReader.getProperty("basicpassword"), ConfigReader
                .getProperty("organization"));
        Posting posting = new Posting(getDriver());
        posting.searchPosting(Constants.FILEPOSTINGTITLE);
        posting.validatePostingTitleKeywordContent();
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

    }

    @Test(priority = 7)
    private void validateExcludeFromSearchFunctionality() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.backButton();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.updateExcludeFromSearch();
        basePage.pageReload();
        posting.searchPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateExcludeFromSearchAndExpire();
    }

    @Test(priority = 8)
    private void validateExpirePosting() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
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
        posting.addFilePosting(ConfigReader.getProperty("mimetypepostingpath"), Constants.FILEPOSTINGTITLE+"MIME");
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
        posting.appliedTypeFilter("DOC");
        posting.fileUploadWhileUpdate(ConfigReader.getProperty("morethan10mbfilepostingpath"));
        posting.validateMoreThan10mbFilePostingNotification();
        posting.fileUploadWhileUpdate(ConfigReader.getProperty("mimetypepostingpath"));
        posting.filePostingUpdate();
        posting.validateMimePostingNotification();
    }

    @Test(priority = 12)
    private void validateLocationAdded() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToLocationMenu();
        posting.addLocation();
        posting.validatePostingAdded();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode"));
        posting.validateNewlyAddedLocation(ConfigReader.getProperty("locationname"), ConfigReader.getProperty("locationcode"), ConfigReader.getProperty("locationNote"));
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter("DOC");
        posting.validateAddedLocationOnPosting(ConfigReader.getProperty("locationname"));
    }

    @Test(priority = 13)
    private void validateLocationUpdated() throws IOException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
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
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter("DOC");
        posting.validateAddedLocationOnPosting(ConfigReader.getProperty("locationname") + ConfigReader.getProperty("updatemessage"));
    }

    @Test(priority = 14)
    private void validateDeleteLocation() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToLocationMenu();
        posting.openNewlyAddedLocation(ConfigReader.getProperty("locationcode") + ConfigReader.getProperty("updatemessage"));
        posting.deletePosting();
        posting.validatePostingDeleted();
        basePage.pageReload();
        posting.navigateToKbAdmin();
        posting.navigateToPostingMenu();
        posting.appliedTypeFilter("DOC");
        posting.validateDeleteLocationOnPosting(ConfigReader.getProperty("locationname") + ConfigReader.getProperty("updatemessage"));
    }

    @Test(priority = 15)
    private void validatePostingAuditReport() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
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
    }
    @Test(priority = 17)
    private void validateAllPostingReportForFolderTestCase() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToAllPosting();
        posting.appliedFilterInAllPostingReportForFolder(ConfigReader.getProperty("foldernameallposting&"));
        posting.validateAllPostingReportGridForFolder(ConfigReader.getProperty("postingname&"), ConfigReader.getProperty("foldernameallposting&"), ConfigReader.getProperty("postingname_"));
        posting.appliedFilterInAllPostingReportForFolder(ConfigReader.getProperty("foldernameallposting_"));
        posting.validateAllPostingReportGridForFolder(ConfigReader.getProperty("postingname_"), ConfigReader.getProperty("foldernameallposting_"), ConfigReader.getProperty("postingname&"));
    }

    @Test(priority = 18)
    private void validatePostingUsageReport() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        Posting posting = new Posting(getDriver());
        posting.navigateToKbAdmin();
        posting.navigateToPostingUsageMenu();
        posting.appliedFilterInPostingUsageReport();
        posting.validatePostingUsageReportGrid();
    }

    @Test(priority = 19)
    private void validatePostingImage() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
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
