package Execution;

import org.testng.annotations.Test;
import pages.*;
import util.ConfigReader;

import java.io.IOException;

public class AnalyticsScreenTestCase extends Base {

    @Test(priority = 0)
    private void login() throws InterruptedException, IOException {
        Login login = new Login(getDriver());
        login.LaunchApplication(getDriver());
        login.LoginBasicuser(getDriver(), ConfigReader.getProperty("sevenleveluser"), ConfigReader.getProperty("sevenleveluserpassword"), ConfigReader.getProperty("organization"));
        BasicNavigation basicNavigation = new BasicNavigation(getDriver());
        basicNavigation.SearchForBasicUser(ConfigReader.getProperty("searchtermforfrequentsearch"));
        login.LaunchApplication(getDriver());
        login.Loginpage(getDriver());
    }

    @Test(priority = 1, enabled = false)
    private void frequentSearches() throws Exception {
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAnalytics();
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.navigateToFrequentSearchMenu();
        frequentSearches.validateFrequentSearchMenu();
        basePage.verifyCSVExportFunctionality();
        frequentSearches.validateProcessingError();
        basePage.appliedLast2DaysFilter();
        frequentSearches.validateAppliedLast2DaysFilter();
        frequentSearches.verifyGraph();
        basePage.groupRadioButton();
        basePage.verifyHTMLExportFunctionality();
        basePage.appliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdate"), ConfigReader.getProperty("analyticsenddate"));
        frequentSearches.verifiedAppliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdate"), ConfigReader.getProperty("analyticsenddate"));
        basePage.verifyXMLExportFunctionality();
        basePage.appliedClearButton();
        frequentSearches.validateFrequentSearchMenu();
        basePage.verifyPDFExportFunctionality();
        frequentSearches.appliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdatefuture"),ConfigReader.getProperty("analyticsenddatefuture"));
        basePage.validateBlankGridExport();
        basePage.appliedClearDateRangeFilter();
        frequentSearches.verifiedAppliedDateRangeFilter(basePage.getFirstDateOfCurrentMonth(),basePage.getLastDayOfCurrentMonth());
        basePage.appliedFilter();
    }

    @Test(priority = 2)
    private void recentSearches() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(getDriver());
        basePage.pageReload();
        basePage.navigateToKbAnalytics();
        RecentSearches recentSearches = new RecentSearches(getDriver());
        recentSearches.navigateToRecentSearchMenu();
        recentSearches.validateRecentSearchMenu();
        basePage.verifyCSVExportFunctionality();
        recentSearches.validateProcessingError();
        basePage.appliedLast2DaysFilter();
        recentSearches.verifiedAppliedTimePeriodFilter(ConfigReader.getProperty("analyticsTimePeriod"));
        recentSearches.verifyGraph();
        basePage.groupRadioButton();
        basePage.verifyHTMLExportFunctionality();
        basePage.appliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdate"), ConfigReader.getProperty("analyticsenddate"));
        recentSearches.verifiedAppliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdate"), ConfigReader.getProperty("analyticsenddate"));
        basePage.verifyXMLExportFunctionality();
        basePage.appliedClearButton();
        recentSearches.validateRecentSearchMenu();
        basePage.verifyPDFExportFunctionality();
        recentSearches.appliedDateRangeFilter(ConfigReader.getProperty("analyticsstartdatefuture"),ConfigReader.getProperty("analyticsenddatefuture"));
        basePage.validateBlankGridExport();
        basePage.appliedClearDateRangeFilter();
        recentSearches.verifiedAppliedDateRangeFilter(basePage.getFirstDateOfCurrentMonth(),basePage.getLastDayOfCurrentMonth());
        basePage.appliedFilter();
    }


}
