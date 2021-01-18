package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.ConfigReader;
import util.Constants;


import java.io.IOException;

public class SmokeSuitePostingAnalytics extends Base{
    @Test(priority = 0)
    private void createTestData() throws InterruptedException, IOException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("sevenleveluser"), ConfigReader.getProperty("sevenleveluserpassword"), ConfigReader
                .getProperty("organization"));

        Posting posting = new Posting(getDriver());
        posting.searchPosting(ConfigReader.getProperty("searchtermforfrequentsearch"));
        Thread.sleep(5000);
    }

    @Test(priority = 1)
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

    @Test(priority = 2,enabled = false)
    private void filePostingAddSearchUpdateDelete() throws Exception {
        Posting posting = new Posting(getDriver());
        posting.addFilePosting(ConfigReader.getProperty("documentpostingpath"), Constants.FILEPOSTINGTITLE);
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.FILEPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.FILEPOSTINGTITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.FILEPOSTINGTITLE);
        posting.updatePosting(Constants.FILETITLEUPDATE);
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.FILETITLEUPDATE);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.FILETITLEUPDATE);
        basePage.navigateDefaultTab();
        posting.deletePosting();
    }

    @Test(priority = 3)
    private void messagePostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        Posting posting = new Posting(getDriver());
        posting.addMessagePosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.MESSAGEPOSTINGTITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.MESSAGEPOSTINGTITLE);
        posting.updatePosting(Constants.MESSAGETITLEUPDATE);
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.MESSAGETITLEUPDATE);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.MESSAGETITLEUPDATE);
        basePage.navigateDefaultTab();
        posting.deletePosting();

    }

    @Test(priority = 4)
    private void linkPostingAddSearchUpdateDelete() throws InterruptedException, IOException {
        Posting posting = new Posting(getDriver());
        posting.addLinkPosting();
        posting.validatePostingAdded();
        BasePage basePage = new BasePage(getDriver());
        basePage.openDuplicateTab();
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.LINKPOSTINGTITLE);
        posting.validateSearchedPosting(Constants.LINKPOSTINGTITLE);
        //posting.openSearchedPosting();
        basePage.navigateDefaultTab();
        posting.filterPosting(Constants.LINKPOSTINGTITLE);
        posting.updatePosting(Constants.LINKTITLEUPDATE);
        posting.validatePostingUpdated();
        posting.filterPosting(Constants.LINKTITLEUPDATE);
        basePage.switchAnotherTab();
        posting.searchPosting(Constants.LINKTITLEUPDATE);
        basePage.navigateDefaultTab();
        posting.deletePosting();
    }


    @Test(priority = 5)
    private void navigateToFrequentSearchMenu() throws Exception {

        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAnalytics();
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.navigateToFrequentSearchMenu();
    }


    @Test(priority = 6)
    private void exportFunctionality() throws Exception {
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.verifyExportFunctionality();
    }

    @Test(priority = 7, enabled = false)
    private void appliedTodayFilter() throws IOException, InterruptedException {
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.appliedLast2DaysFilter();
        frequentSearches.validateAppliedLast2DaysFilter();
        frequentSearches.verifyGraph();
    }

    @Test(priority = 8)
    private void navigateToExportAuditReportMenu() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAnalytics();
        ExportAuditLog exportAuditLog = new ExportAuditLog(getDriver());
        exportAuditLog.navigateToExportAuditLogMenu();
        exportAuditLog.verifyLabel();
    }

    @Test(priority = 9)
    private void appliedFilter() throws IOException, InterruptedException {
        ExportAuditLog exportAuditLog = new ExportAuditLog(getDriver());
        exportAuditLog.appliedLast2DaysFilter();
        exportAuditLog.verifiedAppliedFilter();
    }

    @Test(priority = 10)
    private void verifyExportFunctionality() throws IOException, InterruptedException {
        FrequentSearches frequentSearches= new FrequentSearches(getDriver());
        frequentSearches.verifyExportFunctionality();
    }

}
