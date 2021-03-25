package Execution;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.BasicNavigation;
import pages.FrequentSearches;
import pages.Login;
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

    @Test(priority = 1)
    private void frequentSearches() throws Exception {
        BasePage basePage = new BasePage(getDriver());
        basePage.navigateToKbAnalytics();
        FrequentSearches frequentSearches = new FrequentSearches(getDriver());
        frequentSearches.navigateToFrequentSearchMenu();
        frequentSearches.verifyCSVExportFunctionality();
        frequentSearches.validateProcessingError();
        frequentSearches.appliedLast2DaysFilter();
        frequentSearches.validateAppliedLast2DaysFilter();
        frequentSearches.verifyGraph();
        frequentSearches.groupRadioButton();
        frequentSearches.verifyHTMLExportFunctionality();
        frequentSearches.appliedDateRangeFilter();
        frequentSearches.verifiedAppliedDateRangeFilter();
        frequentSearches.verifyXMLExportFunctionality();
        frequentSearches.appliedClearButton();
        frequentSearches.validateFrequentSearchMenu();
        frequentSearches.verifyPDFExportFunctionality();
    }


}
