package Execution;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.*;
import util.ConfigReader;

import java.io.IOException;

@Listeners(listener.TestStatistics.class)
public class AnalyticsReport extends Base {

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
    private void navigateToFrequentSearchMenu() throws Exception {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAnalytics();
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.navigateToFrequentSearchMenu();
    }


    @Test(priority = 2)
    private void exportFunctionality() throws Exception {
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.verifyExportFunctionality();
    }

    @Test(priority = 3)
    private void appliedTodayFilter() throws IOException, InterruptedException {
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.appliedLast2DaysFilter();
        frequentSearches.validateAppliedLast2DaysFilter();
        frequentSearches.verifyGraph();
    }

    @Test(priority = 4)
    private void navigateToExportAuditReportMenu() throws IOException, InterruptedException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAnalytics();
        ExportAuditLog exportAuditLog = new ExportAuditLog(getDriver());
        exportAuditLog.navigateToExportAuditLogMenu();
        exportAuditLog.verifyLabel();
    }

    @Test(priority = 5)
    private void appliedFilter() throws IOException, InterruptedException {
        ExportAuditLog exportAuditLog = new ExportAuditLog(getDriver());
        exportAuditLog.appliedLast2DaysFilter();
        exportAuditLog.verifiedAppliedFilter();
    }

    @Test(priority = 6)
    private void verifyExportFunctionality() throws IOException, InterruptedException {
        FrequentSearches frequentSearches= new FrequentSearches(getDriver());
        frequentSearches.verifyExportFunctionality();
    }
}
